## Problem

The original design violated the Dependency Inversion Principle (DIP) because the `ServicePerson` class depended directly on a concrete class (`MySQL`).

This created strong coupling, making the code difficult to modify, extend, and test.

## Solution

An abstraction (`PersonRepository`) was introduced to decouple the service from the concrete implementation.

The `ServicePerson` now depends on this interface instead of a specific class.

The concrete implementation (`MySQL`) implements the interface, and the dependency is injected into the service.

## Result

The system is now more flexible and easier to maintain.

Different implementations (e.g., other databases or fake repositories for testing) can be used without modifying the service.

This fully complies with the Dependency Inversion Principle.