package OOPS;

public class Main {

    private String name;

//    No Arg Constructor.
    Main(){
        System.out.println("Constructor called");
        name = "Akanksha";
    }
// Parametrised constructor
    Main(String name){
        name = name;
        System.out.println(name + " is the name");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Name is " + obj.name);

        Main obj1 = new Main("Abhay Kumar Ray");
    }
}
