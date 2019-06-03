/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4lab;

/**
 *
 * @author As
 */
public class Toys {
    private boolean isBig;
    private int myAge;
    private String name;
    /**
     * 
     * @param is
     * @param age
     * @param n 
     */
    public Toys(boolean is, int age,String n){
        isBig = is;
        myAge = age;
        name = n;
    }
    /**
     * This method defines the size of the given toys.
     */
    public void defineASize(){
        if(isBig){
            System.out.println("My toy is big!");
        }else{
            System.out.println("My toy is not big.");
        }
    }
    /**
     * Ther name of toy is returned by this method.
     * @return the name.
     */
    public String getName(){
        return name;
    }
    /**
     * This method defines whether the toy is big or not.
     * @return the boolean.
     */
    public boolean getBool(){
      return isBig;
}
    /**
     * This method returns the age
     * @return the age. This method returns the age
     */
    public int getAge(){
        return myAge;
    }
    /**
     * The method tells us may the user play with the given toys or not. And if yes, how old is the given toy.
     * @param fromWhichAge prints out the message.
     */
    public void may(int fromWhichAge){
        if (fromWhichAge > myAge){
            System.out.println("I am not allowed to play with this toy.");
        }else{
            int difference = myAge - fromWhichAge;
            System.out.println("I have been playing with this toy for "+difference + " years.");
        }
    }
    /**
     * This method add one year for current year.
     */
    public void afterOneYear(){
        myAge++;
    }
    /**
     * The method returns what the user has
     * @return spring representation. 
     */
    public String toString(){
        return "I have"+name;
    }
}