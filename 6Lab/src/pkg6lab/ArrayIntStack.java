/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6lab;

import Interface.IntStack;
import java.util.Arrays;

/**
 *
 * @author As
 */
public class ArrayIntStack implements IntStack{
    private int[] values;
    private int size;
    private int[] values1;
     private int[] values2;
    
    public ArrayIntStack(){
            values = new int[10];
            size = 0;
            values1 = new int[20];
            values2 = new int[40];
    }

    @Override
    public void push(int value) {
       
             if(size >=0 && size<10){
            values[size] = value;
             size++;
        }
          else if(size>=10&&size<20){
                    for(int i =0; i<10; i++){
                             values1[i] = values[i];
                    }
           values1[size] = value;
           size++;
        } else if(size>=20&&size<40){
                    for(int i =0; i<20; i++){
                             values2[i] = values1[i];
                    }
           values2[size] = value;
           size++;
        }
             
    }

    @Override
    public int pop() throws Exception {
        if (size>0 && size <11){
        int result = values[size-1];
        
        values[size-1]=0;
         size--;
        return result;
        } 
        else  if(size>=10 &&size<21){
           int result = values1[size-1];
           values1[size-1]=0;
         size--;
        
        return result;
        }else  if(size>=20 &&size<40){
           int result = values2[size-1];
           values2[size-1]=0;
         size--;
        
        return result;
        }else if(size == 0){
           throw new Exception ("The stack does not contain anything!");
        }
       return 5;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        for(int i = 0;i < 10; i++){
            values[i] = 0;
            size = 0;
        }
         for(int i = 0;i < 20; i++){
            values1[i] = 0;
            size = 0;
        }
          for(int i = 0;i < 40; i++){
            values2[i] = 0;
            size = 0;
        }
        
        size = 0;
    }
        
    public String toString(){
          if(size <10){
              return "bottom"+Arrays.toString(values) +"top";
          }else if(size>=10&&size<20){
              return "bottom"+Arrays.toString(values1) +"top";
          } else if(size>=20&&size<40){
              return "bottom"+Arrays.toString(values2) +"top";
          } 
          return "hi";
    }
    
}
