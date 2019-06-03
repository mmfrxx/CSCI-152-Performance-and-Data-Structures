/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author As
 */
public class ArrayListStack<T> implements Stack<T> {
    private ArrayList<T> list;
    public ArrayListStack(){
        list = new ArrayList<T>();
    }
    @Override
    public void push(T value) {
        list.add(value);
    }

    @Override
    public T pop() throws Exception {
       int size=list.size();
       if(size==0){
           throw new Exception ("Exception: The stack is empty.");
       }else{
           return list.remove(0);
       }
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public void clear() {
        list.clear();
    }
    
    public String toString(){
        return list.toString();
    }
}
