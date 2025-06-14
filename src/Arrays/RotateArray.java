package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        // given array - rotate it with a rotation factor

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of array : ");
        int n = input.nextInt();
        System.out.println("Please enter rotation factor : ");
        int k = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the array of size n : ");
        for(int i= 0;i < n; i++){
            arr[i] = input.nextInt();
        }

        Rotate(arr,n, k);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void Rotate(int[] arr,int n, int k){
        k = k%n;
        if(k < 0){
            k += n;
        }
        for(int i =0; i<k; i++){
            int temp = arr[n-1];
            for(int j = n-1; j >= 1; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }
}
