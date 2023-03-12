/**
 * @author Sonal Sekhda
 * @class Asterisk
 * @course ITEC 2140 secton 04
 * @date March 04,2023
 */

public class Asterisk {
    public static void main(String[] args) {
        String star = "*"; //Declare the String variable "*"
        for (int i = 1; i <= 6; i++) {
            //Conditon for 6 times
            for (int j = 6; j >= i; j--) {
                //Contition for how many times you want to print "*"
                System.out.print(star); // output

            }
            System.out.println();
        }

    }
}
