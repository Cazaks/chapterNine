package extentededcommissionAndBaseCommissionClasses;

public class BaseCommissionEmployeeExtended extends CommissionEmployeeExtend{
    private double baseSalary;

    public BaseCommissionEmployeeExtended(String firstName, String lastName, String socialSecurityNumber,
                                          double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary cannot be less than 0.");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary cannot be less than 0.");
        }
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double calculateEarnings() {
        return baseSalary + (commissionRate * grossSales);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "Base-salary commission employee", firstName, lastName,
                "Social Security Number", socialSecurityNumber,
                "Gross Sales", grossSales, "Commission Rate", commissionRate,
                "Base salary", baseSalary);
    }
}
