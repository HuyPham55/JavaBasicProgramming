/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accountinabank;

import com.accountinabank.Exception.InsuffientFundException;
import com.accountinabank.Exception.NegativeAmountException;

/**
 *
 * @author Administrator
 */
public class Account {

    String customerName;
    int accountNumber;
    double accountBalance;

    public String getAccountName() {
        return customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Account(String customerName, int accountNumber, double accountBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void displayAccountDetails() {
        System.out.println("--------------------------\nCustomer name: " + customerName
                + "\nAccount number: " + accountNumber + "\nAccount balance: " + accountBalance);
    }

    public void deposit(double amount) {
        try {
            if (amount < 0) {
                throw (new NegativeAmountException(amount));
            }
            this.accountBalance += amount;
            displayAccountDetails();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount < 0) {
                throw (new NegativeAmountException(amount));
            }

            if (amount > this.accountBalance) {
                throw (new InsuffientFundException(this, amount));
            }
            this.accountBalance -= amount;
            System.out.println("The withdrawal has been done successfully! ");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
