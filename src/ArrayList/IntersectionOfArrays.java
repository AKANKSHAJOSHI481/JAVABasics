package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfArrays {
    public static void main(String[] args) {
//        Given 2 sorted arrays, tell intersection of elements
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
        ArrayList<Integer> array3 = findIntersection(array1, array2);
        System.out.println("Intersection elements between arr1 and arr2 : ");
        System.out.println(array3);
    }

    public static ArrayList<Integer> findIntersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) == arr2.get(j)){
                if(res.size() > 0){
                    if(!(res.get(res.size() - 1) == arr2.get(j))){
                        res.add(arr1.get(i));
                    }
                }
                else{
                    res.add(arr1.get(i));
                }
                i++;
                j++;
            } else if(arr1.get(i) < arr2.get(j)){
                i++;
            }
            else{
                j++;
            }
        }
        return res;
    }
}
