package IterativeStatements;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
//        Given a input integer, tell whether it is prime or not
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find whether it is prime or not : ");
        int val = input.nextInt();
        boolean ans = true;
        for(int i = 2; i<val; i++){
            if(val % i == 0){
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.println(val + " is a prime number");
        }
        else {
            System.out.println(val + " is not a prime number");
        }
    }
}
