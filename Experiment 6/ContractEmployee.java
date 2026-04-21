import java.util.Date;

class ContractEmployee extends Employee {
    double hourlyRate;
    int noOfHrs;

    public ContractEmployee(String name, String panNo, Date joiningDate, String designation, String empId, double hourlyRate, int noOfHrs) {
        super(name, panNo, joiningDate, designation, empId);
        this.hourlyRate = hourlyRate;
        this.noOfHrs = noOfHrs;
    }

    @Override
    public double calcCTC() {
        return noOfHrs * hourlyRate;
    }
}
