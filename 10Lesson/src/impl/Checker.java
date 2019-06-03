/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author As
 */
public class Checker {

    public static boolean Checker(Stack<Double> val) {

        Stack<Double> val2 = new LinkedListStack();

        boolean result = true;
        double value = 0.0, value2 = 0.0;
        int size = val.getSize();
        if (size == 1) {
            try {
                value = val.pop();

                val2.push(value);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (size > 1) {
            try {
                value = val.pop();
                value2 = val.pop();
                val2.push(value);
                val2.push(value2);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (size >= 2) {
            for (int i = 0;
                    i < size - 1;
                    i++) {
                if (value > value2) {
                    value = value2;
                    try {
                        value2 = val.pop();
                        val2.push(value2);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                } else {
                    result = false;
                }
            }

        }
        size = val2.getSize();
        for (int i = 0;
                i < size;
                i++) {
            try {
                val.push(val2.pop());
            } catch (Exception ex) {

            }
        }
        if (size == 1) {
            result = true;

        }
        return result;
    }

}
