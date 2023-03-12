/**
 * @class CorrespondingIndex
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date March 10, 2023
 */
import java.util.Scanner;
public class CorrespondingIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : " );
        String sent = input.nextLine(); //Declare the variable string
        System.out.print("Enter the character : ");
        char ch = input.next().charAt(0); //Declare the character
        int length = sent.length();
        int lastIndex = -1 ;
        for(int i = 0; i < length; i++){

            if( sent.charAt(i) == ch){

                lastIndex = lastIndex + 1;
                lastIndex = i;
            }

        }
        System.out.println("Last occurrence of character " + ch + " in " + sent + " is at index " + (lastIndex));

    }
}
