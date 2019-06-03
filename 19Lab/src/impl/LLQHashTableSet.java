/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.HashTableSet;
import adt.Set;
import static java.lang.Math.sqrt;
import java.util.Arrays;

/**
 *
 * @author As
 * @param <T> make the code work for every type of an object
 */
public class LLQHashTableSet<T> implements HashTableSet<T> {

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
            if(backets[i]==null){   
            }else{
              result+=  backets[i] + "\n";
            }}
        result+="Size:" +  size;
        return result;
    }

    @Override
    public int getNumberOfBuckets() {
        return branch;
    }

    @Override
    public int getBucketSize(int index) throws Exception {
        if(index>=branch){
            throw new Exception ("The entered index for LLQHashTableSet is too  big. It should be less than "+branch);
        }
        return backets[index].getSize();
    }

    @Override
    public double getLoadFactor() {
        return (double)size/branch;
    }

    @Override
    public double getBucketSizeStandardDev() {
        double arsum=(double)size/branch;
        double stdev=0.0;
       for(int i =0; i < branch; i++){
           if(backets[i]!= null){
           stdev=stdev+((double)backets[i].getSize()-arsum)*((double)backets[i].getSize()-arsum);
       }else{
               stdev=stdev+arsum*arsum;
           }}
       return (double)sqrt(stdev/branch);
    }

    @Override
    public String bucketsToString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
