## Problem

The original interface `MachineActions` violated the Interface Segregation Principle (ISP) because it contained multiple methods that were not relevant to all implementing classes.

For example:
- The AirConditioner was forced to implement `wash()`, which is not applicable.
- The WashingMachine was forced to implement `heat()` and `cool()`, which are not relevant.

This led to methods being implemented with "operation not supported", which is a clear sign of poor design.

## Solution

The interface was divided into smaller, more specific interfaces based on functionality:

- Powerable: handles turning machines on and off.
- TemperatureControl: handles heating and cooling.
- Washable: handles washing functionality.

Each class now implements only the interfaces that are relevant to its behavior.

## Result

Each class only implements the methods it actually needs, avoiding unnecessary dependencies.

This improves code clarity, flexibility, and maintainability, and fully complies with the Interface Segregation Principle.