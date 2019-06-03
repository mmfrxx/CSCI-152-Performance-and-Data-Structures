/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author As
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i =0;
        int k =1, size = 12;
        
        Stack stk = new ArrayListStack();
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
          for ( i = 0 ;i<22; i++){
              stk.push(k);
              k++;
          }
          System.out.println(stk);
          System.out.println(stk.getSize());
          
        Set<Integer> seet = new HashSet();
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
        System.out.println(seet.size());
        seet.add(14);
        seet.add(-6);
        seet.add(5);
        System.out.println(seet);
        System.out.println(seet.size());

        System.out.println(seet.contains(12));
        System.out.println(seet.contains(7));
        System.out.println(seet.contains(2));
        System.out.println(seet.contains(-8));
        System.out.println(seet.contains(5));
        System.out.println(seet);
        System.out.println(seet.size());
        seet.clear();
        System.out.println(seet);
        System.out.println(seet.size());
        seet.add(55);
        seet.add(24);
        seet.add(78);
        seet.add(51);
        System.out.println(seet);
        System.out.println(seet.size());
        
        Map<Integer, String> obj = new TreeMap();
        

        obj.put(7, "Samal");
        obj.put(6, "Airan");
        obj.put(4, "Posuda");
        obj.put(8, "Tulki");
        obj.put(3, "Ptichka");
        System.out.println(obj);
        System.out.println("Size"+obj.size());

        System.out.println(obj.remove(7));
        System.out.println(obj);
        System.out.println("Size"+obj.size());
        System.out.println(obj.remove(1));
        System.out.println(obj);
        System.out.println("Size"+obj.size());
        obj.put(8, "Aidahar");
        obj.put(3, "Cvetok");
        System.out.println(obj);
        System.out.println("Size"+obj.size());
        obj.put(11, "Aidahar");
        obj.put(13, "Shubat");
        obj.put(33, "Kniga");
        System.out.println(obj);
        System.out.println("Size"+obj.size());
        

        obj.clear();
        System.out.println(obj);
        System.out.println("Size"+obj.size());
        obj.put(8, "Tulki");
        obj.put(3, "Ptichka");
        System.out.println(obj);
        System.out.println("Size"+obj.size());
    }
    
}
