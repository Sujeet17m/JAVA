package Programs;

import java.util.Scanner;

//loops

public class Loops {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {
           // System.out.println("Number: " + num);
        }

        //print number 1 to n
        try(Scanner in = new Scanner(System.in)) {
        //System.out.print("Please enter a number: ");
        int n = in.nextInt();
        for(int i =1; i <=n; i++){
           // System.out.println("Number:" + i);
        }

        System.out.print("Please enter a number (while loop): ");
        int num = in.nextInt();
        int j = 1;
        while (j <= num) {
            System.out.println("Number (while loop): " + j);
            j++;
        }
        in.close();
        }
    }
        // while loop
        // Syntax: while(condition){statement}
        // int i =1;
        
        // while(i <= 17){
        //     //System.out.println("Number: " + i);
        //     i++;
        // }

        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Please enter a number: ");
        //     int num = sc.nextInt();
        //     int j = 1;
        //     while(j <= num){
        //         System.out.println("Number: " + j);
        //         j++;
        //     }
        // }
        // Print numbers from 1 to num using while loop
        // do-while loop
        // Syntax: do{statement}while(condition);

        
    }


