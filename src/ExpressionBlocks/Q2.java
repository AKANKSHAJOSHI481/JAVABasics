package ExpressionBlocks;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Given a triangle with 3 angles. Check whether a valid triangle can be formed from that 3 angles

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 angles to find whether they can form a valid triangle or not");
        int val1 = input.nextInt();
        int val2 = input.nextInt();
        int val3 = input.nextInt();
        if(((val1 + val2 + val3) == 180) && val1 > 0 && val2 > 0 && val3 > 0) {
            System.out.println("The entered angles can form a valid triangle");
        } else{
            System.out.println("The entered angles cannot form a valid triangle");
        }
    }
}
