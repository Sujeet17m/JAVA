package Programs;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try (Scanner input = new Scanner(System.in)){
            System.out.println(input.nextInt());
        }
        
    }
}

