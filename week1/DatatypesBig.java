import java.util.Scanner;
import java.math.BigInteger;

public class DatatypesBig {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan. nextInt();

        for (int i = 0; i < t; i++) {
            String input = scan. next();
            BigInteger n = new BigInteger(input);
            if (n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 ||
                    n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {

                System.out.println(input + " can't be fitted anywhere.");

            } else {
                System.out.println(input + " can be fitted in:");
                long val = n.longValue();

                if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            }
        }
        scan. close();
    }
}


