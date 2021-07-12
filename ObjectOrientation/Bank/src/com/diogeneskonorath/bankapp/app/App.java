package com.diogeneskonorath.bankapp.app;

import com.diogeneskonorath.bankapp.entities.Account;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entryData = new Scanner(System.in);
        Account newAccount;

        System.out.println("Enter account number: ");
        int id = entryData.nextInt();
        System.out.println("Enter account holder: ");
        entryData.nextLine();
        String holder = entryData.nextLine();
        System.out.println("Is there an initial deposit? (y/n): ");
        char initialDepositVerification = entryData.next().charAt(0);
        if (initialDepositVerification == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = entryData.nextDouble();
            newAccount = new Account(id, holder, initialDeposit);
        } else {
            newAccount = new Account(id, holder);
        }

        System.out.println("\n Account data: ");
        System.out.println(newAccount + "\n");

        System.out.println("Enter a deposit value: ");
        double depositValue = entryData.nextDouble();
        newAccount.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(newAccount + "\n");

        System.out.println("Enter a withdraw value: ");
        double withdrawValue = entryData.nextDouble();
        newAccount.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(newAccount + "\n");

    }
}
