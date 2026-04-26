
## Problem

The original design violated the Liskov Substitution Principle (LSP) because all subclasses of `Character` were forced to implement the `takeDamage()` method, even when it did not make sense for them.

For example, the `Ghost` class cannot receive damage, but it still implemented the method by throwing an exception. This caused runtime errors when all objects were treated as `Character`.

## Solution

The responsibilities were separated into more specific interfaces:

- `Attackable` for classes that can attack.
- `Damageable` for classes that can receive damage.

Each class now implements only the interfaces that match its real behavior.

Additionally, a `CharacterService` was introduced to manage interactions between characters. It checks whether the target can receive damage before applying it, preventing runtime errors.

## Result

All classes now respect the expected behavior and can be used safely without breaking the system.

Classes that cannot receive damage, such as `Ghost`, simply do not implement the `Damageable` interface, avoiding invalid behavior.

This results in a more robust, flexible, and maintainable system, fully complying with the Liskov Substitution Principle.