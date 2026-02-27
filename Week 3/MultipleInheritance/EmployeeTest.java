public class EmployeeTest {
    public static void main(String[] args) {
        // Mendeklarasikan dan mengalokasikan array untuk 3 objek Employee
        Employee[] staff = new Employee[3];

        // Inisialisasi data karyawan
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Menaikkan gaji setiap staf sebesar 5%
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
    }

    // Melakukan perbandingan menggunakan metode compare
        int result = staff[0].compare(staff[1]);

        System.out.println("Hasil Perbandingan:");
        if (result < 0) {
            staff[0].print(); // Memanfaatkan method print
            System.out.println("Beliau memiliki gaji LEBIH KECIL dari:");
            staff[1].print();
        } else if (result > 0) {
            staff[0].print();
            System.out.println("Beliau memiliki gaji LEBIH BESAR dari:");
            staff[1].print();
        } else {
            System.out.println("Kedua karyawan berikut memiliki gaji yang sama:");
            staff[0].print();
            staff[1].print();
        }
    }
}