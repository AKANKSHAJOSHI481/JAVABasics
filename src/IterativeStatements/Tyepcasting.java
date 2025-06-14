package IterativeStatements;

public class Tyepcasting {
    public static void main(String[] args) {
//        case 1
        byte by = 10;
        short sh =10;
        int in = 10;
        long ln = 10;
//        by = sh;
        sh = by;
        ln = in;
//        in = ln;



//        case 2

        by = 100;

//        for(byte b = 0; b <= 128; b++){
//            System.out.println("Hello");
//        }

//        case 3
        float f = 5.6f;
        double d = 6.7;
//        f = d;
        d = f;

        in = (int) f;

        byte b = (byte)380;
        System.out.println(b);


//        case 5
        char ch = 'A';
        in = ch;
        System.out.println(in);
        System.out.println(ch);
        System.out.println((int)ch);

        ch = 70;
        System.out.println(ch);
        System.out.println((int)200);
        ch = (char)(ch+1);
        System.out.println(ch);

        ch = 'a' + 1;
        ch = (char)('a' + ch);
        System.out.println(ch);
    }

}
