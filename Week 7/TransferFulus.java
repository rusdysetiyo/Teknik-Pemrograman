class Account {
    int balance = 150;
}

public class TransferFulus {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account();
        Account acc2 = new Account();

        // Thread 1: Transfer dari acc1 ke acc2
        Thread t1 = new Thread(() -> {
            // SOLUSI: Selalu ambil lock acc1 dulu, baru acc2
            synchronized (acc1) {
                System.out.println("Thread 1: Mengunci acc1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}

                synchronized (acc2) {
                    System.out.println("Thread 1: Mengunci acc2 dan memindahkan saldo...");
                    acc2.balance += acc1.balance;
                    acc1.balance = 0; // Simulasi transfer
                }
            }
        });

        // Thread 2: Transfer dari acc2 ke acc1
        Thread t2 = new Thread(() -> {
            // SOLUSI: Urutan lock disamakan dengan Thread 1 (acc1 dulu baru acc2)
            synchronized (acc1) {
                System.out.println("Thread 2: Mengunci acc1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}

                synchronized (acc2) {
                    System.out.println("Thread 2: Mengunci acc2 dan memindahkan saldo...");
                    acc1.balance += acc2.balance;
                    acc2.balance = 0;
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Saldo Akhir acc1: " + acc1.balance);
        System.out.println("Saldo Akhir acc2: " + acc2.balance);
    }
}