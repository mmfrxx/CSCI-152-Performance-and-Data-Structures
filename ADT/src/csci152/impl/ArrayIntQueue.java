/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.IntQueue;
import java.util.Arrays;

/**
 *
 * @author As
 */
public class ArrayIntQueue  implements IntQueue{
    private int[] values;
    private int size, front;
    private int back;
   
    public ArrayIntQueue(){
        values = new int[5];
       
        size = 0;
        front = 0;
        back = 0;
     }
    public void enqueue(int value) {
        if(size==values.length){
            int[] newVals = new int[values.length*2];
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
    public int dequeue() throws Exception {
        if(size == 0){
            throw new Exception ("Sorry the queue is empty!");
        }
        int result = values[front];
        values[front]=0;
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
      
    
            values = new int[5];
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


