import java.util.Date;
//Abstract Class
abstract class Employee {
    String name;
    String panNo;
    Date joiningDate;
    String designation;
    String empId;

    public Employee(String name, String panNo, Date joiningDate, String designation, String empId) {
        this.name = name;
        this.panNo = panNo;
        this.joiningDate = joiningDate;
        this.designation = designation;
        this.empId = empId;
    }

    // Abstract method to be overridden by subclasses
    public abstract double calcCTC();
}