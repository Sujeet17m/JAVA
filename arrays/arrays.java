public class arrays {
    public static void main(String[] args) {
        // store 5 roll number
        int rno1 = 23;
    int rno2 = 22;
    int rno3 = 21;
    System.out.println(rno1);
    System.out.println(rno2);
    System.out.println(rno3);
    // for how much u'll write so here array comes to play
    int[] rnos = new int[5];
    // or directly
    int[] rnos2 = {23,22,21,56,78};
    System.out.println(rnos[0]);
    System.out.println(rnos2[0]);


    int[] ros; // declaration of array. ros is getting defined in the stack
    ros = new int[5]; // initialization: actually here object is getting created in the heap
    System.out.println(ros[0]);

    }
}