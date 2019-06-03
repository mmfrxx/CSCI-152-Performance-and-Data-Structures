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
public class Train extends Toys{
    private int numbers;
    public Train(boolean is, int age, String n, int num) {
        super(is, age, n);
        numbers = num;
    }
    /**
     * This method tells the number of trains.
     */
    public void numbersOfTrains(){
        System.out.println("I have "+numbers+" trains");
    }
    public void defineASize(){
        if(getBool()){
            System.out.println("My trains are big!");
        }else{
            System.out.println("My trains are not big.");
        }
    }
    public String toString(){
        return "I love trains.";
    }
}
