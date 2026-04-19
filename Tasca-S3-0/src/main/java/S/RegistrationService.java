package S;

public class RegistrationService {

    private EmailValidator emailValidator;
    private UserConfirmationService userConfirmationService;
    private EmailService emailService;
    private PasswordValidator passwordValidator;

    public RegistrationService(
            EmailValidator emailValidator,
            PasswordValidator passwordValidator,
            EmailService emailService,
            UserConfirmationService userConfirmationService) {

        this.emailValidator = emailValidator;
        this.passwordValidator = passwordValidator;
        this.emailService = emailService;
        this.userConfirmationService = userConfirmationService;
    }

    public void register(User user) {

        emailValidator.validate(user.getEmail());
        passwordValidator.validate(user.getPassword());

        emailService.sendEmail(user.getEmail());

        if (!userConfirmationService.confirm()) {
            System.out.println("❌ Registration cancelled");
            return;
        }

        System.out.println("✅ S.User registered successfully!");
    }

}
