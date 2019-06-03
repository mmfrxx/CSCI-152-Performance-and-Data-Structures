/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.HashTableMap;
import static java.lang.Math.sqrt;


/**
 *
 * @author As
 */
public class BSTHashTableMap<K extends Comparable, V> implements HashTableMap<K, V> {

    private TreeNode<KeyValuePair<K, V>>[] backets;
    private int[] size1;
    private int size;
    int branch = 0;
    TreeNode<KeyValuePair<K, V>> root = null;

    public BSTHashTableMap(int branch) {
        backets = (TreeNode<KeyValuePair<K, V>>[]) new TreeNode[branch];
        size1 = new int[branch];
        size = 0;
        this.branch = branch;
    }

    @Override
    public void define(K key, V value) {
        int hash = key.hashCode();

        if (hash >= 0) {
            hash = hash % branch;
        } else if (hash < 0) {
            hash = -hash % branch;
        }
        size1[hash] = 0;
        if (backets[hash] == null) {
            backets[hash] = new TreeNode(new KeyValuePair(key, value));
            size++;
            size1[hash]++;
        } else {
            defineHelper(backets[hash], key, value, size1[hash]);
        }
    }

    private void defineHelper(TreeNode<KeyValuePair<K, V>> node, K key, V value, int sizee) {
        if (node.getValue().getKey().compareTo(key) > 0) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode(new KeyValuePair(key, value)));
                size++;
                sizee++;
            } else {
                defineHelper(node.getLeft(), key, value, sizee);
            }
        } else if (node.getValue().getKey().compareTo(key) == 0) {
            node.getValue().setValue(value);
        } else {
            if (node.getRight() == null) {
                node.setRight(new TreeNode(new KeyValuePair(key, value)));
                size++;
                sizee++;
            } else {
                defineHelper(node.getRight(), key, value, sizee);
            }
        }
    }

    @Override
    public V getValue(K key) {
        int hash = key.hashCode();
        if (hash >= 0) {
            hash = hash % branch;
        } else if (hash < 0) {
            hash = -hash % branch;
        }
        if (backets[hash] == null) {
            return null;
        } else {
            return gvHelper(backets[hash], key);
        }
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
        int hash = key.hashCode();
        if (hash >= 0) {
            hash = hash % branch;
        } else if (hash < 0) {
            hash = -hash % branch;
        }
        if (backets[hash] == null) {
            return null;
        } else {
            TreeNode<KeyValuePair<K, V>> parent = null;
            TreeNode<KeyValuePair<K, V>> node = backets[hash];
            V res = null;
            if (size == 0) {
                return null;
            }
            while (node != null) {
                if (node.getValue().getKey().equals(key)) {
                    if (node.getLeft() == null && node.getRight() == null) {
                        if (parent == null) {
                            res = backets[hash].getValue().getValue();
                            backets[hash] = null;
                            size--;
                            size1[hash]--;
                            return res;
                        } else {
                            res = node.getValue().getValue();
                            node = null;
                            size--;
                            size1[hash]--;
                            return res;
                        }
                    } else if (node.getLeft() == null) {
                        if (parent == null) {
                            res = backets[hash].getValue().getValue();
                            size--;
                            size1[hash]--;
                            backets[hash] = node.getRight();
                            return res;
                        } else {
                            res = node.getValue().getValue();
                            node = node.getRight();
                            size--;
                            size1[hash]--;
                            return res;
                        }
                    } else if (node.getRight() == null) {
                        if (parent == null) {
                            res = backets[hash].getValue().getValue();
                            backets[hash] = node.getLeft();
                            size--;
                            size1[hash]--;
                            return res;
                        } else {
                            res = node.getValue().getValue();
                            node = node.getLeft();
                            size--;
                            size1[hash]--;
                            return res;
                        }
                    } else if (node.getLeft() != null && node.getRight() != null) {

                        TreeNode<KeyValuePair<K, V>> parent1 = node;
                        TreeNode<KeyValuePair<K, V>> minleaf = node.getRight();

                        if (minleaf.getLeft() == null) {
                            res = minleaf.getValue().getValue();
                            node.setValue(minleaf.getValue());
                            node.setRight(minleaf.getRight());
                            size--;
                            size1[hash]--;
                            return res;
                        }

                        while (minleaf.getLeft() != null) {
                            parent1 = minleaf;
                            minleaf = minleaf.getLeft();
                        }

                        if (minleaf.getLeft() == null) {
                            if (minleaf.getRight() == null) {
                                res = minleaf.getValue().getValue();
                                node.setValue(minleaf.getValue());
                                minleaf = null;
                                size--;
                                size1[hash]--;
                                return res;
                            } else {
                                res = node.getValue().getValue();
                                node.setValue(minleaf.getValue());
                                minleaf = minleaf.getRight();
                                size--;
                                size1[hash]--;
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
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (size == 0) {
            throw new Exception("The BSTHTMAP is empty.");
        } else {
            for (int i = 0; i < branch; i++) {
                if (size1[i] != 0 || backets[i] != null) {
                    KeyValuePair<K, V> res = backets[i].getValue();
                    remove(backets[i].getValue().getKey());
                    return res;
                }
            }
        }
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        backets = (TreeNode<KeyValuePair<K, V>>[]) new TreeNode[branch];
        size = 0;
    }

    @Override
    public int getNumberOfBuckets() {
        return branch;
    }

    @Override
    public int getBucketSize(int index) throws Exception {
        if (index >= branch) {
            throw new Exception("The entered index for LLQHashTableSet is too  big. It should be less than " + branch);
        }
        return size1[index];
    }

    @Override
    public double getLoadFactor() {
        return (double) size / branch;
    }

    @Override
    public double getBucketSizeStandardDev() {
        double arsum = (double) size / branch;
        double stdev = 0.0;
        for (int i = 0; i < branch; i++) {
            if (backets[i] != null) {
                stdev = stdev + ((double) size1[i] - arsum) * ((double) size1[i] - arsum);
            } else {
                stdev = stdev + arsum * arsum;
            }
        }
        return (double) sqrt(stdev / branch);
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < branch; i++) {
            if (backets[i] == null) {
            } else {
                result += toStringHelper(backets[i]) + "\n";
            }
        }
        result += "Size:" + size;
        return result;
    }

    @Override
    public String bucketsToString() {
        String result = "";

        for (int i = 0; i < branch; i++) {
            if (backets[i] == null) {
            } else {
                result += backets[i].toString() + "\n";
            }
        }
        result += "Size:" + size;
        return result;
    }

    private String toStringHelper(TreeNode<KeyValuePair<K, V>> node) {
        if (node == null) {
            return " ";
        }
        return toStringHelper(node.getLeft()) + node + toStringHelper(node.getRight());
    }
}
