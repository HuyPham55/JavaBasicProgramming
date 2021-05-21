/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accountinabank;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class AccountTest {

    static Bank bank = new Bank();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte choice;
        do {

            System.out.println("Enter your choice: \n"
                    + "1. Create a new account.\n"
                    + "2. Withdraw cash.\n"
                    + "3. Deposit cash.\n"
                    + "4. Exit");
            choice = scanner.nextByte();

            try {
                switch (choice) {
                    case 1:
                        bank.createAccount();
                        break;
                    case 2:
                        bank.withdrawCash();
                        break;
                    case 3:
                        bank.depositCash();
                        break;
                    default:
                        throw (new Exception("Incorrect input!"));
                }
            } catch (Exception ex) {
                System.out.println("Exception: " + ex.getMessage());
            }

        } while (choice != 4);
    }
}
