package OOPS;

public class LampClient {

    public static void main(String[] args) {
        Lamp led = new Lamp();

        Lamp halogen = new Lamp();
        led.turnOff();
        halogen.turnOn();
    }
}
