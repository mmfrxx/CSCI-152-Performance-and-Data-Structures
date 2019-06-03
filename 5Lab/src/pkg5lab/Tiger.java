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
public class Tiger extends Animalmpl{
    
    
    public Tiger(int a, int max, boolean alive){
        super(a,max,alive);
    }
    public String animalKind() {
        return "Tiger";
    }

   

    @Override
    public boolean canEat(String food) {
        return food.equals("Meat");
    }

 

    @Override
    public void feed(String food) throws Exception {
        if(!canEat(food)){
            throw new Exception ("Tigers cannot eat "+food);
        }else{
            System.out.println("MUNCH, MUNCH!!!");
        }
    }

    

    @Override
    public boolean isFull(int number) {
            return !(number==2||number ==1);
        
    }
    
    public String toString(){
        return "A tiger which is "+getAge()+" years old.";
    }
}

