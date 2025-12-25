package extentededcommissionAndBaseCommissionClasses;

public class CommissionEmployeeExtend {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployeeExtend(String firstName, String lastName, String socialSecurityNumber,
                                    double grossSales,  double commissionRate) {

        if(grossSales <= 0.0){
            throw new IllegalArgumentException("Gross sales should be equals or greater than 0.");
        }
        if(commissionRate <= 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate should be between 0.0 and 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSales(double grossSales){
        if(grossSales  < 0.0){
            throw new IllegalArgumentException("Gross sales should be equals or greater than 0.");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate should be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    protected double calculateEarnings(){
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "Base-salaried commission employee", getFirstName(), getLastName(),
                "Social Security Number", getSocialSecurityNumber(),
                "Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate()
        );
    }


}
