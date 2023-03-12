/**
 * @class FibonacciSeries
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date March 1, 2023
 */

public class FibonacciSeries {
    public static void main(String[] args){
        int num1 = 0; //declare the variable with initiate value 0
        int num2 = 1; //Declare the second variable with initiate value 1
        int series; // declare the variable to sum up first two numbers
        System.out.println("The first 30 values of Fibonacci series are :"); //output
        for(int i = 1; i <= 30; i++) { // condition for first 30 numbers
            System.out.print(num1 + " "); // output of the beginning of series
            series = num1 + num2; // adding up two numbers for series
            num1 = num2; // change the first variable to second
            num2 = series; // change the second variable to series
        }

        }

}

