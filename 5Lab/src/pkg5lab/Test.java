/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5lab;

import InterFace.Animal;

/**
 *
 * @author As
 */
public class Test {
    public static void feedMeat(Animal animal){
        try{
            animal.feed("Fish");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String []args){
        Tiger tiger = new Tiger(2,4,true);
        Shark shark = new Shark(1,3,true);
        Animal shark1 = new Shark(0,2,true);
        
        System.out.println(tiger.canEat("Fish"));
        feedMeat(shark1);
        feedMeat(tiger);
        shark.ageOneYear();
        shark.isAlive();
        shark.ageOneYear();
        shark.isAlive();
         shark.ageOneYear();
        shark.isAlive();
        System.out.println(tiger.isFull(2));
        System.out.println(tiger.isFull(3));
        System.out.println(shark.toString());
    }
}
