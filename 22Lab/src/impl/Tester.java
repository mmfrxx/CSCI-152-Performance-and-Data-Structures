/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author As
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> obj = new BSTMap();
       

        try {
            obj.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(obj);

        obj.define(7, "Samal");
        obj.define(6, "Airan");
        obj.define(4, "Posuda");
        obj.define(8, "Tulki");
        obj.define(3, "Ptichka");
        System.out.println(obj);
        
        System.out.println(obj.remove(7));
        System.out.println(obj);

        System.out.println(obj.remove(1));
        System.out.println(obj);

        obj.define(8, "Aidahar");
        obj.define(3, "Cvetok");
        System.out.println(obj);

        obj.define(11, "Aidahar");
        obj.define(13, "Shubat");
        obj.define(33, "Kniga");
        System.out.println(obj);

        try {
            System.out.println(obj.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(obj.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(obj);

        obj.clear();
        System.out.println(obj);

        obj.define(8, "Tulki");
        obj.define(3, "Ptichka");
        System.out.println(obj);
        
        System.out.println("\n\n");
        
        Map<Integer, String> map = new LLQHashTableMap(6);
       

        try {
            map.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(map);

        map.define(7, "Samal");
        map.define(6, "Airan");
        map.define(4, "Posuda");
        map.define(8, "Tulki");
        map.define(3, "Ptichka");
        System.out.println(map);
        
        System.out.println(map.remove(7));
        System.out.println(map);

        System.out.println(map.remove(1));
        System.out.println(map);

        map.define(8, "Aidahar");
        map.define(3, "Cvetok");
        System.out.println(map);

        map.define(11, "Aidahar");
        map.define(13, "Shubat");
        map.define(33, "Kniga");
        System.out.println(map);

      
        try {
            System.out.println(map.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(map.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(map.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(map);

        map.clear();
        System.out.println(map);

        map.define(8, "Tulki");
        map.define(3, "Ptichka");
        System.out.println(map);
        
        System.out.println("\n\n");
        
        Map<Integer, String> set = new BSTHashTableMap(6);
       

        try {
            set.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(set);

        set.define(7, "Samal");
        set.define(6, "Airan");
        set.define(4, "Posuda");
        set.define(8, "Tulki");
        set.define(3, "Ptichka");
        System.out.println(set);
        
        System.out.println(set.remove(3));
        System.out.println(set);

        System.out.println(set.remove(1));
        System.out.println(set);

        set.define(8, "Aidahar");
        set.define(3, "Cvetok");
        System.out.println(set);

        set.define(11, "Aidahar");
        set.define(13, "Shubat");
        set.define(33, "Kniga");
        System.out.println(set);

      
        try {
            System.out.println(set.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(set.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(set.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(set);

        set.clear();
        System.out.println(set);

        set.define(8, "Tulki");
        set.define(3, "Ptichka");
        System.out.println(set);
    }

}
