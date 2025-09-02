// import java.util.Scanner;

// public class auth {
//     public String username;
//     public String password;

//     public auth(String username, String password) {
//         this.username = username;
//         this.password = password;
//     }

//     public static void main(String[] args) {
//         auth database = new auth("Sujeet", "Secret");
//         try(Scanner scanner = new Scanner(System.in)){
//             System.out.println("Enter username: ");
//             String inputUsername = scanner.nextLine();
//             System.out.println("Enter password: ");
//             String inputPassword = scanner.nextLine();
//             if (database.username.equals(inputUsername) && database.password.equals(inputPassword)) {
//                 System.out.println("Login successful!");
//             } else {
//                 System.out.println("Invalid credentials.");
//             }
//         }
        
//         // System.out.println(database.username);
//         // System.out.println(database.password);
//         // String username = "admin";
//         // String password = "secret";

//         // try(Scanner scanner = new Scanner(System.in)){
//         //     System.out.print("Enter username: ");
//         //     String inputUsername = scanner.nextLine();
//         //     System.out.print("Enter password: ");
//         //     String inputPassword = scanner.nextLine();

//         //     if (username.equals(inputUsername) && password.equals(inputPassword)) {
//         //         System.out.println("Login successful!");
//         //     } else {
//         //         System.out.println("Invalid credentials.");
//         //     }
//         // }
//     }
// }

import java.util.Scanner;

public class auth {
    // Arrays to hold usernames and passwords
    private String[] usernames;
    private String[] passwords;

    public auth() {
        // initialize database with multiple accounts
        usernames = new String[] {"Sujeet", "Alice", "Bob"};
        passwords = new String[] {"Secret", "password123", "qwerty"};
    }

    public boolean authenticate(String username, String password) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        auth db = new auth();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (db.authenticate(inputUsername, inputPassword)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid credentials.");
            }
        }
    }
}
