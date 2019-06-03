/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;
import java.util.Arrays;

/**
 *
 * @author As
 * @param <T>
 */
public class ArrayQueue<T>  implements Queue<T>{
    private T[] values;
    private int size, front;
    private int back;
   
    public ArrayQueue(){
        values =(T [ ]) new Object[5];
       
        size = 0;
        front = 0;
        back = 0;
     }
    public void enqueue(T value) {
        if(size==values.length){
            T[] newVals = (T[]) new Object[values.length*2];
            for(int l=0,m=0;
                    l<size;
                    l++,m=(m+1)%values.length){
                newVals[l]=values[m];
              }
            values = newVals;
            front = 0;
            back = size;
        }
        values[back]=value;
        back = (back+1)%values.length;
        size++;
    }

    @Override
    public T dequeue() throws Exception {
        if(size == 0){
            throw new Exception ("Sorry the queue is empty!");
        }
        T result = values[front];
        values[front]=null;
        front = (front+1)%values.length;
        size--;
        return result;
        
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
      
    
            values[5] =  (T)new Object[5];
            size = 0;
            back = 0;
        front = 0;
       
    }
    @Override
    public String toString(){
         String result = "[";
          
             for(int j =0,k = front;
                    j<size;
                    j++,k = (k+1)%values.length){
                 result+="  "+values[k];
             }       
             
            
          return result+"]";
    
}}

