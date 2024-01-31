package shapes;

//prob 90
public class circle extends shapes {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }
// Calculate area of circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
