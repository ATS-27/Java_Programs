import java.util.Date;

class FullTimeEmployee extends Employee
{
    double baseSalary;
    public FullTimeEmployee(String name, String panNo, Date joiningDate, String designation, String empId, double baseSalary) {
        super(name, panNo, joiningDate, designation, empId);
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double calcCTC() {
        if (this.designation.equalsIgnoreCase("SWE")) {
            double perfBonus = baseSalary * 0.10;
            return baseSalary + perfBonus;
        } else if (this.designation.equalsIgnoreCase("HR")) {
            double hiringCommission = 5000.0;
            return baseSalary + hiringCommission;
        }
        else 
        return baseSalary;
    }
}