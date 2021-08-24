package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    // data types of dimensions should be doubles?
    //
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.println("Please enter the height of the rectangle: ");
        Scanner input2 = new Scanner(System.in);
        double height = input2.nextDouble();
        double area = width * height;
        System.out.println("The area of the rectangle is " + area + ".");

    }
}
