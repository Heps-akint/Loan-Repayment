/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hephzibahakintunde
 */
public class LoanAccount {
    
    private static float balance;
    private static float interestRate = 0.008F;
    
    LoanAccount(float amountBorrowed){
        balance = amountBorrowed;
    }
    
    public static float getBalance(){
        return balance;
    }
    
    public static void addInterest(){
        balance = (balance + (balance * interestRate));
    }
    
    public static void makePayment(float Payment){
        balance = (balance - Payment);
    }
}
