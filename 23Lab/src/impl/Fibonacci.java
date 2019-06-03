/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Map;

/**
 *
 * @author As
 */
public class Fibonacci {

    /////////////////////////
    // Version One
    /////////////////////////
    private static int callCount1;

    public static long fibCalc1(int n) {

        /*
		 TODO: Implement the simple recursive version of
		 the fibonacci function here.
         */
        if (n <= 0) {
            return 0;
        }
        if (n == 1||n==2) {
            return 1;
        }
        callCount1++;
        return fibCalc1(n - 3) + 2*fibCalc1(n - 2);

    }

    public static void testFibCalc1(int n) {
        callCount1 = 0;
        System.out.println("fibCalc1(" + n + ") = " + fibCalc1(n)
                + "; takes " + callCount1 + " calls.");
    }

    /////////////////////////
    // Version Two
    /////////////////////////
    private static int callCount2;
    private static Map<Integer, Long> ansMap = new LLQHashTableMap(10);
    static long answer = 0;
    static long sum;
    public static long fibCalc2(int n) {

        /*
		 TODO: Use a similar approach as fibCalc1, but
		 first check the map to see if it already contains
		 your value before you start making recursive 
		 calls.  Don't forget to save any newly calculated
		 answers to the map.
         */
        if (n <= 0) {
            return 0;
        }
        if (n == 1||n==2) {
            return 1;
        }
        if(ansMap.getValue(n)!=null){
            return ansMap.getValue(n);
        }else{
        callCount2++;
        answer= fibCalc2(n - 3) + 2*fibCalc2(n - 2);
        ansMap.define(n, answer);
        return answer;
    }}

    public static void testFibCalc2(int n) {
        callCount2 = 0;

        System.out.println("fibCalc2(" + n + ") = " + fibCalc2(n)
                + "; takes " + callCount2 + " calls.");
    }

    ///////////
    public static void main(String[] args) {

        for (int x = 0; x < 30; x++) {
            testFibCalc1(x);
        }

        for (int x = 0; x < 30; x++) {
            testFibCalc2(x);
        }

    }
}
