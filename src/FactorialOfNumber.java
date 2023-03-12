/**
 * @class FactorialOfNumber
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date March 1, 2023
 * Calculate a factorial number
 */
import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int n = input.nextInt(); //Declare the integer
        int facto = 1; //Declare the integer for product
        int i = 1;
        while (i <= n){
            facto = facto * i; // product of the number
            i++;

        }
        System.out.println("Factorial of the" + n + " is : " + facto); // output of the Factorial of the number
    }
}
