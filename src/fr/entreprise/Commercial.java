package fr.entreprise;

public class Commercial extends Employee{

    // CONSTRUCTORS
    public Commercial(String name) {
        super(name);
    }

    public Commercial(String name, float hourSalary, float workedHours, float turnover) {
        super(name, hourSalary, workedHours, turnover);
    }

    // METHODS
    @Override
    public float calculatedSalary(){
        float total = 0;
        float fixSalary = 1500;
        total += fixSalary + (fixSalary * 1 / 100);
        return total;
    }
}
