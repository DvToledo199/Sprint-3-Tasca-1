package I;

public class WashingMachine implements MachineActions {

    @Override
    public void turnOn() {
        System.out.println("I.WashingMachine is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("I.WashingMachine is OFF");
    }

    @Override
    public void heat() {
        System.out.println("Heat operation does not apply to I.WashingMachine.");
    }

    @Override
    public void cool() {
        System.out.println("Cool operation does not apply to I.WashingMachine.");
    }

    @Override
    public void wash() {
        System.out.println("I.WashingMachine is washing clothes.");
    }
}
