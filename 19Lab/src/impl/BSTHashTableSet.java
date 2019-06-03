/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.HashTableSet;
import adt.Set;
import static java.lang.Math.sqrt;

/**
 *
 * @author As
 * @param <T>
 */
public class BSTHashTableSet<T extends Comparable> implements HashTableSet<T> {

    private BSTSet<T>[] backets;
    private int size;
    int branch = 0;

    public BSTHashTableSet(int branch) {
        backets = (BSTSet<T>[]) new BSTSet[branch];
        size = 0;
        this.branch = branch;
    }

    @Override
    public void add(T value) {
        if (!contains(value)) {
            int hash = value.hashCode();
            if (hash >= 0) {
                hash = hash % branch;

            } else if (hash < 0) {
                hash = -hash % branch;
            }

            if (backets[hash] == null) {
                backets[hash] = new BSTSet();
                backets[hash].add(value);
                size++;
            } else {
                backets[hash].add(value);
                size++;
            }
        }
    }

    @Override
    public boolean contains(T value) {
        int hash = value.hashCode();
        boolean result = false;
        if (hash >= 0) {
            hash = hash % branch;
        } else if (hash < 0) {
            hash = -hash % branch;
        }
        if (size == 0) {
            return false;
        }

        if (backets[hash] == null) {
            return false;
        }
        return backets[hash].contains(value);
    }

    @Override
    public boolean remove(T value) {
        if (contains(value)) {
            int hash = value.hashCode();
            if (hash >= 0) {
                hash = hash % branch;
            } else if (hash < 0) {
                hash = -hash % branch;
            }
            backets[hash].remove(value);
        }
        return false;
    }

    @Override
    public T removeAny() throws Exception {
        if (size == 0) {
            throw new Exception("The BSTHashTableSet is empty.");
        } else {
            for (int i = 0; i < branch; i++) {
                if (backets[i].getSize() != 0 || backets[i] != null) {
                    size--;
                    return backets[i].removeAny();
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
        backets = (BSTSet<T>[]) new BSTSet[branch];
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
        return backets[index].getSize();
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
                stdev = stdev + ((double) backets[i].getSize() - arsum) * ((double) backets[i].getSize() - arsum);
            } else {
                stdev = stdev + arsum * arsum;
            }
        }
        return (double) sqrt(stdev / branch);
    }

    @Override
    public String bucketsToString() {
        String result = null;
        for (int i = 0; i < branch; i++) {
            if (backets[i] == null) {
            } else {
                result += backets[i] + "\n";
            }
        }
        result += "Size:" + size;
        return result;
    }

}
