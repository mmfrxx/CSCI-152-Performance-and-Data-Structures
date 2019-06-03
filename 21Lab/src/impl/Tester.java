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
        Map<Integer, String> obj = new LLQueueMap();
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
        
        System.out.println("_____________________________________________________");
        Map<Integer, String> obj1 = new LLStackMap();
        try {
            obj1.removeAny();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(obj1);

        obj1.define(7, "Samal");
        obj1.define(6, "Airan");
        obj1.define(4, "Posuda");
        obj1.define(8, "Tulki");
        obj1.define(3, "Ptichka");
        System.out.println(obj1);

        System.out.println(obj1.remove(7));
        System.out.println(obj1);

        System.out.println(obj1.remove(1));
        System.out.println(obj1);

        obj1.define(8, "Aidahar");
        obj1.define(3, "Cvetok");
        System.out.println(obj1);

        obj1.define(11, "Aidahar");
        obj1.define(13, "Shubat");
        obj1.define(33, "Kniga");
        System.out.println(obj1);

        try {
            System.out.println(obj1.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(obj1.removeAny());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(obj1);

        obj1.clear();
        System.out.println(obj1);

        obj1.define(8, "Tulki");
        obj1.define(3, "Ptichka");
        System.out.println(obj1);
    }

}
