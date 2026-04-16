public class UserConfirmationService {

    public boolean confirm() {
        boolean userConfirmed = true;

        if (!userConfirmed) {
            System.out.println("⚠️ User did not confirm registration.");
            return false;
        }

        return true;
    }
}
