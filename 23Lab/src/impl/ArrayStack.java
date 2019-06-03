/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;
import java.util.Arrays;
/**
 *
 * @author As
 */
public class ArrayStack<T> implements Stack<T>{
    private T[] values;
    public int size;
  
    
    public ArrayStack(){
            values = (T[]) new Object[10];
            size = 0;
           
    }

    @Override
    public void push(T value) {
       if (size==values.length){
           T[]newVals = (T[]) new Object[values.length*2];
           for(int j = 0;
                   j<size;
                   j++){
               newVals[j]=values[j];
           }
           values = newVals;
       }
       values[size]=value;
       size++;
              
    }

    @Override
    public T pop() throws Exception {
         if(size == 0){
           throw new Exception ("The stack does not contain anything!");
        }
        T result = values[size-1];
        
        values[size-1]= null;
         size--;
        return result;
     
       
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        
            values = (T[]) new Object[5];
            
            size = 0;
        
        
    }
        
    public String toString(){
       String result = "[";
          
             for(int j =0,k = 0;
                    j<size;
                    j++,k++){
                 result+="  "+values[k];
             }       
             
            
          return result+"]";
   
    
}}
