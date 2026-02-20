import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class TestApp {
    public static void main(String[] args) {
        // Persiapan Data & Service
        Department deptIT = new Department("IT Division");
        Department deptHR = new Department("Human Resources");
        EmploymentType permanent = new EmploymentType("Full-Time");
        EmploymentType contract = new EmploymentType("Contract");

        EmployeeService service = new EmployeeService();
        EmployeeReport report = new EmployeeReport(); // Instance baru untuk pelaporan

        // 2Membuat & Menambah Employee
        service.addEmployee(new Employee(101, "Rian", deptIT, permanent, 7000000.0));
        service.addEmployee(new Employee(102, "Rachel", deptHR, contract, 5000000.0));

        // Menampilkan Data Awal (Menggunakan Dependency ke EmployeeReport)
        System.out.println("=== DATA KARYAWAN AWAL ===");
        report.printPaySlip(service.getEmployee(101));
        report.printPaySlip(service.getEmployee(102));

        // Menguji Fitur Kenaikan Gaji
        service.raiseSalary(101, 10);
        service.raiseSalary(102, 15);

        // Menampilkan Hasil Akhir
        System.out.println("\n=== DATA KARYAWAN SETELAH KENAIKAN ===");
        report.printPaySlip(service.getEmployee(101));
        report.printPaySlip(service.getEmployee(102));

        System.out.println("\nTotal Objek Employee dibuat: " + Employee.getEmployeeCount());
    }
}
