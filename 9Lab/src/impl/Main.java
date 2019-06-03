/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;
import adt.Stack;
import static impl.Exercise8copy.copyQueue;
import static impl.Exercise8copy.copyStack;
import static impl.Exercise8copy.insert;
import static impl.Exercise8copy.reverseQueue;



/**
 *
 * @author As
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)  {
        int i =0;
        int k =1, size = 12;
        
        Stack<Integer> stk = new ArrayStack();
        try{
            stk.pop();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        
          for (;i<size; i++){
              stk.push(k);
              k++;
          }
            
         
          System.out.println(stk);
          System.out.println(stk.getSize());
          
          try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          
         
           
           try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          
          try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          System.out.println(stk);
          System.out.println(stk.getSize());
          
          
          stk.clear();
          System.out.println(stk);
          System.out.println(stk.getSize());
          
          k = 1;
          for ( i = 0 ;i<22; i++){
              stk.push(k);
              k++;
          }
            
         
          System.out.println(stk);
          System.out.println(stk.getSize());
          
          Queue<Integer> queue = new ArrayQueue();
          k = 1;
          try{
           queue.dequeue();
          }catch(Exception ex){
          System.out.println(ex.getMessage());
          }
     
          for ( i = 0;i<8; i++){
              queue.enqueue(k);
              k++;
          }
            
         
          System.out.println(queue);
          System.out.println(queue.getSize());
          
          
          try {
            System. out.println("\n"+queue.dequeue());
           } catch (Exception ex) {   
          }
           try {
            System. out.println("\n"+queue.dequeue());
          } catch (Exception ex) {   
          }try {
            System. out.println("\n"+queue.dequeue());
          } catch (Exception ex) {   
          }
          
        
          System.out.println(queue);
          System.out.println(queue.getSize());
          
          for(i = 0; i <=9; i++){
               queue.enqueue(k);
               k++;
               queue.enqueue(k);
               k++;
          try {
            System. out.println("\nnumber"+queue.dequeue());
          } catch (Exception ex) {   
          }
          try {
            System. out.println("\nnumber"+queue.dequeue());
          } catch (Exception ex) {   
          }
          System.out.println(queue);
          System.out.println("Size is " + queue.getSize());
          
          }
         
          queue.clear();
          System.out.println(queue);
          System.out.println("Size is " + queue.getSize());
          
          k = 1;
          for ( i = 0;i<22; i++){
              queue.enqueue(k);
              k++;
          }
            
         
          System.out.println(queue);
          System.out.println(queue.getSize());
          
     

    System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println("Lab number 8 ");
          
          
          stk.clear();
          k=1;
          for (i = 0;i<12; i++){
              stk.push(k);
              k++;
          }
          System.out.println(stk);
          System.out.println( "It is a copy of orig " +copyStack(stk));
          
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          queue.clear();
          k =1;
          for ( i = 0;i<8; i++){
              queue.enqueue(k);
              k++;
          }
          
          System.out.println(queue);
          System.out.println(copyQueue(queue));
          
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          
          
          
          stk.clear();
          k=1;
          for (i = 0;i<12; i++){
              stk.push(k);
              k++;
          }
          System.out.println(stk);
          
           insert(stk,5,7);
          
          System.out.println( stk);
          
         System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          queue.clear();
          k =1;
          for ( i = 0;i<15; i++){
              queue.enqueue(k);
              k++;
          }
          
          System.out.println(queue);
       
            reverseQueue(queue);
       
          System.out.println(queue);
}
}