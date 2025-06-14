package ExpressionBlocks;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
//        Given an year, print whether that year is a leap year or not.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an year to find out whether it is a leap year or not : ");
        int year = input.nextInt();
//        System.out.println(year%4);
//        if(year % 4 == 0){
//            if(year % 100 != 0 && year % 400 != 0){
//                System.out.println("Yes, it is an leap year");
//            }
//            else if(year % 100 == 0 && year % 400 == 0){
//                System.out.println("Yes, it is an leap year");
//            }
//            else if(year % 100 == 0 && year % 400 != 0){
//                System.out.println("No, it is not a leap year");
//            }
//        }
//        else{
//            System.out.println("No, it is not a leap year");
//        }

        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Yes, it is a leap year");
        }
        else{
            System.out.println("No, it is not a leap year");
        }
    }
}
