package circle;
public class circle {
    private double radius;
//prob 98
    // Constructor to initialize the circle with a given radius
    public circle(double radius) {
        this.radius = radius;
    }

    // Getter method to retrieve the radius
    public double getRadius() {
        return radius;
    }

    // Setter method to modify the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

}