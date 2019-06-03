/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6lab;

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
        
        ArrayIntStack stk = new ArrayIntStack();
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
          
          
          for ( i = 0 ;i<22; i++){
              stk.push(k);
              k++;
          }
            
         
          System.out.println(stk);
          System.out.println(stk.getSize());
          
    }
    
}
