package fr.entreprise;

public class IncreasedEmployee extends Employee{


    // CONSTRUCTORS
    public IncreasedEmployee(String name) {
        super(name);
    }

    public IncreasedEmployee(String name, float hourSalary, float workedHours, float turnover) {
        super(name, hourSalary, workedHours, turnover);
    }

    // METHODS
    @Override
    public float calculatedSalary(){
        float total = 0;
        for(int i = 1; i <= 40; i++){
            total += getHourSalary();
        }
        for (int j = 41; j < getWorkedHours(); j++){ // Increased hours
            total += getHourSalary() + (getHourSalary() * 50 /100);
        }
        return total;
    }
}
