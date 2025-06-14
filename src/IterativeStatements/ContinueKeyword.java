package IterativeStatements;

public class ContinueKeyword {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            if(i>4 && i<9){
                continue;
            }
            System.out.println(i);
        }

        int a =1 , j=1;
        while (a<=3){
            System.out.println("Outer loop" + a);
            while (j <= 3){
                if(j==2){
                    j++;
                    continue;
                }
                System.out.println("Inner Loop" + j);
                j++;
            }
            a++;
        }
    }
}
