/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author As
 * @param <T>
 */
public class LLStackSet<T> implements Set<T>{
    LinkedListStack<T> stack = new LinkedListStack();
    LinkedListStack<T> stk = new LinkedListStack();

    @Override
    public void add(T value) {
        if (!contains(value)) {
            stack.push(value);
        }
    }

    @Override
    public boolean contains(T value) {
        int size = stack.getSize();
        
        boolean result = false;
               
        for (int i = 0; i < size; i++) {
            try {
                T x = stack.pop();
                stk.push(x);
                if (x.equals(value)) {
                    result = true;
                }
            } catch (Exception ex) {
            }
        }
        
       for (int i = 0; i < size; i++) {
            try {  
                stack.push(stk.pop());
            } catch (Exception ex) {
              
            }
       
       }
        
        return result;
    }

    @Override
    public boolean remove(T value) {
        int size = stack.getSize();
         
        T x = null;
        boolean result = false;
        if (contains(value)) {
            for (int i = 0; i < size; i++) {
                try {
                    x = stack.pop();
                } catch (Exception ex) {
                }
                if (x.equals(value)) {
                    result = true;
                } else {
                    stk.push(x);

                }
            }
        }
         for (int i = 0; i < size; i++) {
            try {  
                stack.push(stk.pop());
            } catch (Exception ex) {
              
            }
       
       }
        return result;
    }

    @Override
    public T removeAny() throws Exception {
        if (stack.getSize() == 0) {
            throw new Exception("The set is empty!");
        }
        return stack.pop();
    }

    @Override
    public int getSize() {
        return stack.getSize();
    }

    @Override
    public void clear() {
        stack.clear();
    }

    public String toString() {
        return stack.toString();
    }
}
