public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    // Constructor Dengan radius dan color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter untuk color 
    public String getColor() {
        return color;
    }

    // Setter untuk color 
    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}