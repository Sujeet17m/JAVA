package Programs;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = in.nextInt();
            System.out.print("Enter second number: ");
            int num2 = in.nextInt();
            
            int result = add(num1, num2);
            System.out.println("Sum: " + result);
        }
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }
}
