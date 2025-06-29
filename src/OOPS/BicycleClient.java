package OOPS;

public class BicycleClient {
    public static void main(String[] args) {
        Bicycle sportsBicycle = new Bicycle();

        System.out.println(sportsBicycle.gear);
        sportsBicycle.braking();

        Bicycle TouringBicycle = new Bicycle();
        System.out.println(TouringBicycle.gear);
        TouringBicycle.braking();
    }
}
