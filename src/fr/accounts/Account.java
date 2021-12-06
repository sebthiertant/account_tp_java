package fr.accounts;

import java.util.ArrayList;

public class Account {

    public float balance;
    private int accountId;
    private static int incrementValueForId = 1;

    //CONSTRUCTORS
    public Account(){
        this.balance = 0;
        this.accountId = incrementValueForId;
        incrementValueForId++;
    }

    public Account(float balance ) {
        this.balance = balance;
        this.accountId = incrementValueForId;
        incrementValueForId++;
    }

    // GETTERS AND SETTERS
    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance += balance;
    }

    public int getAccountId() {
        return this.accountId;
    }

    // METHODS


    @Override
    public String toString() {
        return "The account number " + getAccountId()
                + " have a balance of " + getBalance() + "€.";

    }

    public void addFounds(float amount){
        this.balance += amount;
    }

    public void pullFounds(float amount){
        this.balance -= amount;
    }
}
