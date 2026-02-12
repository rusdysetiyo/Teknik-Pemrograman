public class OperatorChallenge {

    public static void main(String[] args) {
        // source code soal
        int a = 5;
        int b = 10;
        boolean result = (++a * 2 > b) && (b++ % 3 == 1);
        System.out.println("Hasil Boolean: " + result);
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);

        //reset nilai untuk no 5.1
        System.out.println("\n5.1");
        a = 5;
        b = 10;
        result = (++a * 2 == 11) ;
        System.out.println("Hasil Boolean: " + result);


        //5.2 atur nilai a sehingga (++a * 2 > b) bernilai false
        System.out.println("\n5.2");
        a = 4;
        b = 10;
        result = (++a * 2 > b) && (b++ % 3 == 1);
        System.out.println("Hasil Boolean: " + result);
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }
}
