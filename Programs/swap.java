package Programs;

public class swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        // swap numbers code
        int temp = a; // Store the value of a in temp
        a = b;        // Assign the value of b to a     
        b = temp;    // Assign the value of temp (original a) to b
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
