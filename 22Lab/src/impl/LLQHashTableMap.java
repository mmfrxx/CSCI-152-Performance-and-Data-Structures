/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.HashTableMap;
import static java.lang.Math.sqrt;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author As
 */
public class LLQHashTableMap<K extends Comparable, V> implements HashTableMap<K, V> {

    private LinkedListQueue<KeyValuePair<K, V>>[] backets;
    private int size;
    private int branch;

    public LLQHashTableMap(int branch) {
        backets = (LinkedListQueue<KeyValuePair<K, V>>[]) new LinkedListQueue[branch];
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
        if (backets[hash] == null) {
            backets[hash] = new LinkedListQueue();
            backets[hash].enqueue(new KeyValuePair(key, value));
            size++;
        } else {
            for (int i = 0; i < backets[hash].getSize(); i++) {
                KeyValuePair<K, V> term = null;
                try {
                    term = backets[hash].dequeue();
                } catch (Exception ex) {
                }
                if (term.getKey().equals(key)) {
                    backets[hash].enqueue(new KeyValuePair(key, value));
                    return;
                } else {
                    backets[hash].enqueue(term);
                }

            }
            backets[hash].enqueue(new KeyValuePair(key, value));
            size++;
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
        for (int i = 0; i < backets[hash].getSize(); i++) {
            KeyValuePair<K, V> term = null;
            try {
                term = backets[hash].dequeue();
            } catch (Exception ex) {
            }
            if (term.getKey().equals(key)) {
                V res = term.getValue();
                backets[hash].enqueue(term);
                return res;
            } else {
                backets[hash].enqueue(term);
            }

        }
        return null;
    }

    @Override
    public V remove(K key) {
        int hash = key.hashCode();
        if (hash >= 0) {
            hash = hash % branch;
        } else if (hash < 0) {
            hash = -hash % branch;
        }
        int size0 = backets[hash].getSize();
        for (int i = 0; i < size0; i++) {
            try {
                KeyValuePair<K, V> val = backets[hash].dequeue();
                if (val.getKey().equals(key)) {
                    size--;
                    return val.getValue();
                } else {
                    backets[hash].enqueue(val);
                }
            } catch (Exception ex) {
            }
        }
        return null;
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (size == 0) {
            throw new Exception("The LLQHashTableMAP is empty.");
        } else {
            for (int i = 0; i < branch; i++) {
                if (backets[i].getSize() != 0) {
                    size--;
                    return backets[i].dequeue();
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
        backets = (LinkedListQueue<KeyValuePair<K, V>>[]) new LinkedListQueue[branch];
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

    public String toString() {

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

}
