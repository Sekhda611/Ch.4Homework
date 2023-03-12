/**
 * @class StudentMaxMingrade
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date February 26 2023
 */

import java.util.Scanner;

public class StudentMaxMinGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student grade and enter c to stop : ");

        int min = 100;
        int max = -100;


        do {
            int value = sc.nextInt();

            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;
            }

        } while (sc.hasNextInt());

        System.out.println("Highest student grade is :" + max);
        System.out.println("Lowest student grade is :" + min);


    }
}
