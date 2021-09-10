package ch3exercises;

import java.util.Arrays;
import java.util.Scanner;
// exercise 3.7.1
public class ArrayPractice {
    public static void main(String[] args) {


        //create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8
    int[] integerArray = {1, 1, 2, 3, 5, 8};
    //loop through the array and print out each value, then modify the loop to print out odd values only.
    for (int i : integerArray) {
        //if statement to check for odd values only.
        if ((i % 2) != 0) {
            System.out.println(i);
        }
    }

    int[] otherIntegerArray = {0,1,2,3,4,5,6,7,8,9,10};
    int evenSum = 0;
    for (int i : otherIntegerArray) {
        if ((i % 2) == 0) {
            evenSum += i;
        }
    } System.out.println(evenSum);


    String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat " +
            "them in a house. I will not eat them with a mouse.";

    Scanner input = new Scanner(System.in);
    int wordLength = -1;

    while (wordLength < 0) {
        System.out.println("Please enter the length of your search query:");
        String str = input.nextLine();
        try {
            wordLength = Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("Search query must be a number value - no words/letters allowed!");
            wordLength = -1;
        }
        String[] sentenceArray = sentence.split("[., ]");
        for (String i : sentenceArray) {
            if (i.length() == wordLength) System.out.println(i);
        }

    }


    }
}
