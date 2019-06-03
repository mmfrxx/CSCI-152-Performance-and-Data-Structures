/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5lab;

import InterFace.Animal;

/**
 *
 * @author As
 */
public class Animalmpl implements Animal {
    private int age;
    private int maxAge;
    private boolean isAlive =true;
    
    
    public Animalmpl(int age, int max, boolean alive){
        this.age=age;
        
        maxAge = max;
        
    }
    public String animalKind() {
        return "Animal";
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean canEat(String food) {
        if(food.equals("Meat")){
            return true;
        }
        return false;
    }

    @Override
    public void ageOneYear() {
        age++;
        if(age > maxAge){
            isAlive = false;
        }
    } 

    @Override
    public void feed(String food) throws Exception {
        if(!canEat(food)){
            throw new Exception ("This animal cannot eat this food.");
        }else{
            System.out.println("Nom,nom...");
        }
    }

    
    @Override
    public void isAlive() {
          if(isAlive ==false){
            System.out.println("It is not alive"); 
            
        }else{
             System.out.println("It is alive");  
          }
    }

    @Override
    public boolean isFull(int number) {
        if(number==1){
            return false;
        }
            return true;
        
    }
    
    public String toString(){
        return "An animal which is "+age+" years old.";
    }
    
}