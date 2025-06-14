package ExpressionBlocks;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Hello");

        int val = 10;
        System.out.println(val);
        System.out.println(5);
        System.out.println("I am " + "Akanksha");

        System.out.println("I am number = " + val);

        // creating an object of scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value : ");
        int number = input.nextInt();

        System.out.println("The entered number is = " + number);

        System.out.println("Enter an float value : ");
        float floatNumber = input.nextFloat();
        System.out.println("The entered number is = " + floatNumber);


    }
}
