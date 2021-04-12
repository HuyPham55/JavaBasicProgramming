package com.techstore.printnumberpatterns;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PrintNumberPatterns {

    public static void main(String[] args) {
        System.out.println("m.");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.printf("%d ", col + 1);
            }
            System.out.println("");
        }

        System.out.println("n.");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("  ");
            }
            for (int col = 0; col < 8 - row; col++) {
                System.out.printf("%d ", col + 1);
            }
            System.out.println("");
        }

        System.out.println("o.");
        for (int row = 0; row < 8; row++) {
            for (int i = 0; i < 8 - row - 1; i++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 0; col--) {
                System.out.printf("%d ", col + 1);
            }
            System.out.println("");
        }

        System.out.println("p.");
        for (int row = 0; row < 8; row++) {
            for (int col = 8 - row; col > 0; col--) {
                System.out.printf("%d ", col);
            }
            System.out.println("");
        }

        System.out.println(".q");
        for (int row = 0; row < 8; row++) {
            for (int i = 0; i < 8 - row - 1; i++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.printf("%d ", col + 1);
            }
            for (int col = row - 1; col >= 0; col--) {
                System.out.printf("%d ", col + 1);
            }
            System.out.println();
        }

        System.out.println("r.");
        for (int row = 0; row < 8; row++) {
            for (int i = 0; i < row; i++) {
                System.out.print("  ");
            }
            for (int col = 0; col < 8 - row; col++) {
                System.out.printf("%d ", col + 1);
            }
            for (int col = 8 - row - 1; col > 0; col--) {
                System.out.printf("%d ", col);
            }
            System.out.println("");
        }
    }
}
