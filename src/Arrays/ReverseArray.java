package Arrays;

import java.util.Scanner;


public class ReverseArray {
    public static void main(String[] args) {
//        Reverse an array
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter a array of numbers of size 5 to reverse the array : ");
        for(int i =0; i<5; i++){
            arr[i] = input.nextInt();
        }

        int[] arr2 = reverseArray(arr);
        for (int i= 0; i<5; i++){
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] reverseArray(int[] arr){
        int i = 0, j = 4;
        while(i <= j){
            swaps(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    public static void swaps(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
