/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Map;

/**
 *
 * @author As
 */
public class BSTMap<K extends Comparable, V> implements Map<K, V> {

    private TreeNode<KeyValuePair<K, V>> root;
    private int size;

    public BSTMap() {
        root = null;
        size = 0;
    }

    @Override
    public void define(K key, V value) {
        TreeNode<KeyValuePair<K, V>> node = root;
        if (root == null) {
            root = new TreeNode(new KeyValuePair(key, value));
            size++;
        } else {
            defineHelper(root, key, value);
        }
    }

    private void defineHelper(TreeNode<KeyValuePair<K, V>> node, K key, V value) {
        if (node.getValue().getKey().compareTo(key) > 0) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode(new KeyValuePair(key, value)));
                size++;
            } else {
                defineHelper(node.getLeft(), key, value);
            }
        } else if (node.getValue().getKey().compareTo(key) == 0) {
            node.getValue().setValue(value);
        } else {
            if (node.getRight() == null) {
                node.setRight(new TreeNode(new KeyValuePair(key, value)));
                size++;
            } else {
                defineHelper(node.getRight(), key, value);
            }
        }
    }

    @Override
    public V getValue(K key) {
        if (root == null) {
            return null;
        }
        return gvHelper(root, key);
    }

    private V gvHelper(TreeNode<KeyValuePair<K, V>> node, K key) {
        if (node.getValue().getKey().compareTo(key) > 0) {
            if (node.getLeft() == null) {
                return null;
            } else {
                return gvHelper(node.getLeft(), key);
            }
        } else if (node.getValue().getKey().compareTo(key) == 0) {
            return node.getValue().getValue();
        } else {
            if (node.getRight() == null) {
                return null;
            } else {
                return gvHelper(node.getRight(), key);
            }
        }
    }

    @Override
    public V remove(K key) {
        TreeNode<KeyValuePair<K, V>> parent = null;
        TreeNode<KeyValuePair<K, V>> node = root;
        V res = null;
        if (size == 0) {
            return null;
        }
        while (node != null) {
            if (node.getValue().getKey().equals(key)) {
                if (node.getLeft() == null && node.getRight() == null) {
                    if (parent == null) {
                        res = root.getValue().getValue();
                        size--;
                        root = null;
                        return res;
                    } else {
                        res = node.getValue().getValue();
                        node = null;
                        size--;
                        return res;
                    }
                } else if (node.getRight() == null) {
                    if (parent == null) {
                        res = root.getValue().getValue();
                        root = node.getLeft();
                        size--;
                        return res;
                    } else {
                        res = node.getValue().getValue();
                        node = null;
                        size--;
                        return res;
                    }
                } else if (node.getLeft() == null) {
                    if (parent == null) {
                        res = root.getValue().getValue();
                        size--;
                        root = node.getRight();
                        return res;
                    } else {
                        res = node.getValue().getValue();
                        node = node.getRight();
                        size--;
                        return res;
                    }
                } else if (node.getLeft() != null && node.getRight() != null) {

                    TreeNode<KeyValuePair<K, V>> minleaf = node.getRight();

                    if (minleaf.getLeft() == null) {
                        res = node.getValue().getValue();
                        node.setValue(minleaf.getValue());
                        node.setRight(minleaf.getRight());
                        size--;
                        return res;
                    }

                    while (minleaf.getLeft() != null) {
                        minleaf = minleaf.getLeft();
                    }

                    if (minleaf.getLeft() == null) {
                        if (minleaf.getRight() == null) {
                            res = node.getValue().getValue();
                            node.setValue(minleaf.getValue());
                            minleaf = null;
                            size--;
                            return res;
                        } else {
                            res = node.getValue().getValue();
                            node.setValue(minleaf.getValue());
                            minleaf = minleaf.getRight();
                            size--;
                            return res;
                        }
                    }
                }
            }
            if (node.getValue().getKey().compareTo(key) < 0) {
                parent = node;
                node = node.getRight();
            } else if (node.getValue().getKey().compareTo(key) > 0) {
                parent = node;
                node = node.getLeft();
            } else if (node.getLeft() == null && !node.getValue().getKey().equals(key) && node.getLeft() == null && node.getRight() == null) {
                return null;
            }
        }
        return null;
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (size == 0) {
            throw new Exception("The set is empty");
        }
        KeyValuePair<K, V> res = root.getValue();
        remove(root.getValue().getKey());
        return res;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public String toString() {
        return toStringHelper(root) + "\nSIZE: " + size;
    }
    
    private String toStringHelper(TreeNode<KeyValuePair<K, V>> node) {
        if (node == null) {
            return " ";
        }
        return toStringHelper(node.getLeft()) + node + toStringHelper(node.getRight());
    }
}
