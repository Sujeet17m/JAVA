public class Main {
    public static void main(String[] args) {
    //datatype[] variable_name = new datatype[size];
    int[] rnos;// declaration of array. rnos is getting defined in the stack
    rnos = new int[5]; // initialization: actually here object is getting created in the heap
    rnos[0] = 23;
    rnos[1] = 22;
    rnos[2] = 21;
    rnos[3] = 56;
    rnos[4] = 78;
    System.out.println(rnos[0]); // output: 23
    }
}