package org.launchcode.java.studios.areaofacircle;
import java.util.*;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius = 0;
        while (radius <= 0) {
            System.out.print("Please enter a positive, non-zero radius value:");

            String str = input.nextLine();

            try {
                radius = Double.parseDouble(str);
                // Converts the input value to a double.
            } catch (NumberFormatException e) {
                // If the input value can't be converted to a double, the value of radius is reset to 0, an
                // error message is displayed and the while loop is started over.
                System.out.println("Radius must be a number value - no words/letters allowed!");
                radius = 0;
            }
        }

        double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);

    }

}
// Test Comment.
