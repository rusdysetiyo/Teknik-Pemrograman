import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class SumWorker implements Runnable {
    private int startRange;
    private int endRange;
    private long partialSum = 0;
    private String threadName;

    public SumWorker(int startRange, int endRange, String threadName) {
        this.startRange = startRange;
        this.endRange = endRange;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " mengerjakan rentang: " + startRange + " sampai " + endRange);

        for (int i = startRange; i <= endRange; i++) {
            partialSum += i;
        }

        System.out.println(threadName + " selesai. Hasil Parsial: " + partialSum);
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class PenjumlahanParalel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Thread: ");
        int numThreads = input.nextInt();
        System.out.print("Masukkan Angka Akhir: ");
        int maxNumber = input.nextInt();

        // Mekanisme Divide
        int rangeSize = maxNumber / numThreads;
        List<Thread> threads = new ArrayList<>();
        List<SumWorker> workers = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            int start = (i * rangeSize) + 1;
            // Mengatasi sisa pembagian pada thread terakhir agar semua angka terhitung
            int end = (i == numThreads - 1) ? maxNumber : (i + 1) * rangeSize;

            SumWorker worker = new SumWorker(start, end, "Thread-" + (i + 1));
            Thread thread = new Thread(worker);

            workers.add(worker);
            threads.add(thread);

            thread.start();
        }

        long totalSum = 0;
        try {
            for (Thread t : threads) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Menggabungkan hasil parsial menjadi hasil akhir
        for (SumWorker worker : workers) {
            totalSum += worker.getPartialSum();
        }

        System.out.println("HASIL AKHIR TOTAL: " + totalSum);

        input.close();
    }
}