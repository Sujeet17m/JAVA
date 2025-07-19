package Programs;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter an integer:");
            int rollno = input.nextInt();
            System.out.println("Your rollno is :" + rollno);
        }
    }
}
 
