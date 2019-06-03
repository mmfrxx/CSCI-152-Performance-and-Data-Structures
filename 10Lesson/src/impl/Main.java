/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;


import adt.Stack;
import static impl.Checker.Checker;





/**
 *
 * @author As
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)  {
        int i =0;
        int k =1, size = 12;
        
        Stack<Integer> stk = new LinkedListStack();
        
        try{
            stk.pop();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        
          for (;i<size; i++){
              stk.push(k);
              k++;
          }
            
         
          System.out.println(stk);
          System.out.println(stk.getSize());
          
          try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          
         
           
           try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          
          try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          try{
            System.out.println(stk.pop());
          }catch(Exception ex){
            System.out.println(ex.getMessage());
          }
          System.out.println(stk);
          System.out.println(stk.getSize());
          
          
          stk.clear();
          System.out.println(stk);
          System.out.println(stk.getSize());
          
          k = 1;
          for ( i = 0 ;i<22; i++){
              stk.push(k);
              k++;
          }
            
         
          System.out.println(stk);
          System.out.println(stk.getSize());
          
          Stack<Double> val1= new LinkedListStack();
          

val1.push(50.0); 
val1.push(51.0); 
val1.push(168.0);

System.out.println(val1);

boolean result = Checker(val1); 
System.out.println(result); 
System.out.println(val1);
          
         
}
}
