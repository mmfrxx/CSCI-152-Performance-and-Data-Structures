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
public class Seperateclass {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new LLQueueSet();
        int x = 0;
        boolean result = false;
        int size1 = set1.getSize();
        int size2 = set2.getSize();
        for (int i = 0; i < size1; i++) {
            try {
                x = set1.removeAny();
            } catch (Exception ex) {
            }
            set.add(x);
            result = set2.contains(x);
        }
        for (int i = 0; i < size1; i++) {
            try {
                set1.add(set.removeAny());
            } catch (Exception ex) {
            }
        }
        System.out.println(set1);
        System.out.println(set2);
        return result;
    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> union = new LLQueueSet();
        int size1 = set1.getSize();
        int size2 = set2.getSize();
        String x = null;
        Set<String> set = new LLQueueSet();

        for (int i = 0; i < size1; i++) {
            try {
                x = set1.removeAny();
            } catch (Exception ex) {
            }
            set.add(x);
            union.add(x);
        }
        for (int i = 0; i < size1; i++) {
            try {
                set1.add(set.removeAny());
            } catch (Exception ex) {
            }
        }

        for (int i = 0; i < size2; i++) {
            try {
                x = set2.removeAny();
            } catch (Exception ex) {
            }
            set.add(x);
            union.add(x);
        }
        for (int i = 0; i < size2; i++) {
            try {
                set2.add(set.removeAny());
            } catch (Exception ex) {
            }
        }

        return union;
    }
    
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersection = new LLQueueSet();
        Set<Integer> set = new LLQueueSet();
        Set<Integer> sete = new LLQueueSet();
        int x = 0;
        int size1 = set1.getSize();
        int size2 = set2.getSize();
        
        for(int i = 0; i < size1; i++){
             try {
                x = set1.removeAny();
            } catch (Exception ex) {
            }
            set.add(x);
            if(set2.contains(x)){
                intersection.add(x);
            }
        }
        for (int i = 0; i < size1; i++) {
            try {
                set1.add(set.removeAny());
            } catch (Exception ex) {
            }
        }
        System.out.println(set1);
        System.out.println(set2);
        return intersection;
    }
}
