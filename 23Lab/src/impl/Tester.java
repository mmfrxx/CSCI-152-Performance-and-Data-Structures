/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author As
 */
public class Tester {

    /**
     * @param tow
     * @param args the command line arguments
     */
    public static void play(TowerOfHanoi tow, int n) {
        if (n % 2 == 1) {
            while (!tow.isFinished()) {
                try {
                    tow.moveDisc(0, 2);
                } catch (Exception ex) {
                    try {
                        tow.moveDisc(2, 0);
                    } catch (Exception ex1) {
                    }
                }
                try {
                    tow.moveDisc(0, 1);
                } catch (Exception ex) {
                    try {
                        tow.moveDisc(1, 0);
                    } catch (Exception ex1) {
                    }
                }
                try {
                    tow.moveDisc(1, 2);
                } catch (Exception ex) {
                    try {
                        tow.moveDisc(2, 1);
                    } catch (Exception ex1) {
                    }
                }
            }
        } else {
            while (!tow.isFinished()) {
                try {
                    tow.moveDisc(0, 1);
                } catch (Exception ex) {
                    try {
                        tow.moveDisc(1, 0);
                    } catch (Exception ex1) {
                    }
                }
                try {
                    tow.moveDisc(0, 2);
                } catch (Exception ex) {
                    try {
                        tow.moveDisc(2, 0);
                    } catch (Exception ex1) {
                    }
                }
                try {
                    tow.moveDisc(1, 2);
                } catch (Exception ex) {
                    try {
                        tow.moveDisc(2, 1);
                    } catch (Exception ex1) {
                    }
                }
            }
        }
    }

        
        
    
    public static void main(String[] args) {
        TowerOfHanoi tower= new TowerOfHanoi(8);
         System.out.println(tower);
        play(tower, 8);
        System.out.println(tower);
    }

}
