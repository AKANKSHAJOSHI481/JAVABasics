package OOPS;

public class Main2 {

    String lang;

    Main2(){
        lang = "Java";
    }

    Main2(String language){
        lang = language;
    }

    public void getName(){
        System.out.println("language is " + lang);
    }

    public static void main(String[] args) {
        Main2 obj = new Main2();
        obj.getName();
        Main2 obj1 = new Main2("Python");
        obj1.getName();
    }
}
