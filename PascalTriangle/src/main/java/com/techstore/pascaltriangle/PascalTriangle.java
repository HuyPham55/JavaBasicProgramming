/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.pascaltriangle;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PascalTriangle {

    public static void main(String[] args) {
        final int limit = 8;
        System.out.println("A Pascal Triangle has left and right line are 1. Each number in triangle equals to sum of 2 numbers above it.");
        System.out.println("a. Power of 2 triangle");
        for (int row = 0; row < limit; row++) {
            for (int i = 0; i < limit - row - 1; i++) {
                System.out.print("     ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.printf("%5.0f", Math.pow(2, col));
            }
            for (int col = row - 1; col >= 0; col--) {
                System.out.printf("%5.0f", Math.pow(2, col));
            }
            System.out.println();
        }

        System.out.println("b. Pascal Triangle 1");
        int[][] a = new int[limit][limit];
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a[i][j] = 1;
                    continue;
                }
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println("");
        }
    }
}
