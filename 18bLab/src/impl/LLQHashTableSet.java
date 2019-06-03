/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;
import java.util.Arrays;

/**
 *
 * @author As
 * @param <T> make the code work for every type of an object
 */
public class LLQHashTableSet<T> implements Set<T> {

    private LinkedListQueue<T>[] backets;
    private int size;
    private int branch;

    public LLQHashTableSet(int branch) {
        backets = (LinkedListQueue<T>[]) new LinkedListQueue[branch];
        size = 0;
        this.branch=branch;
    }

    @Override
    public void add(T value) {
        if (!contains(value)) {
            int hash = value.hashCode();
            if (hash >= 0) {
                hash = hash %branch;

            } else if (hash < 0) {
                hash = -hash % branch;
            }
            
                if (backets[hash] == null) {
                    backets[hash] = new LinkedListQueue();
                    backets[hash].enqueue(value);
                    size++;
                } else {
                    backets[hash].enqueue(value);
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
            int size0 = backets[hash].getSize();
            for (int i = 0; i < size0; i++) {
                try {
                    T val = backets[hash].dequeue();
                    backets[hash].enqueue(val);
                    if (val.equals(value)) {
                        return true;
                    }
                } catch (Exception ex) { //This should not happen
                }
            }
            return false;
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

            int size0 = backets[hash].getSize();
            for (int i = 0; i < size0; i++) {
                try {
                    T val = backets[hash].dequeue();
                    if (val.equals(value)) {
                        size--;
                        return true;
                    } else {
                        backets[hash].enqueue(val);
                    }
                } catch (Exception ex) { //This should not happen
                }
            }
        }
        return false;
    }

    @Override
    public T removeAny() throws Exception {
        if (size == 0) {
            throw new Exception("The LLQHashTableSet is empty.");
        } else {
            for(int i=0; i<branch; i++){
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
        backets = (LinkedListQueue<T>[]) new LinkedListQueue[branch];
        size = 0;
    }

    @Override
    public String toString() {
        String result=null;
        for(int i=0; i<branch; i++){
              result+=  backets[i] + "\n";
            }
        result+="Size:" +  size;
        return result;
    }

}
