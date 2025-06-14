package Arrays;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the array of size n : ");
        for(int i= 0;i < n; i++){
            arr[i] = input.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i< n; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        System.out.println("MIN value is : "+ ans);
    }
}
