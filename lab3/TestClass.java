/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_1;

/**
 *
 * @author As
 */
public class TestClass {
     // Fields
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor
    /**
     * 
     * @param hour set the value to the hours
     * @param min set  the value to the minutes
     * @param sec  set  the value to the seconds 
     * @throws Exception if one of the parameter is not 
     * in the range
     * 
     */
    public TestClass(int hour, int min, int sec) throws Exception {
         if(hour >=0&&hour<=23){
            hours = hour;
        }else{
        throw new Exception ("hours are not in the range!");
    }
        if(min>=0&&min<=59){
            minutes = min;
        }else{
            throw new Exception ("minutes are not in the range!");
        }
        if(sec>=0&&sec<=59){
            seconds = sec;
        }else{
            throw new Exception ("Seconds are not in the range");
        }
    }
    /**
     * 
     *@param hour set the value to the hours 
     * @throws Exception if hour is not 
     * in the range
     */
    public void setHour(int hour) throws Exception {
          if(hour >=0&&hour<=23){
            hours = hour;
        }else{
        throw new Exception ("hours are not in the range!");
    }
    }
    /**
     * 
     *@param min set the value to the minutes 
     * @throws Exception if min is not 
     * in the range
     */
   public void setMin(int min ) throws Exception {
         
        if(min>=0&&min<=59){
            minutes = min;
        }else{
            throw new Exception ("minutes are not in the range!");
        }
        
    }
   /**
     * 
     *@param sec set the value to the seconds
     * @throws Exception if sec is not 
     * in the range
     */
   public void setSec( int sec) throws Exception {
        
        if(sec>=0&&sec<=59){
            seconds = sec;
        }else{
            throw new Exception ("Seconds are not in the range");
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
    /**
     * 
     * @return the value of the hours
     */
    public int getTheHours(){
        return this.hours;
    }
    /**
     * 
     * @return the string representation of the given objects
     */
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