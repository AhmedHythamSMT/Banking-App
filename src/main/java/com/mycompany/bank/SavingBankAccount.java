/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

/**
 *
 * @author LENOVO
 */
public class SavingBankAccount extends BasicBankAccount{
    private double minimumBalance;
    static boolean isActive;
    
    public SavingBankAccount(double bal, double minBalance) {
        super(bal);
        minimumBalance = minBalance;
        
        isActive = super.getBalance() >= 1000;
    }
    public void SavingsBankAccount() {
        minimumBalance = 1000.0;
    }
    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance requirement not met, It will be inactive.");
            isActive = false;
        }
    }
    
    @Override
    public void deposit(double amount) {
        if (amount >= 100.0) {
            super.deposit(amount);
        } else {
            System.out.println("Deposit failed. Minimum deposit amount not met.");
        }
    }
}
    