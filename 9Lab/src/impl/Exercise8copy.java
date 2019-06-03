/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;
import adt.Queue;
import adt.Stack;


/**
 *
 * @author As
 * @param <T>
 */
public class Exercise8copy<T>{
    private int size;
    public Exercise8copy(){
        size = 0;
        
    }
            
     public static Stack copyStack(Stack<Integer> orig){
         ArrayStack<Integer> fakereverse = new ArrayStack();
         ArrayStack<Integer> fake = new ArrayStack();
        int size;
         size = orig.getSize();
        
         
for(int i = 0; i <size; i++){
            try{
                fakereverse.push(orig.pop());
            }catch( Exception ex){
                System.out.println(ex.getMessage());
            }
           }
         
         for(int i = 0;i < size; i++){
            try{
                fake.push(fakereverse.pop());
            }catch( Exception ex){
                System.out.println(ex.getMessage());
            }
           }
        return fake;
        
          }
     
     public static Queue copyQueue(Queue<Integer> orig){
         ArrayQueue<Integer> que = new ArrayQueue();
         int size;
         size = orig.getSize();
         for(int i = 0;i < size; i++){
            try{
                que.enqueue(orig.dequeue());
            }catch( Exception ex){
                System.out.println(ex.getMessage());
            }
           }
        return que;
         
     }
     
     public static void insert(Stack st, int pos, int val){
     
         
         ArrayStack<Integer> fakereverse = new ArrayStack();
         ArrayStack<Integer> fake = new ArrayStack();
        int size;
         size = st.getSize();
        
         
for(int i = 0; i <size; i++){
           try{
                fakereverse.push((Integer) st.pop());
            }catch( Exception ex){
                System.out.println(ex.getMessage());
            }
           }
         
         for(int i = 0;i < size-1/*I used here "size -1" because I will use fakereverse in just 
                 if but not else if therefore at the end the size of fakereverse would be -*/; i++){
            if(i ==pos){
                st.push(val);
               
          try{
                 fakereverse.pop();
            }catch( Exception ex){
                System.out.println(ex.getMessage());
            }
            }
                try{
                st.push(fakereverse.pop());
            }catch( Exception ex){
                System.out.println(ex.getMessage());
            }
            }
             }
          
          public static void reverseQueue(Queue<Integer> toRev) {
              ArrayStack<Integer> st = new ArrayStack();
              int size, i;
              size = toRev.getSize();
              
              for( i = 0; i <size; i++){
                 try{
                st.push(toRev.dequeue());
                 }catch( Exception ex){
                System.out.println(ex.getMessage());
                 } 
              }
                toRev.clear();
                 for( i =0; i < size; i++){
                 try{
                  
                toRev.enqueue(st.pop());
                 }catch( Exception ex){
                System.out.println(ex.getMessage());
                 } 
                 
                 
              }
          }
}
     
          
     
  

