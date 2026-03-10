public class Paint {
    private double coverage; //number of square feet per gallon

    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        // Mengembalikan luas bentuk dibagi dengan luas permukaan cakupan cat (coverage)
        return s.area() / coverage;
    }
}