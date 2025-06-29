package StackMemory;

public class StackMemoryDemo {
    public static void main(String[] args) {
        System.out.println("Hello There");
        int defaultVal = 2;
        defaultVal = multiplyTwo(defaultVal);
        System.out.println(defaultVal);
        defaultVal = multiplyFour(defaultVal);
        System.out.println(defaultVal);
//        greetings();
//        askQuery();
    }

    public static int multiplyTwo(int val){
        val *= 2;
        return val;
    }
    public static int multiplyFour(int val){
        val *= 4;
        return val;
    }
    public static void greetings(){
        System.out.println("Hope you are doing well!");
    }

    public static void askQuery(){
        System.out.println("How may I help you today?");
    }
}
