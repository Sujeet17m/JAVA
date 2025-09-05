import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        // //Adding elements
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // //Displaying all elements
        // for(int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        // //Updating an element
        // list.set(2, 60);
        // System.out.println("After updating: " + list.get(2));
        // //Removing an element
        // list.remove(3);
        // System.out.println("After removing: " + list);
        // //Checking if the list contains a specific element
        // System.out.println("Contains 40: " + list.contains(40));
        // //Checking the size of the list
        // System.out.println("Size of the list: " + list.size());
        // //Clearing the list
        // list.clear();
        // System.out.println("After clearing: " + list);

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter element " + (i+1) + ": ");
                list.add(in.nextInt());
            }
        }

        //get item by index
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
        }
    }
}
