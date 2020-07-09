package org.xpdojo.bank;

import java.text.SimpleDateFormat;
import java.util.Date;

//import org.jetbrains.annotations.NotNull;

public class Account {

    private double balance;

    // Set balance to zero
    public Account() {
        balance = 0.0;
    }

    // Deposit function
    public void deposit (double amount) {
        balance = balance + amount;
    }

    // Withdraw function
    public void withdraw (double amount) {
        balance = balance - amount;
    }

    // Get Balance
    public double getBalance () {
        return balance;
    }

    // Transfer function
    public void transfer (double amount, Account fromAccount, Account toAccount ) {
        fromAccount.balance = fromAccount.balance - amount;
        toAccount.balance = toAccount.balance + amount;
    }

    // Print Balance function
    public void printBalance (Account account) {
        System.out.print("Balance is : ");
        System.out.print(account.balance);
        System.out.print(" at ");

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }
}

