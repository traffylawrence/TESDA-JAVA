package shapes;
public class Main {
    public static void main(String[] args) {
        circle Circle = new circle(10);
        System.out.println("Area of Circle: " + Circle.calculateArea());

        square Square = new square(12);
        System.out.println("\nArea of Rectangle: " + Square.calculateArea());

        triangle Triangle = new triangle(5, 9);
        System.out.println("\nArea of Triangle: " + Triangle.calculateArea());
    }
}