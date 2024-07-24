/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

/**
 *
 * @author LENOVO
 */
public class BasicBankAccount {
    private int accountID;
    private double balance;

    public BasicBankAccount(double bal){
        balance = bal;
    }
    public void BasicBankAccount(){
        balance = 0.0;
    }
    
    public void setAccID(int accID){
        accountID= accID;
    }
    public void setBalance(double bal){
        balance= bal;
    }
    public int getAccountID(){
        return accountID;
    }
    public double getBalance(){
        return balance;
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }
    
    
}

    
