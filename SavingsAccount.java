/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hephzibahakintunde
 */
public class SavingsAccount {
    
    private static float balance;
    private static float interestRate = 0.003F;
    
    SavingsAccount(){
        balance = 0.0F;
    }
    
    SavingsAccount(float startingBalance){
        balance = startingBalance;
    }
    
    public static float getBalance(){
        return balance;
    }
    
    public static void addInterest(){
        balance = (balance + (balance * interestRate));
    }
    
    public static void makeDeposit(float Deposit){
        balance = (balance + Deposit);
    }
}
