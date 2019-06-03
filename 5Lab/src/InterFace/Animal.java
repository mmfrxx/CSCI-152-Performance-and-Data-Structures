/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFace;

/**
 *
 * @author As
 */
public interface Animal {
    /**
     * This method returns the kind of animal
     * @return the name of the animal, string representation..
     */
    public String animalKind();
    /**
     * This method tells you what  the age of animal is.
     * @return the age of the animal, integer.
     */
    public int getAge();
    /**
     * This method defines whether the given animal can eat the certain food or not.
     * @param food gives us the name of food.
     * @return false or true depending on if the animal can eat the given food
     */
    public boolean canEat(String food);
    /**
     * Implement the age of the animal.
     */
    public void ageOneYear();
    /**
     * If animal cannot eat a given food food, the method throws an exception. 
     * @param food
     * @throws Exception if the animal cannot eat the given food. 
     * The food type depends on the kind of the animal.
     */
    public void feed(String food) throws Exception;
    /**
     * Each animal has its own maximum age.
     * And if the age of the animal is larger than its max age
     * the function says that the animal is not alive.
     */
    public void isAlive();
    /**
     * The function tells us if the animal is full or not.
     * @return true or false depending on if the animal is alive
     */
    public boolean isFull(int number);
    
}