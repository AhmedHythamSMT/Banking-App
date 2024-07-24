/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Bank {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int choice;
        double with;
        double depo;
        
        //Basic Bank Account instance
          BasicBankAccount bankAccount = new BasicBankAccount(1000.0);
          bankAccount.setAccID(12345);
//        System.out.println("Bank Account ID: " + bankAccount.getAccountID());
//        System.out.println("Bank Account Balance: " + bankAccount.getBalance());
//        bankAccount.withdraw(500.0);
//        bankAccount.deposit(200.0);

//        //Savings Bank Account instance
          SavingBankAccount savingsAccount = new SavingBankAccount(2000.0, 1500.0);
          savingsAccount.setAccID(6899);
//        System.out.println("\nSavings Account ID: " + savingsAccount.getAccountID());
//        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
//        System.out.println("Savings Account Minimum Balance: " + savingsAccount.getMinimumBalance());
//        savingsAccount.withdraw(1000.0);
//        savingsAccount.deposit(150.0);

        do{
        System.out.println("\nExisting Bank Account IDs");
        System.out.println("1- Basic Bank Account: \n" + bankAccount.getAccountID());
        System.out.println("\n2- Savings Bank Account: \n" + savingsAccount.getAccountID());
        System.out.println("Choose which account did you need(1 or 2).... ");
        choice = scan.nextInt();
        
        if(choice == 1){
            System.out.println("Bank Account ID: " + bankAccount.getAccountID());
            System.out.println("Bank Account Balance: " + bankAccount.getBalance());
            System.out.println("1 - Withdraw \n2 - Deposit ");
            System.out.println("Choose which account did you need(1 or 2).... ");
            choice = scan.nextInt();
            if(choice == 1){ 
                System.out.println("Withdraw: \nEnter the amount: ");
                with = scan.nextDouble();
                bankAccount.withdraw(with);
                System.out.println("Thanks for using our services");
            }else{
                System.out.println("Deposit: \nEnter the amount: ");
                depo = scan.nextDouble();
                bankAccount.deposit(depo);
                System.out.println("Thanks for using our services");
            }
        }else{
            System.out.println("\nSavings Account ID: " + savingsAccount.getAccountID());
            System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
            System.out.println("1 - Withdraw \n2 - Deposit ");
            System.out.println("Choose which account did you need(1 or 2).... ");
            choice = scan.nextInt();
            if(choice == 1){ 
                System.out.println("Withdraw: \nEnter the amount: ");
                with = scan.nextDouble();
                savingsAccount.withdraw(with);
                System.out.println("Thanks for using our services");
            }else{
                System.out.println("Deposit: \nEnter the amount: ");
                depo = scan.nextDouble();
                savingsAccount.deposit(depo);
                System.out.println("Thanks for using our services");
            }
        }
        choice = 0;
        with = 0;
        depo= 0;
        System.out.println("If you want to exit enter 0");
        choice = scan.nextInt();
        }while(choice == 1);
    }
}
