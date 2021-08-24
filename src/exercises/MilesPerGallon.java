package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas did you consume in " + milesDriven + " miles?");
        double gasConsumed = input.nextDouble();

        double gallonsPerMile = milesDriven / gasConsumed;
        System.out.println("You're currently getting " + gallonsPerMile + " gallons-per-mile.");

    }
}
