/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.pascaltriangle;

/**
 *
 * @author Administrator
 */
public class PascalTriangle {

    public static void main(String[] args) {
        final int limit = 8;
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
    }
}
