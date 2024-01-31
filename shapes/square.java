package shapes;

public class square extends shapes {
    private double side;

    public square(double side) {
        this.side = side;
    }
 // Calculate area of square
    @Override
    public double calculateArea() {
        return side * side;
    }
}