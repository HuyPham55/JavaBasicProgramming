/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.oddeven;

/**
 *
 * @author Administrator
 */
public class OddEven {

    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 10;
        int sumOdd = 0;
        int sumEven = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            if ((number & 1) == 1) {
                sumOdd += number;
            } else {
                sumEven += number;
            }
        }
        // Print the result
        System.out.println("The sum of odd numbers from " + lowerbound + " to "
                + upperbound + " is " + sumOdd);
        System.out.println("The sum of even numbers from " + lowerbound
                + " to " + upperbound + "is " + sumEven);
    }
}
