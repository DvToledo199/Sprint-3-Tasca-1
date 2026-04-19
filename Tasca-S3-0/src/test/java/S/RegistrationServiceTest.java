package S;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrationServiceTest {

    private RegistrationService createService() {
        return new RegistrationService(
                new EmailValidator(),
                new PasswordValidator(),
                new EmailService(),
                new UserConfirmationService()
        );
    }

    @Test
    void shouldThrowExceptionWhenEmailIsInvalid() {
        RegistrationService service = createService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.register(new User("test", "invalid", "Password123"));
        });
    }

    @Test
    void shouldThrowExceptionWhenPasswordIsInvalid() {
        RegistrationService service = createService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.register(new User("test", "test@test.com", "pass"));
        });
    }

    @Test
    void shouldPassWhenDataIsValid() {
        RegistrationService service = createService();

        assertDoesNotThrow(() -> {
            service.register(new User("test", "test@test.com", "Password123"));
        });
    }
}
