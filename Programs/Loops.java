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
    }
        //while loop
        //Syntax: while(condition){statement}
        int i =1;
        while(i <= 17){
            System.out.println("Number: " + i);
            i++;
        }
    }

}
