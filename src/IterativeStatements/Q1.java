package IterativeStatements;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        given n = 1234 reverse this number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to reverse : ");
        int n = input.nextInt();
        int ans = 0;
        while (n > 0){
            int ans2 = n%10;
            ans = ans*10 + ans2;
            n = n/10;
        }
        System.out.println("Reverse is " + ans);

    }
}
