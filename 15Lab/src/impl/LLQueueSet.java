/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author As
 */
public class LLQueueSet<T> implements Set<T>{
    LinkedListQueue<T>  queue = new LinkedListQueue();
    @Override
    public void add(T value) {
        if (!contains(value)){
            queue.enqueue(value);
        }
    }

    @Override
    public boolean contains(T value) {
       for(int i=0; i<queue.getSize();i++){
           try {
               T x = queue.dequeue();
               queue.enqueue(x);
               if(x.equals(value)){
                   return true;
               }
              
           } catch (Exception ex) {            
           }        
}
       return false;
    }

    @Override
    public boolean remove(T value) {
        int size = queue.getSize();
         T x = null ;
         boolean result = false;
        if(contains(value)){
            for(int i=0; i<size; i++){
                try {
                     x = queue.dequeue();
                } catch (Exception ex) {
                }
                if(x.equals(value)){        
                    result = true; 
                }else{
                    queue.enqueue(x);
                   
                }
        }
    }return result;
    }

    @Override
    public T removeAny() throws Exception {
        if(queue.getSize()==0){
            throw new Exception ("The set is empty!");
        }
        return queue.dequeue();
    }

    @Override
    public int getSize() {
       return queue.getSize();
    }

    @Override
    public void clear() {
        queue.clear();
    }
    
    public String toString(){
        return queue.toString();
    }
}
