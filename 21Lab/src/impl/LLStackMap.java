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
public class LLStackMap<K, V> implements Map<K, V> {
     private LinkedListStack<KeyValuePair<K, V>> pairs;
     
     public LLStackMap() {
        pairs = new LinkedListStack();
    }
     
    @Override
    public void define(K key, V value) {
        KeyValuePair<K, V> pair = null;
        int size = pairs.getSize();
        LinkedListStack<KeyValuePair<K, V>> pairs1 = new LinkedListStack();
        V result = null;
        boolean bool =false;

        for (int i = 0; i < size; i++) {
            try {
                pair = pairs.pop();
            } catch (Exception ex) {
            }
            if (key.equals(pair.getKey())) {
                pairs1.push(new KeyValuePair(key, value));
                bool =true;
            } else {
                pairs1.push(pair);
            }
        }
        size = pairs1.getSize();
        for (int i = 0; i < size; i++) {
            try {
                pairs.push(pairs1.pop());
            } catch (Exception ex) {
            }}
        if(!bool){
        pairs.push(new KeyValuePair(key, value));
        }
    }

    @Override
    public V getValue(K key) {
        LinkedListStack<KeyValuePair<K, V>> pairs1 = new LinkedListStack();
        int size = pairs.getSize();
        KeyValuePair<K, V> pair = null;
        V result = null;

        for (int i = 0; i < size; i++) {
            try {
                pair = pairs.pop();
            } catch (Exception ex) {
            }
            if (key.equals(pair.getKey())) {
                result = pair.getValue();
                 pairs1.push(pair);
            } else {
                pairs1.push(pair);
            }
        }
        for (int i = 0; i < size; i++) {
            try {
                pairs.push(pairs1.pop());
            } catch (Exception ex) {
            }

        }
        return result;
    }

    @Override
    public V remove(K key) {
        LinkedListStack<KeyValuePair<K, V>> pairs1 = new LinkedListStack();
        int size = pairs.getSize();
        KeyValuePair<K, V> pair = null;
        V result = null;

        for (int i = 0; i < size; i++) {
            try {
                pair = pairs.pop();
            } catch (Exception ex) {
            }
            if (key.equals(pair.getKey())) {
                result = pair.getValue();
            } else {
                pairs1.push(pair);
            }
        }
        size = pairs1.getSize();
        for (int i = 0; i < size; i++) {
            try {
                pairs.push(pairs1.pop());
            } catch (Exception ex) {
            }
        }
        return result;
    }


    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (pairs.getSize() == 0) {
            throw new Exception("The Map is empty!");
        } else {
            return pairs.pop();
        }
    }

    

    @Override
    public int getSize() {
        return pairs.getSize();
    }

    @Override
    public void clear() {
        pairs = new LinkedListStack();
    }
    
    @Override
    public String toString() {
        return pairs.toString() + "\nSize:" + pairs.getSize();
    }
    
}
