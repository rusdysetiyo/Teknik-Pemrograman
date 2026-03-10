import java.util.Scanner; // Jangan lupa import Scanner

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;

        System.out.print("\nBerapa banyak data salesperson yang ingin Anda masukkan? ");
        size = scan.nextInt();

        // Membuat array dengan ukuran dinamis berdasarkan input pengguna
        Salesperson[] salesStaff = new Salesperson[size];

        System.out.println("\nMasukkan data staf penjualan...");
        for (int i = 0; i < size; i++) {
            System.out.println("\nData untuk Salesperson ke-" + (i + 1) + ":");

            System.out.print("Nama Depan: ");
            String firstName = scan.next();

            System.out.print("Nama Belakang: ");
            String lastName = scan.next();

            System.out.print("Total Penjualan: ");
            int sales = scan.nextInt();

            salesStaff[i] = new Salesperson(firstName, lastName, sales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }

        scan.close(); // Praktik yang baik untuk menutup Scanner
    }
}