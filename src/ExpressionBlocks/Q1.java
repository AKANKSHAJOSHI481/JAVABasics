package ExpressionBlocks;


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Take a user input which is an integer
        // If the input value is even value is even or odd
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to know whether it is even or odd");
        int value = input.nextInt();
        if(value%2 == 1){
            System.out.println(value + " is an odd number");
        } else {
            System.out.println(value + " is an even number");
        }

    }
}
