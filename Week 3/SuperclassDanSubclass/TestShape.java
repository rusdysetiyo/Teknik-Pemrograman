public class TestShape {
    public static void main(String[] args) {
        // Uji no-arg constructor
        Shape s1 = new Shape();
        System.out.println("S1 (Default): " + s1.toString());

        // Uji constructor dengan parameter
        Shape s2 = new Shape("blue", false);
        System.out.println("S2 (Custom): " + s2.toString());

        // Uji Getter dan Setter
        s1.setColor("yellow");
        s1.setFilled(false);
        System.out.println("S1 setelah Setter: " + s1.getColor() + ", Filled: " + s1.isFilled());
        System.out.println("S1 toString: " + s1.toString());
    }
}
