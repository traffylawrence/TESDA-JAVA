
   package circle;
   public class Main{
    public static void main(String[] args) {
       //prob98
        // Create a circle object with a radius of 5
        circle myCircle = new circle(5.0);

        // Access the radius and print it
        System.out.println("Radius: " + myCircle.getRadius());

        // Calculate and print the area
        System.out.println("Area: " + myCircle.calculateArea());

        // Calculate and print the circumference
        System.out.println("Circumference: " + myCircle.calculateCircumference());

        // Modify the radius and recalculate
        myCircle.setRadius(7.5);
        System.out.println("Updated Radius: " + myCircle.getRadius());
        System.out.println("Updated Area: " + myCircle.calculateArea());
        System.out.println("Updated Circumference: " + myCircle.calculateCircumference());
    }

   }