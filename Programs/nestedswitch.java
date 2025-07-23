package Programs;

import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        try(Scanner day = new Scanner(System.in)) {
            System.out.print("Enter a day (1-7): ");
            int dayInput = day.nextInt();

            switch (dayInput) {
                case 1, 2, 3, 4, 5 -> { System.out.println("It's a weekday.");
                switch (dayInput) {
                    case 1 -> System.out.println("It's Monday.");
                    case 2 -> System.out.println("It's Tuesday.");
                    case 3 -> System.out.println("It's Wednesday.");
                    case 4 -> System.out.println("It's Thursday.");
                    case 5 -> System.out.println("It's Friday.");
                }
            }
                case 6 -> System.out.println("It's Saturday.");
                case 7 -> System.out.println("It's Sunday.");
                default -> System.out.println("Invalid day input.");
            }
        }
    }
}
