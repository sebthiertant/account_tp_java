package fr;

import fr.accounts.Account;
import fr.accounts.PayingAccount;
import fr.accounts.Saving;

public class Main {
    public static void main(String[] args) {

    Account account = new Account();
    Saving saving = new Saving();
    PayingAccount payingAccount = new PayingAccount();

    account.addFounds(100);
    saving.addFounds(50);
    payingAccount.addFounds(200);

    account.pullFounds(20);
    saving.pullFounds(10);
    payingAccount.pullFounds(5);

    saving.balanceWithInterest();

    System.out.println(account.toString());
    System.out.println(saving.toString());
    System.out.println(payingAccount.toString());
    }
}
