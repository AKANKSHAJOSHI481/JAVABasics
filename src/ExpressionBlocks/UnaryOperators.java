package ExpressionBlocks;

public class UnaryOperators {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(++num);
        int a = 12, b =12;
        int res1, res2, res3, res4;
        System.out.println(a);
        res3 = a++;
        System.out.println(res3);
        res4 = b--;
        System.out.println(res4);
        res1 = ++a;
        System.out.println(res1);
        res2 = --b;
        System.out.println(res2);

    }
}
