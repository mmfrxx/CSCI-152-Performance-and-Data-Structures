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
public class Claasss {
    
    private boolean engineRunning;
    private double speed;
    private String typeofcar;
    
    public Claasss() {
        engineRunning = false;
        speed = 0.0;
        typeofcar = "default"; 
    }
    void startCar(){
        engineRunning = true;
    }
    /**
     * 
     * @throws Exception if startCar method was not called
     */
    void pressGasPedal() throws Exception {
        if(engineRunning){
            speed = speed+10.0;
        }
        else{
            throw new Exception("Well, actually engine is not running.");
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
    /**
     * 
     * @return  the speed
     */
    double getSpeed(){
        return speed;
    }
    /**
     * 
     * @param a is the number of the car
     * @throws Exception if a >2 or a < 0
     * 
     */
    void defineWhich(int a) throws Exception{
        if(a == 1){
            typeofcar = "of first car";
        }
        else if(a == 2){
            typeofcar = "of second car";
        }
        else{
            throw new Exception("There are only two cars, men:)");
        }
    }
    /**
     * 
     * @return the string representation of the object
     */
    public String toString(){
        return "Engine running:"+engineRunning+" Speed " +typeofcar+":"+speed;
    }


}

