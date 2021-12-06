package fr;

import fr.accounts.Account;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();

        account2.addFounds(10.2f);
        System.out.println(account2.toString());



    }
}
