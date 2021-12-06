package fr.accounts;

public class PayingAccount extends Account{

    @Override
    public void addFounds(float amount){
        this.setBalance(-5);
        this.balance += amount;
    }
    @Override
    public void pullFounds(float amount){
        this.setBalance(-5);
        this.balance -= amount;
    }
}
