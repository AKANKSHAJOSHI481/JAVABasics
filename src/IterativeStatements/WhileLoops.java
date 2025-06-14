package IterativeStatements;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int val = input.nextInt();
        int ans = 0;
        int i = 1;
        while(i <= val){
            ans += i;
            i++;
        }
        System.out.println("The answer is " + ans);
    }
}
