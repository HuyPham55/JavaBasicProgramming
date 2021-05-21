/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accountinabank;

import com.accountinabank.Exception.NegativeAmountException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bank {

    private final List<Account> accountArray = new ArrayList<Account>();

    Bank() {
    }

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Insert your name: ");
            String customerName = scanner.nextLine();
            System.out.println("Insert account number: ");
            int accountNumber = scanner.nextInt();
            for (Account account : accountArray) {
                if (account.getAccountNumber() == accountNumber) {
                    throw (new Exception("That account number is already exist!"));
                }
            }
            System.out.println("Insert your balance: ");
            double accountBalance = scanner.nextDouble();
            if (accountBalance < 0) {
                throw (new NegativeAmountException(accountBalance));
            }
            accountArray.add(new Account(customerName, accountNumber, accountBalance));
            System.out.println("Account has been created successfully!");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

    }

    void withdrawCash() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your account number to withdraw: ");
            int accountNumber = scanner.nextInt();
            for (Account account : accountArray) {
                if (account.getAccountNumber() == accountNumber) {
                    System.out.println("Account found! \nInsert amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                    return;
                }
            }
            throw new Exception("Your provided account number is invalid!");
        } catch (Exception ex) {
            System.out.println("Exception:" + ex.getMessage());
        }
    }

    void depositCash() {
        try {
            System.out.println("Enter your account number to deposit: ");
            Scanner scanner = new Scanner(System.in);
            int accountNumber = scanner.nextInt();
            for (Account account : accountArray) {
                if (account.getAccountNumber() == accountNumber) {
                    System.out.println("Account found! \n Insert amount to deposit: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                    return;
                }
            }
            throw new Exception("Your provided account number is invalid!");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
