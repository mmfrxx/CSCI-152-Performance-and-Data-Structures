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
 */
public class Palindrome {
    public static boolean isPalindrome(Queue<Character> q){
        Queue<Character> queue = new ArrayQueue();
        Queue<Character> queue1 = new ArrayQueue();
        Stack<Character> stack = new LinkedListStack();
        
        int size = q.getSize();
        boolean result = true;
        char ch;
        for(int i = 0;
                i<size;
                i++){
            try{
           ch= q.dequeue();
           queue.enqueue(ch);
           queue1.enqueue(ch);
           
           stack.push(ch);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
         }
         
        if(size==0){
            result = true;
        }else{
             for(int i = 0;
                i<size;
                i++){
            try{
           if(queue.dequeue()==stack.pop()){
               
           }else{
               result = false;
           }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
         }
        }
        for(int i = 0;
                i<size;
                i++){
          try{
          q.enqueue(queue1.dequeue());
          }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
         }
        return result;
    }
}
