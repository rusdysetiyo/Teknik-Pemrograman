package id.ac.polban.employee.service;
import id.ac.polban.employee.model.Employee;

public class EmployeeReport {
    // Dependency: Menerima objek Employee sebagai parameter
    public void printPaySlip(Employee emp) {
        System.out.println("--- SLIP GAJI KARYAWAN ---");
        System.out.println("ID Karyawan  : " + emp.getId());
        System.out.println("Nama         : " + emp.getName());
        System.out.println("Departemen   : " + emp.getDepartment().getName());
        System.out.println("Tipe Kerja   : " + emp.getType().getType());
        System.out.println("Gaji Bersih  : Rp" + String.format("%,.2f", emp.getSalary()));
        System.out.println("--------------------------");
    }
}
