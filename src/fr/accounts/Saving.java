package fr.accounts;

public class Saving  extends Account{
    private float interestRate;

    // CONSTRUCTORS
    public Saving() {
        this.interestRate = 6;
    }

    public Saving(float interestRate) {
        this.interestRate = interestRate;
    }

    public Saving(float balance, float interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // GETTERS AND SETTERS
    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    // METHODS
    public void balanceWithInterest(){
        this.setBalance(this.getBalance() * (this.getInterestRate() / 100));
    }

}
