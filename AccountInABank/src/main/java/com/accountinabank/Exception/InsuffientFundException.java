/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accountinabank.Exception;

import com.accountinabank.Account;

/**
 *
 * @author Administrator
 */
public class InsuffientFundException extends Exception {

    double amount;

    public InsuffientFundException(Account account, double amount) {
        super("You have insuffient balance!"
                + "\n-Your balance: " + account.getAccountBalance()
                + "\n-Inserted ammount: " + amount);
    }

    public InsuffientFundException() {
        super("You have insuffient balance!");
    }
}
