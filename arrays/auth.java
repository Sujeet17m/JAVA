import java.util.Scanner;

public class auth {
    public String username;
    public String password;

    public auth(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        auth database = new auth("Sujeet", "Secret");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.println("Enter password: ");
            String inputPassword = scanner.nextLine();
            if (database.username.equals(inputUsername) && database.password.equals(inputPassword)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid credentials.");
            }
        }
        
        // System.out.println(database.username);
        // System.out.println(database.password);
        // String username = "admin";
        // String password = "secret";

        // try(Scanner scanner = new Scanner(System.in)){
        //     System.out.print("Enter username: ");
        //     String inputUsername = scanner.nextLine();
        //     System.out.print("Enter password: ");
        //     String inputPassword = scanner.nextLine();

        //     if (username.equals(inputUsername) && password.equals(inputPassword)) {
        //         System.out.println("Login successful!");
        //     } else {
        //         System.out.println("Invalid credentials.");
        //     }
        // }
    }
}
