## Problem

The original class violated the Single Responsibility Principle (SRP) because it had multiple responsibilities.
It handled email validation, password validation, sending emails, and managing user registration.

This means the class had multiple reasons to change, making it harder to maintain and increasing coupling.

## Solution

The responsibilities were separated into different classes:

- EmailValidator: validates the email format.
- PasswordValidator: validates the password.
- EmailService: handles sending emails.
- UserConfirmationService: manages user confirmation.
- RegistrationService: orchestrates the registration process.

## Result

Each class now has a single responsibility, complying with the SRP.

This improves code modularity, makes it easier to maintain, and simplifies testing.