package com.BankAccount;

import java.util.Random;
import java.util.stream.IntStream;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int accountsCreated;
    private static int totalMoney;

    private void setAccountNumber(String pAccountNumber) {this.accountNumber = pAccountNumber;}
    private void setCheckingBalance(double pCheckingBalance) {this.checkingBalance = pCheckingBalance;}
    private void setSavingsBalance(double pSavingsBalance) {this.savingsBalance = pSavingsBalance;}

    public String getAccountNumber() {return this.accountNumber;}
    public double getCheckingBalance() {return this.checkingBalance;}
    public double getSavingsBalance() {return this.savingsBalance;}

    private String generateId() {
		String subst = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			subst += r.nextInt(10);
        }
        return subst;
    }

    public BankAccount(){
        setAccountNumber(generateId());
        accountsCreated++;
        setCheckingBalance(0.0);
        setSavingsBalance(0.0);
    }

    protected void depositChecking(double dAmount){
        setCheckingBalance(dAmount);
        System.out.println("Amount deposited " + dAmount);
        totalMoney += dAmount;
    }

    protected void depositSavings(double dAmount){
        setSavingsBalance(dAmount);
        System.out.println("Amount deposited " + dAmount);
        totalMoney += dAmount;
    }

    protected void withdrawChecking(double wAmount){
        if(getCheckingBalance() <= 0){
            System.out.println("No funds available for withdrawal: " + getCheckingBalance());
        } else if (wAmount > getCheckingBalance()) {
            System.out.println("Withdrawal amount exceeds balance");
        } else {
            setCheckingBalance(-wAmount);
            totalMoney -= wAmount;
        }
    }

    protected void withdrawSavings(double wAmount){
        if(getSavingsBalance() <= 0){
            System.out.println("No funds available for withdrawal: " + getSavingsBalance());
            } else if (wAmount > getSavingsBalance()) {
            System.out.println("Withdrawal amount exceeds balance");
            } else {
            setSavingsBalance(-wAmount);
            totalMoney -= wAmount;
            }
        }

    protected void accountMoney(){
        double accountValue = getCheckingBalance() + getSavingsBalance();
        System.out.println("Checking total: " + getCheckingBalance());
        System.out.println("Savings total: " + getSavingsBalance());
        System.out.println("Total: " + accountValue);
    }

    public static void printBankSuccess(){
        System.out.println("Accounts created " + accountsCreated);
        System.out.println("Banks total cash " + totalMoney);
    }


}
