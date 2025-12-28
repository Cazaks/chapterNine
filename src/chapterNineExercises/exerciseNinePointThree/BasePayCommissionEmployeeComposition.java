package chapterNineExercises.exerciseNinePointThree;

import employeeCommissionClassesExamples.CommissionEmployee;

public class BasePayCommissionEmployeeComposition {
    private CommissionEmployeeComposition commissionEmployeeComposition;
    private double baseSalary;

    public BasePayCommissionEmployeeComposition(CommissionEmployeeComposition commissionEmployeeComposition, double baseSalary){
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base Salary should be greater than or equals to 0");
        }
        this.commissionEmployeeComposition = commissionEmployeeComposition;
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary <0.0){
            throw new IllegalArgumentException("Base Salary should be greater than or equals to 0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public CommissionEmployeeComposition getCommissionEmployeeComposition(){
        return commissionEmployeeComposition;
    }

    public double calculateEarnings(){
        return baseSalary + commissionEmployeeComposition.calculateEarnings();
    }

    @Override
    public String toString(){
        return String.format("%s%n%S: %.2f", commissionEmployeeComposition, "Base salary", baseSalary);
    }
}
