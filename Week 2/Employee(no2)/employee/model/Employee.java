package id.ac.polban.employee.model;

public class Employee {
    private int id;
    private String name;
    private Department department; // Aggregation: Employee has a Department
    private EmploymentType type;
    private double salary;

    // Static Field untuk menghitung jumlah objek Employee
    private static int employeeCount = 0;

    public Employee(int id, String name, Department department, EmploymentType type, double salary) {
        this.id = id;
        this.name = name;
        this.department = department; // Aggregation: Employee has a Department
        this.type = type;
        this.salary = salary;
        employeeCount++; // Increment setiap ada objek baru
    }

    // Static Method untuk mengambil jumlah karyawan
    public static int getEmployeeCount() {
        return employeeCount;
    }
    public int getId() { return id;
    }
    public void setId(int id) { this.id = id;
    }
    public String getName() { return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public EmploymentType getType() {
        return type;
    }
    public void setType(EmploymentType type) {
        this.type = type;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
