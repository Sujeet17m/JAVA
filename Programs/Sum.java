package Programs;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            // float num1 = input.nextInt();
            // float num2 = input.nextInt();
            float sum = num1 + num2;
            System.out.println("sum:" + sum);
            //typecasting
            int num = (int)(65.56);
            System.out.println(num);


            
        }

    }
    
}
