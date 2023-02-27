/**
 * @class StudentAverageGrade
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date February 26, 2023
 */
import java.util.Scanner;
public class StudentAverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Student grades and to stop enter \"c \"  : "); // Enter the student grades and enter c to stop

        int sum = 0; //  initiate the sum variable with the zero value
        int numGrade = 0; // variable for a while loop initiated

        while (input.hasNextInt()) { //condition while loop enter grade until you enter "c"

            sum += input.nextInt();
            numGrade++;
        }

        System.out.println("sum is : " + sum);
        double average = (double) sum / numGrade; // average equation
        System.out.printf("The average of the student grade is : %.2f ", average); // output of the student average grade
    }
}




