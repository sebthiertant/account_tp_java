package fr;

import fr.accounts.Account;
import fr.accounts.PayingAccount;
import fr.accounts.Saving;
import fr.entreprise.Commercial;
import fr.entreprise.Employee;
import fr.entreprise.IncreasedEmployee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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


        Employee employee = new Employee("Sébastien", 10, 50, 3);
        IncreasedEmployee increasedEmployee = new IncreasedEmployee("David", 10, 50, 3);
        Commercial commercial = new Commercial("Boris", 10, 50, 5);
        System.out.println(employee.calculatedSalary());
        System.out.println(increasedEmployee.calculatedSalary());
        System.out.println(commercial.calculatedSalary());


    }
}
