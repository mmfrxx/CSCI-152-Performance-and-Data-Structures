/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2lab;

/**
 *
 * @author As
 */
public class AutoTest {
    public static void main(String[]args){
        Automobile car1 = new Automobile();
        Automobile car2 = new Automobile();
        car1.startCar();
        car2.startCar();
        
        car1.pressGasPedal();
        car1.pressGasPedal();
        car2.pressGasPedal();
        car1.defineWhich(1);
        car2.defineWhich(2);
        
        System.out.println(car1);
        System.out.println(car2);
    }
}
