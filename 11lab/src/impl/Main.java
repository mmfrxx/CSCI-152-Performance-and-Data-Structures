/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;
import static impl.Palindrome.isPalindrome;

/**
 *
 * @author As
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =0;
        int k =1, size = 12;
        
         Queue<Integer> queue= new LinkedListQueue();
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
          
          Queue<Character> q = new LinkedListQueue();
          q.enqueue('q');
          q.enqueue('a');
          q.enqueue('z');
          q.enqueue('a');
          q.enqueue('q');
          
          System.out.println(isPalindrome(q));
          System.out.println(q);
          
          
          
    }
    
}
