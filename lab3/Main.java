/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3lab;

/**
 *
 * @author As
 */
public class Main {
    public static void main(String[]args){
        Claasss car1 = new Claasss();
        Claasss car2 = new Claasss();
    car1.startCar();
        car2.startCar();
        try{
        car1.pressGasPedal();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
        car1.pressGasPedal();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
        car2.pressGasPedal();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            car1.defineWhich(1);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            car2.defineWhich(2);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println(car1);
        System.out.println(car2);
    }
}



