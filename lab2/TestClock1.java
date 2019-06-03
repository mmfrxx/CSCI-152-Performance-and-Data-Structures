/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_2;

/**
 *
 * @author As
 */
public class TestClock1 {
      public static void main(String[]args){
        Clock1 watch = new Clock1(5,2,54);
        watch.setTheValue(30, 10, 72);
        int hour =watch.getTheHours();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(hour);
    }
}
