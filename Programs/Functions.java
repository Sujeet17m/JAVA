package Programs;

import java.util.Scanner;

// public class Functions {
//     // public static void main(String[] args) {
//     //     try(Scanner in = new Scanner(System.in)) {
//     //         System.out.print("Enter first number: ");
//     //         int num1 = in.nextInt();
//     //         System.out.print("Enter second number: ");
//     //         int num2 = in.nextInt();
            
//     //         int result = add(num1, num2);
//     //         System.out.println("Sum: " + result);
//     //     }
//     // }

//     // // Method to add two integers
//     // public static int add(int a, int b) {
//     //     return a + b;
//     // }
//     public static void main(String[] args) {
        
//         int ans = sum2();
//         System.out.println(ans);
        
//     }
//     //return the value of sum
//     static int sum2(){
//         try(Scanner input = new Scanner(System.in)){
//             int num1 = input.nextInt();
//             int num2 = input.nextInt();
//             float sum = num1 + num2;
//             System.out.println("sum:" + sum);
//             //typecasting
//             int num = (int)(65.56);
//             System.out.println(num);
//             return (int)sum; // returning the sum as an integer
//         }
//     }
//     // Example of a method that could be added
//     static void sum(){
//         try(Scanner input = new Scanner(System.in)){
//             int num1 = input.nextInt();
//             int num2 = input.nextInt();
//             float sum = num1 + num2;
//             System.out.println("sum:" + sum);
//             //typecasting
//             int num = (int)(65.56);
//             System.out.println(num);
//         }
//     }
// }


//string as parameters
public class Functions {
    public static void main(String[] args) {

        String personalised = message("Sujeet");
        System.out.println("Personalised message: " + personalised);
    }
    static String message(String name){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter your name: ");
            String inputName = input.nextLine();
            System.out.println("Hello " + inputName + ", welcome to the program!");
            return inputName; // returning the name
        }
    }
}