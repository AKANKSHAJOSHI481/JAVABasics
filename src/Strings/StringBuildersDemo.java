package Strings;

public class StringBuildersDemo {
    public static void main(String[] args) {
         String str =  "hello";
         StringBuilder sb = new StringBuilder("abc");
         StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb);
        System.out.println(sb1);

        // append
        sb1.append("abc");
        System.out.println(sb1);

//        insert

        sb.insert(0, 'z');
        System.out.println(sb);
        sb.insert(sb.length(), 'z');
        System.out.println(sb);

        sb.setCharAt(0, 's');
        System.out.println(sb);

        String s1 = sb.toString();
        System.out.println(s1);
    }
}
