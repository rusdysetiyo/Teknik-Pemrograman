import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class TestApp {
    public static void main(String[] args) {
// Persiapan Data (Department & EmploymentType)
        Department deptIT = new Department("IT Division");
        Department deptHR = new Department("Human Resources");

        EmploymentType permanent = new EmploymentType("Full-Time");
        EmploymentType contract = new EmploymentType("Contract");

        // Inisialisasi Service
        EmployeeService service = new EmployeeService();

        // Membuat beberapa objek Employee
        Employee emp1 = new Employee(101, "Rian", deptIT, permanent, 7000000.0);
        Employee emp2 = new Employee(102, "Rachel", deptHR, contract, 5000000.0);

        // Menambahkan Employee ke dalam Service
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        System.out.println("=== DATA KARYAWAN AWAL ===");
        printEmployeeInfo(service.getEmployee(101));
        printEmployeeInfo(service.getEmployee(102));

        // Menguji Fitur Kenaikan Gaji (raiseSalary)
        System.out.println("\n=== PROSES KENAIKAN GAJI ===");
        System.out.println("Menaikkan gaji Rian sebesar 10%...");
        service.raiseSalary(101, 10);

        System.out.println("Menaikkan gaji Rachel sebesar 15%...");
        service.raiseSalary(102, 15);

        // 6. Menampilkan Hasil Akhir
        System.out.println("\n=== DATA KARYAWAN SETELAH KENAIKAN ===");
        printEmployeeInfo(service.getEmployee(101));
        printEmployeeInfo(service.getEmployee(102));
    }

    // Method untuk tampilan output
    public static void printEmployeeInfo(Employee emp) {
        if (emp != null) {
            System.out.println("ID         : " + emp.getId());
            System.out.println("Nama       : " + emp.getName());
            System.out.println("Departemen : " + emp.getDepartment().getName());
            System.out.println("Status     : " + emp.getType().getType());
            System.out.printf("Gaji       : Rp%,.2f\n", emp.getSalary());
            System.out.println("-----------------------------------");
        } else {
            System.out.println("Data karyawan tidak ditemukan!");
        }
    }
}
