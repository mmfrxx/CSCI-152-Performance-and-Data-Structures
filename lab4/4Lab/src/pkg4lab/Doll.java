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
public class Doll extends Toys{
    
    public Doll(boolean is, int age, String n) {
        super(is, age, n);
    }
    
     public void may(int fromWhichAge){
        if (fromWhichAge > getAge()){
            System.out.println("The dall is for older children. I cannot play with it.");
        }else{
            int difference = getAge()- fromWhichAge;
            System.out.println(getName()+" is "+difference + " years old.");
        }
    }
     public String toString(){
         return "I have a dall named "+getName();
     }
}

