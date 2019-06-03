/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_2;

/**
 *
 * @author As
 */
public class Clock1 {
    // Fields
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor
    public Clock1(int hour, int min, int sec) {
         if(hour >=0&&hour<=23){
            hours = hour;
        }else{
        hours =0;
    }
        if(min>=0&&min<=59){
            minutes = min;
        }else{
            minutes = 0;
        }
        if(sec>=0&&sec<=59){
            seconds = sec;
        }else{
            seconds = 0;
        }
    }
    public void setTheValue(int hour,int min, int sec){
        if(hour >=0&&hour<=23){
            hours = hour;
        }
        if(min>=0&&min<=59){
            minutes = min;
        }
        if(sec>=0&&sec<=59){
            seconds = sec;
        }
    }
   
    // Advance one second method
    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if(minutes >=60){
                hours++;
            }
            // need to increment mins, etc.
        }
    }
    public int getTheHours(){
        return this.hours;
    }
    public String toString(){
        if(hours < 10&&minutes < 10 && seconds < 10){
            return "it is 0" + hours+":0"+minutes+":0"+seconds;
        }
        else if(hours < 10&&minutes < 10 && seconds >= 10){
            return "it is 0" + hours+":0"+minutes+":"+seconds;
        }
        else if(hours < 10&&minutes >= 10 && seconds >= 10){
            return "it is 0" + hours+":"+minutes+":"+seconds;
        }
         else if(hours >= 10&&minutes >= 10 && seconds >= 10){
            return "it is " + hours+":"+minutes+":"+seconds;
        }
         else if(hours < 10&&minutes >= 10 && seconds <10){
            return "it is 0" + hours+":"+minutes+":0"+seconds;
        }
         else if(hours >= 10&&minutes < 10 && seconds < 10){
            return "it is " + hours+":0"+minutes+":0"+seconds;
        }
        return "That is it";
    }
}


