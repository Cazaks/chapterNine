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
        return getBaseSalary() + super.calculateEarnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }

}
