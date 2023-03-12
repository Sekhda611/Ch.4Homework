/**
 * @class ReverseString
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date March 11, 2023
 */
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sent = input.nextLine(); //Declare the string variable
        int length = sent.length(); // Declare the length of the string
        String reversed = ""; // initiliaze the reversed string to store the reverse value
        char c;

        for(int i = length - 1; i >= 0; i--){
             c = sent.charAt(i);
             reversed = reversed + c;
        }
        System.out.println();
        System.out.println("Reverse of " + sent + " is " + reversed);

        boolean result = sent.equalsIgnoreCase(reversed);// if it is true strings are equals


        if(result) {
            System.out.println("String value " + sent + " and its reverse " + reversed + " are equal");
        }
        if(!result) {
            System.out.println("String value " + sent + " and its reverse " + reversed + " are not equal");
        }
    }
}
