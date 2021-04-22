/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.gcd;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GCD {

    public static void main(String[] args) {
        System.out.println("GCD program: We use Euclid algorithm to find GCD");
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a positive integer: ");
        x = scanner.nextInt();
        System.out.println("Insert another positive integer: ");
        y = scanner.nextInt();
        while (x * y != 0) {
            if (x < y) {
                y = y % x;
            } else {
                x = x % y;
            }
        }
        System.out.print("GCD: ");
        System.out.println(x == 0 ? y : x);
    }
}
