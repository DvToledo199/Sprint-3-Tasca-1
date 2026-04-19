package S;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @org.junit.jupiter.api.Test
    void shouldThrowExceptionWhenEmailIsNull() {
        EmailValidator validator = new EmailValidator();

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validate(null);
        });
    }

    @org.junit.jupiter.api.Test
    void shouldThrowExceptionWhenEmailIsInvalid() {
        EmailValidator validator = new EmailValidator();

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validate("invalidemail");
        });
    }

    @org.junit.jupiter.api.Test
    void shouldPassWhenEmailIsValid() {
        EmailValidator validator = new EmailValidator();

        assertDoesNotThrow(() -> {
            validator.validate("test@test.com");
        });
    }
}