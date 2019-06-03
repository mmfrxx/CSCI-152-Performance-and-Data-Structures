/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;

/**
 *
 * @author As
 */
public class TowerOfHanoi {

    private Stack<Integer>[] post = new ArrayStack[3];
    private int numMoves = 0;
    private int number;
    public TowerOfHanoi(int numDiscs) {
        /*
		 TODO: Initialize all three posts to new stack objects,
		 and push onto post[0] the integers:
		    numDiscs, numDiscs-1, numDiscs-2, ..., 1 
         */
        post[0]=new ArrayStack();
        post[1]=new ArrayStack();
        post[2]=new ArrayStack();
        number = numDiscs;
        for(int i=numDiscs; i > 0; i--){
            post[0].push(i);
        }
        
        
    }

    public void moveDisc(int from, int to) throws Exception {
        /* 
         TODO:  Moves the integer from the top of post[from] to 
         post [to].  Throws an exception if either index is not
         0, 1, or 2; or if post[from] is empty; or if the value
         on top of post[from] is bigger than the topmost item of
         post[to].
         */
        if(from > 2 || to > 2 || to  < 0 || from < 0 ){
            throw new Exception ("The invalid interval. Please, note that interval is from 0 to 2.");
        }else if(post[from].getSize()==0){
            throw new Exception ("There is nothing in the " + from+" stack.");
        }
        if(post[to].getSize() !=0){
        int a = post[from].pop();
        int b = post[to].pop();
            post[from].push(a);
            post[to].push(b);
        if(a>b){
            throw new Exception ("Inappropriate. The popped item is big.");
        }}
        numMoves++;
        post[to].push(post[from].pop());
        
    }

    public boolean isFinished() {
        /*
        TODO:  Returns true if and only if all of the discs are
        on post[2] (i.e., post[0] and post[1] are empty)
         */ 
        return post[2].getSize()==number;
    }

    public int getNumMoves() {
        return numMoves;
    }

    public String toString() {
        /* 
		 TODO:  Returns some string representation of the current
		 game state.... this should help with debugging
         */
        return "Post1: "+post[0].toString() +"\nPost2: "+post[1].toString()+"\nPost3: "+post[2].toString()+"\nNumber of movements: "+numMoves;
    }

}
