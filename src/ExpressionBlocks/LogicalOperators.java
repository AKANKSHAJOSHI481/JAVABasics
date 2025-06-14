package ExpressionBlocks;

public class LogicalOperators {
    public static void main(String[] args) {
        // 1. && (Logical AND)

        System.out.println((5 > 3) && (7>2));
        System.out.println((5 < 3) && (7 > 2));
        // 2. || (Logical OR)
        System.out.println((5>3) || (7 < 2));
        // 3.! (Logical NOT)
        System.out.println(!(5>3));
        System.out.println(!(5<3));
    }
}
