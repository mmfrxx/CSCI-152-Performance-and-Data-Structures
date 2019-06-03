/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;

/**
 *
 * @author As
 */
public class BST2Set<T extends Comparable> implements Set<T> {

    private OnOffTreeNode<T> root;
    private int size;

    @Override
    public void add(T value) {
        if (!active(root, value)) {
            if (size == 0) {
                root = new OnOffTreeNode(value);
                size++;
            } else {
                addHelper(root, value);
            }
        }
    }

    private void addHelper(OnOffTreeNode<T> node, T value) {
        if (contains(value)) {
            Switch(root, value);
        } else {
            if (node.getValue().compareTo(value) > 0) {
                if (node.getLeft() == null) {
                    node.setLeft(new OnOffTreeNode(value));
                    size++;
                } else {
                    addHelper(node.getLeft(), value);
                }
            } else {
                if (node.getRight() == null) {
                    node.setRight(new OnOffTreeNode(value));
                    size++;
                } else {
                    addHelper(node.getRight(), value);
                }
            }
        }
    }

    @Override
    public boolean contains(T value) {
        return containsHelper(root, value);
    }

    private void Switch(OnOffTreeNode<T> node, T value) {
        if (node.getValue().equals(value)) {
            node.setActive(true);
            size++;
            return;
        }
        if (node.getValue().compareTo(value) > 0) {
            Switch(node.getLeft(), value);
        } else {
            Switch(node.getRight(), value);
        }
    }

    private boolean containsHelper(OnOffTreeNode<T> node, T value) {
        boolean result;
        if (node == null) {
            return false;
        }
        if (node.getValue().compareTo(value) > 0) {
            result = containsHelper(node.getLeft(), value);
        } else {
            result = containsHelper(node.getRight(), value);
        }
        if (node.getValue().equals(value)) {
            result = true;
        }
        return result;
    }

    private boolean active(OnOffTreeNode<T> node, T value) {
        boolean result;
        if (node == null) {
            return false;
        } else if (node.getValue().compareTo(value) > 0) {
            result = active(node.getLeft(), value);
        } else if (node.getValue().compareTo(value) < 0) {
            result = active(node.getRight(), value);
        } else {
            return node.isActive();
        }
        return result;
    }

    @Override
    public boolean remove(T value) {
        OnOffTreeNode<T> node = root;
        if (active(root, value)) {
            while (node != null) {
                if (node.getValue().equals(value)) {
                    node.setActive(false);
                    size--;
                    return true;
                } else {
                    if (node.getValue().compareTo(value) > 0) {
                        node = node.getLeft();
                    } else if (node.getValue().compareTo(value) < 0) {
                        node = node.getRight();
                    }
                }
            }
        }
        return false;
    }

    @Override
    public T removeAny() throws Exception {
        OnOffTreeNode<T> node = root;
        T value = null;
        int size = getSize();
        if (size == 0) {
            throw new Exception("The set is empty");
        }
        T x = removeAnyHelper(root);
        return x;
    }

    public T removeAnyHelper(OnOffTreeNode<T> node) {
        if (node == null) {
            return null;
        }
        if (node.isActive()) {
            size--;
            node.setActive(false);
            return node.getValue();
        }
        T removedNode = removeAnyHelper(node.getLeft());
        if (removedNode != null) {
            return removedNode;
        } else {
            return removeAnyHelper(node.getRight());
        }
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

    public String toString() {
        return toStringHelper(root) + "\nSize " + getSize();
    }

    private String toStringHelper(OnOffTreeNode<T> node) {
        if (node == null) {
            return " ";
        } else if (!node.isActive()) {
            return toStringHelper(node.getLeft()) + toStringHelper(node.getRight());
        } else {
            return toStringHelper(node.getLeft()) + node + toStringHelper(node.getRight());
        }
    }
}
