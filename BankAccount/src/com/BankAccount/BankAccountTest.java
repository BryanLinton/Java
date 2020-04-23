package com.BankAccount;

public class BankAccountTest {

    public static void main(String[] args) {
	BankAccount person1 = new BankAccount();
	BankAccount person2 = new BankAccount();
    BankAccount person3 = new BankAccount();
    System.out.println("Account number: " + person1.getAccountNumber());
    person1.depositChecking(100);
    System.out.println(person1.getAccountNumber() + ": " + person1.getCheckingBalance() + " Checking Balance");
    System.out.println(person1.getAccountNumber() + ": " + person1.getSavingsBalance() + " Savings Balance");
    person1.accountMoney();
    System.out.println("Account number: " + person2.getAccountNumber());
    System.out.println(person2.getAccountNumber() + ": " + person2.getCheckingBalance() + " Checking Balance");
    System.out.println(person2.getAccountNumber() + ": " + person2.getSavingsBalance() + " Savings Balance");
    person2.withdrawChecking(25);
    person2.accountMoney();
    System.out.println("Account number: " + person3.getAccountNumber());
    System.out.println(person3.getAccountNumber() + ": " + person3.getCheckingBalance()  + " Checking Balance");
    System.out.println(person3.getAccountNumber() + ": " + person3.getSavingsBalance() + " Savings Balance");
    person3.depositChecking(10);
    person3.withdrawChecking(15);
    person3.accountMoney();
    BankAccount.printBankSuccess();
    }
}
