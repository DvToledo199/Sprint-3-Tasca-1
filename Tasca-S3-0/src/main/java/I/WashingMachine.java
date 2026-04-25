package I;

public class WashingMachine implements Powerable, Washable {

    @Override
    public void turnOn() {
        System.out.println("I.WashingMachine is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("I.WashingMachine is OFF");
    }

    @Override
    public void wash() {
        System.out.println("I.WashingMachine is washing clothes.");
    }
}
