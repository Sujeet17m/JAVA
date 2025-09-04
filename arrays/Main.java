import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //datatype[] variable_name = new datatype[size];
        int[] rnos;// declaration of array. rnos is getting defined in the stack
        rnos = new int[5]; // initialization: actually here object is getting created in the heap
        rnos[0] = 23;
        rnos[1] = 22;
        rnos[2] = 21;
        rnos[3] = 56;
        // rnos[4] = 78;
        System.out.println(rnos[4]); // output: 23

        // input using for loop
        for (int i = 0; i < rnos.length; i++) {
            System.out.print("Enter number: ");
            rnos[i] = in.nextInt();
            System.out.println("Number at index " + i + ": " + rnos[i]);
        }
    }
}