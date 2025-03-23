import java.util.Objects;

public class Employee {
    private static int idForEmployees = 1;

    private final String fullName;
    private int department;
    private double salary;
    private final int id;

    public Employee(String fullName, int department, double salary) {
        id = idForEmployees++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public String getFullName() {
        return fullName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;

    }

    @Override
    public String toString() {
        return "Employee" + " fullName - " + fullName + ", department - " + department + ", salary = " + salary + ", id - " + id;
    }
}
