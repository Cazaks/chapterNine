package baseCommissionEployeeClass;

import java.sql.SQLOutput;

public class BaseCommissionEmployeeTest {
    public static void main(String[] args) {

        BasePlusCommissionEmployee commissionEmployee = new BasePlusCommissionEmployee(
                "Jude", "Susan", "345-33-4444",
                2300.00, 0.1, 3000.00);

        System.out.printf("Employee information obtained by get methods: %n");
        System.out.printf("%s %s%n", "First Name is", commissionEmployee.getFirstName());
        System.out.printf("%s %s%n", "Last Name is", commissionEmployee.getLastName());
        System.out.printf("%s %s%n", "Social Security Number is", commissionEmployee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross Sales is", commissionEmployee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission Rate", commissionEmployee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base Salary is", commissionEmployee.getBaseSalary());


        commissionEmployee.setFirstName("Francis");
        commissionEmployee.setBaseSalary(10000.00);

        System.out.printf("%n%s: %n%n%s%n", "Updated employee information obtained by toString Method",
                commissionEmployee.toString());
    }
}
