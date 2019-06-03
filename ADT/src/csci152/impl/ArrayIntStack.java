/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci152.impl;

import csci152.adt.IntStack;
import java.util.Arrays;
/**
 *
 * @author As
 */
public class ArrayIntStack implements IntStack{
    private int[] values;
    public int size;
  
    
    public ArrayIntStack(){
            values = new int[10];
            size = 0;
           
    }

    @Override
    public void push(int value) {
       if (size==values.length){
          int[] newVals = new int[values.length*2];
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
    public int pop() throws Exception {
         if(size == 0){
           throw new Exception ("The stack does not contain anything!");
        }
        int  result = values[size-1];
        
        values[size-1]= 0;
         size--;
        return result;
     
       
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        
            values =  new int[5];
            
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
