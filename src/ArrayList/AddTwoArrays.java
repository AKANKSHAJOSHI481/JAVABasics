package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter size of array 1");
        int n1 = input.nextInt();
        System.out.println("Please enter array 1 : (Sorted) ");
        ArrayList<Integer> array1 = new ArrayList<>(n1);
        for(int i = 0; i<n1; i++){
            array1.add(input.nextInt());
        }
        System.out.println("Please enter size of array 2");
        int n2 = input.nextInt();
        System.out.println("Please enter array 2 : (Sorted) ");
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int j = 0; j<n2; j++){
            array2.add(input.nextInt());
        }
        ArrayList<Integer> array3 = AddTwoArrays(array1, array2);
        System.out.println("Intersection elements between arr1 and arr2 : ");
        System.out.println(array3);
    }

    public static ArrayList<Integer> AddTwoArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        int i = arr1.size()-1;
        int j = arr2.size()-1;
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = 0;
            if(i >= 0){
                sum += arr1.get(i);
            }
            if(j >= 0){
                sum += arr2.get(j);
            }
            sum += carry;
            int rem = sum%10;
            carry = sum/10;
            res.add(0, rem);
            i--;
            j--;
        }
        if(carry != 0){
            res.add(0, carry);
        }
        return res;
    }
}
