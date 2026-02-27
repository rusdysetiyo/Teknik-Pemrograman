public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Menaikkan gaji semua staf sebesar 5%
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }

        // Melakukan perbandingan menggunakan metode compare
        // Membandingkan Antonio (Employee) dengan Maria (Manager)
        System.out.println("=== Hasil Perbandingan Setelah Kenaikan Gaji ===");

        int result = staff[0].compare(staff[1]);

        if (result < 0) {
            staff[0].print();
            System.out.println(">> Memiliki gaji LEBIH KECIL dari Manager:");
            staff[1].print();
        } else if (result > 0) {
            staff[0].print();
            System.out.println(">> Memiliki gaji LEBIH BESAR dari Manager:");
            staff[1].print();
        } else {
            System.out.println(">> Kedua karyawan/manajer berikut memiliki gaji yang sama:");
            staff[0].print();
            staff[1].print();
        }

        System.out.println("\n=== Daftar Semua Staf ===");
        for (Employee e : staff) {
            e.print();
        }
    }
}