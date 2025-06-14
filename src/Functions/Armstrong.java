package Functions;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Armstrong {
    public static void main(String[] args) {
//        A positive integer is called armstrong if num = abc then abc = a^n + b^n + c^n;
//        153 = 1^3 + 5^3 + 3^3;
//        1634 = 1^4 + 6^4 + 3^4 + 4^4

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to know whether it is Armstrong number or not : ");
        int val = input.nextInt();
        boolean ans = isArmstrong(val);
        System.out.println(ans);
    }

    public static boolean isArmstrong(int n){
        int nod = numberOfDigits(n);
        int ans = 0;
        int ans2 = n;
        for(int i = 0; i<nod; i++){
            ans += pow(ans2%10, nod);
            ans2 = ans2/10;
        }
        if(ans == n) return true;
        else return false;

    }
    public static int numberOfDigits(int n){
        int ans = 0;
        while(n > 0){
            ans++;
            n = n/10;
        }
        return ans;
    }
}
