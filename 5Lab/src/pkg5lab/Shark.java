/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5lab;

/**
 *
 * @author As
 */
public class Shark extends Animalmpl{
     public Shark(int a, int max, boolean alive){
        super(a,max,alive);
    }
     public String animalKind() {
        return "Shark";
    }

   

    @Override
    public boolean canEat(String food) {
        return food.equals("Fish");
    }

 

    @Override
    public void feed(String food) throws Exception {
        if(!canEat(food)){
            throw new Exception ("Shark cannot eat "+food);
        }else{
            System.out.println("Nom,nom...");
        }
    }

    

    @Override
    public boolean isFull(int number) {
            return !(number==2||number ==1);
        
    }
    
    public String toString(){
        return "A shark which is "+getAge()+" years old.";
    }
}