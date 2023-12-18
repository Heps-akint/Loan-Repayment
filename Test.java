/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hephzibahakintunde
 */
public class Test {
    public static void main(String[] args) {
        
        SavingsAccount s = new SavingsAccount(10000);
        int i;
        
        for (i=0; i < 50 ; i++) {
            
            s.makeDeposit(10000);
            
            s.addInterest();
         
    }
        s.getBalance();
    
}
}
