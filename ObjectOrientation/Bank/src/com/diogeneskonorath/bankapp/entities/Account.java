package com.diogeneskonorath.bankapp.entities;

public class Account {
    private int accountId;
    private String holder;
    private double balance;

    public Account(int accountId, String holder) {
        this.accountId = accountId;
        this.holder = holder;
    }

    public Account(int accountId, String holder, double initialDeposit) {
        this.accountId = accountId;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account: "
                + accountId
                +", holder: '"
                + holder
                +", balance: "
                + balance;
    }
}
