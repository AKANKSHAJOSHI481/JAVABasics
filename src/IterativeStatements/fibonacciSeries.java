package IterativeStatements;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
//        fibonacci series
//        given a integer n, find nth fibonacci number
        int val0 = 0, val1 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to find nth fibonaaci : ");
        int n = input.nextInt();
        int ans = 0;
        for(int i = 2 ; i <= n; i++){
            ans = val0 + val1;
            val0 = val1;
            val1 = ans;

        }
        if(n == 0){
            System.out.println(val0);
        }
        else if(n ==1 ){
            System.out.println(val1);
        }
        else{
            System.out.println(ans);
        }
    }
}
