import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // array[1][2] = 10;
        // System.out.println("Updated array:");
        // for (int[] row : array) {
        //     for (int num : row) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();

        try(Scanner in = new Scanner(System.in)) {
            
        // int[][] arr = new int[3][3];
        System.out.println(arr.length); // output: 3

        //input
        // for(int row = 0; row < arr.length; row++){
        //     // for each col in every row
        //     for(int col =0; col< arr[row].length; col ++){
        //         System.out.print("Enter number for row " + row + " and col " + col + ": ");
        //         arr[row][col] = in.nextInt();

        //     }
        // }

        // output
        // for(int row = 0; row < arr.length; row++){
        //     for(int col =0; col< arr[row].length; col ++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
// enhanced for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a) + " ");
        }
        }
    
    }
    
}
