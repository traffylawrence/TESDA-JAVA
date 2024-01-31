package shapes;

public class triangle extends shapes {
    private double base;
    private double height;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
// Calculate area of triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height; 
    }
}