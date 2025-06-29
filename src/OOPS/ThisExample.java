package OOPS;

public class ThisExample {

    int x, y;

    ThisExample(int x, int y){
        this.x = x;
        this.y = y;

        System.out.println(this.x + " + " + this.y);
        add(this);
        System.out.println(this.x + " + " + this.y);
    }

    void add(ThisExample o){
        o.x += 2;
        o.y += 2;
    }

    public static void main(String[] args) {
        ThisExample onj = new ThisExample(1, 4);
        ThisExample onj2 = new ThisExample(5, 10);

    }
}
