import java.util.Scanner;

public class auth {
    public static void main(String[] args) {
        String username = "admin";
        String password = "secret";

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid credentials.");
            }
        }
        
    }
    
}
