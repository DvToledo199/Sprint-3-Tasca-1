package S;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    void shouldThrowExceptionWhenPasswordIsNull() {
        PasswordValidator validator = new PasswordValidator();

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validate(null);
        });
    }

    @Test
    void shouldThrowExceptionWhenPasswordIsTooShort() {
        PasswordValidator validator = new PasswordValidator();

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validate("Abc1");
        });
    }

    @Test
    void shouldThrowExceptionWhenPasswordHasNoUppercase() {
        PasswordValidator validator = new PasswordValidator();

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validate("password123");
        });
    }

    @Test
    void shouldPassWhenPasswordIsValid() {
        PasswordValidator validator = new PasswordValidator();

        assertDoesNotThrow(() -> {
            validator.validate("Password123");
        });
    }
}
