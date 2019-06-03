/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.HashTableSet;
import adt.Set;
import java.util.Random;

/**
 *
 * @author As
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     HashTableSet<Integer> set = new BSTHashTableSet(5000);
     Random random = new Random();
     
     System.out.println("Starting timing tests...");
     long time1, time2, duration;
     time1 = System.currentTimeMillis();
     
     for (int i = 0; i < 50000; i++) {
        set.add(random.nextInt(456767954));
     }
   
     time2 = System.currentTimeMillis();
     duration = time2 - time1;

     System.out.println("Time taken in ms: " + duration);
     
     System.out.println(set.getBucketSizeStandardDev());
      System.out.println(set.getLoadFactor());
}

}
