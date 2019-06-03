/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Deque;
import static impl.MergePerge.mergeSort;

/**
 *
 * @author As
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque<Integer> deq = new LinkedListDeque();
       
        
        try{
            deq.popFromBack();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(deq);
       
      
        try{
            deq.popFromFront();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
         System.out.println(deq);
         
        for (int i = 0; i < 5; i++) {
            deq.pushToFront(i + 50);
            System.out.println(deq);
        }

        for (int i = 0; i < 5; i++) {
            try {
                deq.popFromFront();
                System.out.println(deq);
            } catch (Exception ex) {
                System.out.print(ex.getMessage());
            }
        }
        
        for (int i = 0; i < 6; i++) {
            deq.pushToFront(i + 20);
            System.out.println(deq);
        }

        for (int i = 0; i < 6; i++) {
            try {
               deq.popFromBack();
                System.out.println(deq);
            } catch (Exception ex) {
                System.out.print(ex.getMessage());
            }
        }
        
        for (int i = 0; i < 7; i++) {
            deq.pushToBack(i + 10);
            System.out.println(deq);
        }

        for (int i = 0; i < 7; i++) {
            try {
               deq.popFromBack();
                System.out.println(deq);
            } catch (Exception ex) {
                System.out.print(ex.getMessage());
            }
        }
        
        
        for (int i = 0; i < 8; i++) {
            deq.pushToBack(i + 10);
            System.out.println(deq);
        }

        for (int i = 0; i <8; i++) {
            try {
               deq.popFromFront();
                System.out.println(deq);
            } catch (Exception ex) {
                System.out.print(ex.getMessage());
            }
        }
        
        
        for (int i = 0; i < 10; i++) {
            deq.pushToFront( 11);
            deq.pushToBack( 12);
            System.out.println(deq);
        }

        for (int i = 0; i <8; i++) {
            try {
               deq.popFromFront();
               deq.popFromBack();
                System.out.println(deq);
            } catch (Exception ex) {
                System.out.print(ex.getMessage());
            }
        }
        
        deq.clear();
        System.out.println(deq);
        deq.pushToFront( 1766);
        deq.pushToBack( 156433);
        deq.pushToFront(675411);
        deq.pushToBack( 1564333);
        deq.pushToBack( 13);
        deq.pushToBack( 173567889);
        System.out.println(deq);
        
        System.out.println(mergeSort(deq));
        
    }

}
