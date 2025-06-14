package IterativeStatements;

import java.util.Scanner;

public class IterativeStatementsDemo {
    public static void main(String[] args) {
//        print sum of n natural numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter n to find sum of n natural numbers");
        int val = input.nextInt();
        int ans = 0;
        for(int i = 1; i <= val; i++){
            ans += i;
        }
        System.out.println("Sum of " + val + " natural numbers is : " + ans);
    }
}
