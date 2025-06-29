package OOPS;

public class Lamp {

    boolean isOn;

    void turnOn(){
        isOn=true;
        System.out.println("Lamp is turned On");
    }

    void turnOff(){
        isOn = false;
        System.out.println("Lamp is turned Off");
    }
}
