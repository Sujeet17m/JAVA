import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int input = sc.nextInt();
        
// example  old switch statement
        // switch (input){
        // case 1:
        //     System.out.println("You entered one.");
        //     break;
        // case 2:
        //     System.out.println("you entered 2.");
        //     break;
        // default:
        //     System.out.println("You entered something else.");
        //     break;
        // }

        // example new switch statement
        // Note: This is a feature introduced in Java 12, so ensure your environment supports
        switch (input){
            case 1 -> System.out.println("You entered one.");
            case 2 -> System.out.println("You entered two.");
            default -> System.out.println("You entered something else.");
        }
    }
    
}
    }
    

    

	
