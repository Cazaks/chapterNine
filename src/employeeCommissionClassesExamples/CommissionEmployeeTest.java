package employeeCommissionClassesExamples;

public class CommissionEmployeeTest {
    public static void main(String[] args) {

        CommissionEmployee employee = new CommissionEmployee(
                "Fred", "Jones", "222222222", 5000.00, .06);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "Frist name is: ", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", t employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", employee.getCommissionRate());

        employee.setGrossSales(10000.00);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n %n", "Updated employee information obtained by toString", employee );
    }
}
