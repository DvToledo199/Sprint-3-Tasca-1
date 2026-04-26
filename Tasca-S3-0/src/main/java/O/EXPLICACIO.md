

## Problem

The original code violated the Open/Closed Principle (OCP) because it used conditional structures (if/else) to determine which type of instrument should be played.

This meant that every time a new instrument was added, the existing code had to be modified, increasing coupling and making the system harder to maintain.

## Solution

A `Playable` interface was created to define the `play()` method.

Each instrument (`Guitar`, `Piano`, `Drums`) implements this interface and provides its own behavior.

Additionally, an `InstrumentService` was introduced, which receives an object of type `Playable` and executes its `play()` method without needing to know the specific type of instrument.

## Result

The system is now open for extension, as new instruments can be added by creating new classes that implement `Playable`, without modifying existing code.

At the same time, it is closed for modification, since no changes are required in the existing code to support new functionality.

This fully complies with the Open/Closed Principle and improves the flexibility, maintainability, and scalability of the code.