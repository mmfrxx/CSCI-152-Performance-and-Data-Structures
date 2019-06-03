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
public class ExceptionClass {
      public static void main(String[]args) throws Exception{
      
       
             TestClass watch=new TestClass(5,2,54);
       
        try{
        watch.setHour(30);
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
         try{
        watch.setMin(30);
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
          try{
        watch.setSec(56);
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
        int hour =watch.getTheHours();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(watch);
        watch.tick();
        System.out.println(hour);
    }
}


