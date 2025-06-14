package Functions;

public class FunctionsDemo {
    public static void main(String[] args) {
        sayHello();
        int a = addNumbers(2, 3);
        System.out.println(a);
    }

    public static void sayHello() {
        System.out.println("Hi Hello");
    }

    public static int addNumbers(int a, int b){
        return a+b;
    }
}
