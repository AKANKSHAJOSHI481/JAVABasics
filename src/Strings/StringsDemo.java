package Strings;

public class StringsDemo {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Python";
        String third = "JS";
        System.out.println(first + " ," + second);

        String stringName = new String("Akanksha");
        System.out.println(stringName);

//        String Operations
        String great = "Hello World";
        System.out.println("Greet : " + great);
        System.out.println(great.length());

        String over = first.concat(second);
        System.out.println(over);

//        compare strings
        boolean res1 = first.equals(second);
        System.out.println(res1);

        String name1 = new String("Program1");
        String name2 = new String("Program1");
        boolean resu1 = (name1 == name2);
        boolean resu2 = name1.equals(name2);
        System.out.println(resu1 + ", " +  resu2);
    }
}
