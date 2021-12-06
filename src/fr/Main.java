package fr;

import fr.accounts.Account;
import fr.accounts.PayingAccount;
import fr.accounts.Saving;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();


        account2.addFounds(10.2f);
        System.out.println(account2.toString());

        account1.pullFounds(150);
        System.out.println(account1.toString());


        Saving savingAccount = new Saving();
        savingAccount.balanceWithInterest();
        System.out.println(savingAccount.getInterestRate());


        PayingAccount payingAccount = new PayingAccount();
        payingAccount.addFounds(100);
        System.out.println(payingAccount.toString());
    }
}
