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
public class CarToy extends Toys {
    private boolean isRed;

    public CarToy(boolean is, int age, String n, boolean col) {
        super(is, age, n);
        isRed = col;
    }
    /**
     *  
     * @throws Exception 
     */
    public void Colour () throws Exception{
        if(isRed){
            System.out.println("Yes, that is what I want!");
        }else{
            throw new Exception ("I want a red car!!!");
        }
    }
    
    public void defineASize(){
        if(getBool()&& isRed){
            System.out.println("My red car is big.");
        }else if(getBool()){
            System.out.println("My car is Big but not red.");
        }else{
            System.out.println("I wish I had a big red car.");
        }
    }
    
    public String toString(){
        return "I am going to tell you what I have and what I want.";
    }
}