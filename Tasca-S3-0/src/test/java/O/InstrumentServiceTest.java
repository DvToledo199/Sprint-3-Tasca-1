package O;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class InstrumentServiceTest {

    @Test
    void shouldPlayGuitar() {
        Guitar guitar = new Guitar();
        InstrumentService service = new InstrumentService();
        assertDoesNotThrow(() -> {
            service.playInstrument(guitar);
        });
    }

    @Test
    void shouldPlayPiano() {
        Piano piano = new Piano();
        InstrumentService service = new InstrumentService();
        assertDoesNotThrow(() -> {
            service.playInstrument(piano);
        });
    }

    @Test
    void shouldPlayDrums() {
        Drums drums = new Drums();
        InstrumentService service = new InstrumentService();
        assertDoesNotThrow(() -> {
            service.playInstrument(drums);
        });
    }
}
