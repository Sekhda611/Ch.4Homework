/**
 * @class SumOfDigits
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date February 26, 2023
 */
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int number = input.nextInt(); // enter the value of the number
        int sum = 0;
        while(number > 0 ){
            sum += number % 10; // equation to get the last digit of the sum

            number  = number / 10; // and then divide the leftover number by 10

        }

        System.out.println("Sum of  the digits is:  "  + sum);

    }
}
