/**
 * @class PrimeNumber
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date February 26 2023
 */
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer number : ");
        int num = input.nextInt(); //Declare the integer entered by user
        int i = 2; // Declare the variable and initiate value for prime check
        boolean flag = true;
        if (num == 0 || num == 1) {
            // Zero and one is not a prime number
            flag = false;
        } else {
            while (i <= num / 2 ) {
                if (num % i == 0) {
                    // condition check for num is prime or not
                    flag = false; //boolean
                    break;
                }
                i ++;
            }
        }
        if (flag) {
            System.out.println(num + " is a prime number ");
        } else {
            System.out.println(num + " is not a prime number ");
        }
    }
}

