package I;

public class AirConditioner implements MachineActions {

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

    @Override
    public void wash() {
        System.out.println("Wash operation not supported by I.AirConditioner.");
    }
}

