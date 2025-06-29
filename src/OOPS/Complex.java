package OOPS;

public class Complex {

    private int a, b;

    private Complex(int i, int j){
        this.a = i;
        this.b = j;
    }

    private Complex(int i){
        this(i, i);
    }

    private Complex(){
        this(0);
    }
    @Override
    public String toString(){
        return this.a + " + " + this.b;
    }
    public static void main(String[] args) {
        Complex cp = new Complex(2, 3);
        System.out.println(cp);

        Complex cp2 = new Complex(3);
        System.out.println(cp2);

        Complex cp3 = new Complex();
        System.out.println(cp3);


    }
}
