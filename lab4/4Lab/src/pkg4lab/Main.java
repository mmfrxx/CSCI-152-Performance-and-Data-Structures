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
public class Main {
    public static void main(String[]args){
        Toys toy = new Toys(true,7,"Docky Dock");
        CarToy car = new CarToy(false,5,"Mers",false);
        Doll doll = new Doll(true,9,"Barbie");
        Train trains = new Train(true,11,"trains",6);
        Toys trains1 = new Train(false,5,"trains",2);
        
        System.out.println(toy);
        toy.defineASize();
        toy.may(5);
        toy.afterOneYear();
        toy.may(5);
        
        System.out.println(car);
        car.defineASize();
        try{
            car.Colour();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        car.may(4);
        
        System.out.println(doll);
        doll.may(7);
        doll.defineASize();
        
        System.out.println(trains);
        trains.numbersOfTrains();
        trains.defineASize();
        trains.may(7);
        
        System.out.println(trains1);
        
        trains1.defineASize();
        trains1.may(7);
        trains1.afterOneYear();
        trains1.may(7);
        trains1.afterOneYear();
        trains1.may(7);
    }
}



