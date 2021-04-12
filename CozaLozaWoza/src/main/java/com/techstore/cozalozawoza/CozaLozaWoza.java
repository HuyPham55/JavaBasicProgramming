package com.techstore.cozalozawoza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CozaLozaWoza {

    public static void main(String[] args) {
        for (int row = 1; row < 11; row++) {
            for (int col = (row - 1) * 11 + 1; col <= row * 11; col++) {
                boolean check = false;
                for (int divisor = 3; divisor <= 7; divisor += 2) {
                    if (col % divisor == 0) {
                        check = true;
                        switch (divisor) {
                            case 3:
                                System.out.print("Coza");
                                break;
                            case 5:
                                System.out.print("Loza");
                                break;
                            case 7:
                                System.out.print("Woza");
                                break;
                        }
                    }
                }
                if (!check) {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }

}
