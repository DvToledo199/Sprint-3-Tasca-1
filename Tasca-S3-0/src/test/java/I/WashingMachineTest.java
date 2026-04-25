package I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WashingMachineTest {

    @Test
    void shouldTurnOnOffAndWash() {
        WashingMachine wm = new WashingMachine();

        assertDoesNotThrow(() -> {
            wm.turnOn();
            wm.turnOff();
            wm.wash();
        });
    }
}