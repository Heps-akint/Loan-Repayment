/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hephzibahakintunde
 */
public class Application {

    public static void main(String[] args) {

        Johnrepayment();

        Maryrepayment();

    }

    public static void Johnrepayment() {

        int monthsJohn = 0;

        LoanAccount l = new LoanAccount(20000);

        CurrentAccount c = new CurrentAccount();

        do {

            l.makePayment(200);

            c.makeDeposit(600);

            c.addInterest();

            l.addInterest();

            monthsJohn++;

        } while ((l.getBalance()) > 0);

        System.out.println("John repayed his loan after " + monthsJohn + " months. His current account balance at that time was £" + c.getBalance());
    }

    public static void Maryrepayment() {

        int monthsMary = 0;

        LoanAccount l = new LoanAccount(15000);

        SavingsAccount s = new SavingsAccount(100);

        do {

            l.makePayment(250);

            s.makeDeposit(950);

            s.addInterest();

            l.addInterest();

            monthsMary++;

        } while ((l.getBalance()) > 0);

        System.out.println("Mary repayed her loan after " + monthsMary + " months. Her savings account balance at that time was £" + s.getBalance());
    }

}
