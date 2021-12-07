package fr.entreprise;

public class Employee {

    private String name;
    private float hourSalary;
    private float workedHours;
    private float turnover;

    //CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, float hourSalary, float workedHours, float turnover) {
        this.name = name;
        this.hourSalary = hourSalary;
        this.workedHours = workedHours;
        this.turnover = turnover;
    }

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public float getHourSalary() {
        return this.hourSalary;
    }

    public float getWorkedHours(){
        return this.workedHours;
    }

    public void setSalaryInformations(float hourSalary, float workedHours, float turnover){
        this.hourSalary = hourSalary;
        this.workedHours = workedHours;
        this.turnover = turnover;
    }

    // METHODS
    public float calculatedSalary(){
        float total = 0;
        for(int i = 1; i <= 40; i++){
            total += hourSalary;
        }
        for (int j = 41; j < workedHours; j++){ // Increased hours
            total += hourSalary + (hourSalary * 30 /100);
        }
        return total;
    }
}
