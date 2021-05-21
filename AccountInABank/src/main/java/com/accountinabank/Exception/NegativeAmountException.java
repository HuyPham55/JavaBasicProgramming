/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accountinabank.Exception;

/**
 *
 * @author Administrator
 */
public class NegativeAmountException extends Exception {

    public NegativeAmountException(double amount) {
        super("The provided amount can not be a negative number!\nInserted amount: " + amount);
    }

    public NegativeAmountException() {
        super("The provided amount can not be a negative number!");
    }
}
