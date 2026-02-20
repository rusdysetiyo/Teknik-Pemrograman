package id.ac.polban.employee.service;
import id.ac.polban.employee.model.*;

public class MainApp {
    public static void main(String[] args) {
        // 1. Inisialisasi Data Dasar
        Department deptIT = new Department("IT Support");
        EmploymentType permanent = new EmploymentType("Permanent");

        // 2. Membuat Objek Employee (Relasi Aggregation: Employee punya Department)
        Employee emp1 = new Employee(1, "Rian", deptIT, permanent, 8000000.0);

        // 3. Menggunakan Service (Relasi Dependency: Service butuh Employee)
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);

        // 4. Output sederhana untuk testing
        System.out.println("=== Aplikasi Karyawan Polban ===");
        System.out.println("Nama: " + service.getEmployee(1).getName());
        System.out.println("Dept: " + service.getEmployee(1).getDepartment().getName());

        // Coba naikkan gaji
        service.raiseSalary(1, 10); // Naik 10%
        System.out.println("Gaji Baru: " + service.getEmployee(1).getSalary());
    }

}
