/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author As
 */
public class SetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Set<Integer> seet = new BST2Set();
        seet.add(5);
        seet.add(12);
        seet.add(3);
        seet.add(6);
        seet.add(14);
        seet.add(2);
        seet.add(-6);
        seet.add(8);
        seet.add(0);
        System.out.println(seet);
        seet.add(14);
        seet.add(-6);
        seet.add(5);
        System.out.println(seet);
               
        seet.remove(0);
        seet.remove(6);
        seet.remove(3);
        System.out.println("Removing"+seet);
        
        seet.add(6);
        seet.add(13);
        seet.add(99);
        seet.add(11);
        System.out.println(seet);
        
        seet.remove(12);
        System.out.println("Removing"+seet);
        seet.remove(5);
        System.out.println("Removing"+seet);
        
        
        try {
            seet.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            seet.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            seet.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(seet);
        seet.clear();
        System.out.println(seet);
         seet.add(55);
        seet.add(24);
        seet.add(78);
        seet.add(51);
        System.out.println(seet);
        
        
        
        
    }
    
}
