package app;

import entitis.Account;
import entitis.BussinessAcount;
import entitis.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex" , 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalace());


        Account acc2 = new SavingsAccount(1002, "Bob", 1000.0 ,0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalace());

        Account acc3 = new BussinessAcount(1003, "bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalace());


    }
}
