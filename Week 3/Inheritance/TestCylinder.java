public class TestCylinder {
    public static void main(String[] args) {
        // Tes Constructor & Penambahan Warna (Bagian A1 & A2)
        Cylinder c1 = new Cylinder(2.0, 5.0);
        System.out.println("--- Test 1 (Cylinder Custom) ---");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Color : " + c1.getColor());
        System.out.println("Height: " + c1.getHeight());

        // Tes Overriding getArea() & Perbaikan getVolume() (Bagian B)
        System.out.println("\n--- Test 2 (Metode Math) ---");
        System.out.println("Luas Permukaan silinder: " + String.format("%.2f", c1.getArea()));
        System.out.println("Volume silinder: " + String.format("%.2f", c1.getVolume()));

        // Tes Overriding toString() (Bagian C)
        System.out.println("\n--- Test 3 (toString) ---");
        System.out.println(c1.toString());
    }
}