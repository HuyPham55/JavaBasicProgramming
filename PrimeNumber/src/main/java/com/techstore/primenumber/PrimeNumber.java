/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.primenumber;

/**
 *
 * @author Administrator
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int upperbound = 1000;
        System.out.println("The program prints out all prime number in a provided range.");
        for (int number = 2; number <= upperbound; number++) {
            // Not prime, if there is a factor between 2 and sqrt of number
            int maxFactor = (int) Math.sqrt(number);
            boolean isPrime = true;
            int factor = 2;
            while (isPrime && factor <= maxFactor) {
                if (number % factor == 0) {   // Factor of number?
                    isPrime = false;
                }
                factor++;
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }

    }
}
