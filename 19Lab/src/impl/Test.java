/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.HashTableSet;
import adt.Set;

/**
 *
 * @author As
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     HashTableSet<Student> set = new LLQHashTableSet(10);
     for(int m = 0; m < 200; m++){
         set.add(new Student(100+m, "Bob"));
     }
     System.out.println(set.getBucketSizeStandardDev());
      System.out.println(set.getLoadFactor());
      
      HashTableSet<Student> set1 = new LLQHashTableSet(10);
     for(int m = 0; m < 200; m++){
         set1.add(new Student(100+m, "Bob"));
     }
     System.out.println(set1.getBucketSizeStandardDev());
      System.out.println(set1.getLoadFactor());
}

}
