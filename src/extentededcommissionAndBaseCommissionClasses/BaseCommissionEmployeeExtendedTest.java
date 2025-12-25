package extentededcommissionAndBaseCommissionClasses;

public class BaseCommissionEmployeeExtendedTest {
    public static void main(String[] args) {

        BaseCommissionEmployeeExtended employeeExtended = new BaseCommissionEmployeeExtended(
                "Iwondu", "Josef", "444-123-6789",
                4200.00, 0.01, 4000.00);

        System.out.printf("Employee information obtained by get methods: %n");
        System.out.printf("%s %s%n", "First Name is", employeeExtended.getFirstName());
        System.out.printf("%s %s%n", "Last Name is", employeeExtended.getLastName());
        System.out.printf("%s %s%n", "Social Security Number is", employeeExtended.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross Sales is", employeeExtended.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission Rate", employeeExtended.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base Salary is", employeeExtended.getBaseSalary());
        System.out.println();

        System.out.println("Calculating earning with information obtained by post methods:");
        System.out.printf("%s %.2f%n", "Earning is: ", employeeExtended.calculateEarnings());

        employeeExtended.setGrossSales(7177.00);
        employeeExtended.setCommissionRate(0.6);
        employeeExtended.setBaseSalary(10000.00);

        System.out.printf("%n%s: %n%n%s%n", "Updated employee information obtained by toString Method",
                employeeExtended.toString());

        System.out.println();
        System.out.println("Calculating earning with updated information obtained by toString methods:");
        System.out.printf("%s %.2f%n", "Earning is: ", employeeExtended.calculateEarnings());
    }
}
