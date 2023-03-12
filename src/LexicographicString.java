/**
 * @class LexicographicString
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date March 1, 2023
 */

import java.util.Scanner;

public class LexicographicString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string1 : ");
        String string1 = input.nextLine(); //Declare the variable for string 1
        System.out.print("Enter the string2: ");
        String string2 = input.nextLine(); // Declare the variable for string2
        int stringLength1 = string1.length(); // get the length using length method
        int stringLength2 = string2.length();

        if (stringLength1 > stringLength2) {
            System.out.println("String " + string1 + " is longer than " + string2);

        } else if (stringLength1 < stringLength2) {
            System.out.println("String " + string2 + " is longer than " + string1);
             } else{
            System.out.println("String  " + string1 + " is same length " + string2);
        }


        string1.compareTo(string2); // Compare two strings

        if (string1.compareToIgnoreCase(string2) < 0) {
            System.out.println("String " + string1 + " appears before string " + string2 + " in lexicogaphic order ");
        } else if (string1.compareToIgnoreCase(string2) > 0) {
                    System.out.println("String " + string2 + " appears before string " + string1 + " in lexicographic order ");
               } else {
                    System.out.println("Both strings are same ");
        }
        System.out.println(string1 + " " + string2);


    }
}

