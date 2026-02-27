public class TestSquare {

    public static void main (String[] args) {
        Square sq1 = new Square(5.0, "biru", true);
        System.out.println(sq1.toString());
        System.out.println("Luas Square: " + sq1.getArea());
        System.out.println("Keliling Square: " + sq1.getPerimeter());

// Menguji override setter untuk menjaga bentuk persegi
        sq1.setLength(10.0);
        System.out.println("Setelah setLength(10.0), \nWidth: " + sq1.getWidth()
                + "\nLength: " + sq1.getLength()
                + "\nKeliling baru: " + sq1.getPerimeter()
                + "\nLuas baru: " + sq1.getArea());
// Hasil area pasti 100.0, membuktikan width-nya ikut berubah menjadi 10.0
    }
}
