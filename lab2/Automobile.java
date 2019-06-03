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
public class Automobile {
    private boolean engineRunning;
    private double speed;
    private String typeofcar;
    
    public Automobile(){
        engineRunning = false;
        speed = 0.0;
        typeofcar = "default"; 
    }
    void startCar(){
        engineRunning = true;
    }
    void pressGasPedal(){
        if(engineRunning){
            speed = speed+10.0;
        }
    }
    void pressBreak(){
        speed = 0.0;
}
    void shutDown(){
        engineRunning = false;
    }
    boolean isEngineRunning(){
        return engineRunning;
    }
    double getSpeed(){
        return speed;
    }
    void defineWhich(int a){
        if(a == 1){
            typeofcar = "of first car";
        }
        if(a == 2){
            typeofcar = "of second car";
        }
    }
    public String toString(){
        return "Engine running:"+engineRunning+" Speed " +typeofcar+":"+speed;
    }
}

