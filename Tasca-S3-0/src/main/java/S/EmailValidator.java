package S;

public class EmailValidator {

    public void validate(String email) {

        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain '@'");
        }

        if (!email.contains(".")) {
            throw new IllegalArgumentException("Email must contain '.'");
        }
    }
}
