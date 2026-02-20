package id.ac.polban.employee.service;
import id.ac.polban.employee.model.*;

public class MainApp {
    public static void main(String[] args) {
        
        Department deptIT = new Department("IT Support");
        EmploymentType permanent = new EmploymentType("Permanent");

        Employee emp1 = new Employee(1, "Rian", deptIT, permanent, 8000000.0);

        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);

        System.out.println("=== Aplikasi Karyawan Polban ===");
        System.out.println("Nama: " + service.getEmployee(1).getName());
        System.out.println("Dept: " + service.getEmployee(1).getDepartment().getName());

        service.raiseSalary(1, 10); // Naik 10%
        System.out.println("Gaji Baru: " + service.getEmployee(1).getSalary());
    }

}
