package I;

public class AirConditioner implements Powerable, TemperatureControl {

    @Override
    public void turnOn() {
        System.out.println("I.AirConditioner is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("I.AirConditioner is OFF");
    }

    @Override
    public void heat() {
        System.out.println("I.AirConditioner is heating.");
    }

    @Override
    public void cool() {
        System.out.println("I.AirConditioner is cooling.");
    }
}


