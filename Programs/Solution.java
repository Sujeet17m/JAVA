import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bulbs: ");
        int n = sc.nextInt();

        int bulbsOn = (int) Math.sqrt(n);

        System.out.println("Number of bulbs ON: " + bulbsOn);

        sc.close();
    }
}