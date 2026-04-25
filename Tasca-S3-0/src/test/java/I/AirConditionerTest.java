package I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    void shouldTurnOnAndOffAndControlTemperature() {
        AirConditioner ac = new AirConditioner();

        assertDoesNotThrow(() -> {
            ac.turnOn();
            ac.turnOff();
            ac.heat();
            ac.cool();
        });
    }
}