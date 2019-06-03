/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author As
 */
public class LLQueueMap<K, V> implements Map<K, V> {

    private LinkedListQueue<KeyValuePair<K, V>> pairs;

    public LLQueueMap() {
        pairs = new LinkedListQueue();
    }

    @Override
    public void define(K key, V value) {
        KeyValuePair<K, V> pair = null;
        int size = pairs.getSize();

        for (int i = 0; i < size; i++) {
            try {
                pair = pairs.dequeue();
            } catch (Exception ex) {
            }
            if (key.equals(pair.getKey())) {
                pairs.enqueue(new KeyValuePair(key, value));
                return;
            } else {
                pairs.enqueue(pair);
            }
        }
        pairs.enqueue(new KeyValuePair(key, value));
    }

    @Override
    public V getValue(K key) {
        int size = pairs.getSize();
        KeyValuePair<K, V> pair = null;
        for (int i = 0; i < size; i++) {
            try {
                pair = pairs.dequeue();
            } catch (Exception ex) {
            }
            if (key.equals(pair.getKey())) {
                pairs.enqueue(pair);
                return pair.getValue();
            } else {
                pairs.enqueue(pair);
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int size = pairs.getSize();
        KeyValuePair<K, V> pair = null;
        for (int i = 0; i < size; i++) {
            try {
                pair = pairs.dequeue();
            } catch (Exception ex) {
            }
            if (key.equals(pair.getKey())) {
                return pair.getValue();
            } else {
                pairs.enqueue(pair);
            }
        }
        return null;
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (pairs.getSize() == 0) {
            throw new Exception("The Map is empty!");
        } else {
            return pairs.dequeue();
        }
    }

    @Override
    public int getSize() {
        return pairs.getSize();
    }

    @Override
    public void clear() {
        pairs = new LinkedListQueue();
    }

    @Override
    public String toString() {
        return pairs.toString() + "\nSize:" + pairs.getSize();
    }

}
