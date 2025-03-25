# Observer Pattern

The **Observer Pattern** is a behavioral design pattern that defines a one-to-many relationship between objects. When the state of one object (the **Subject**) changes, all dependent objects (the **Observers**) are notified automatically. This pattern is widely used in event-driven systems, GUI frameworks, and more.

## Table of Contents

- [Overview](#overview)
- [Components](#components)
- [Implementation](#implementation)
- [Usage Example](#usage-example)
- [Advantages](#advantages)
- [Real-World Applications](#real-world-applications)
- [License](#license)

## Overview

The Observer pattern allows objects to be notified of changes in another object without being tightly coupled. It is useful in scenarios where an object (the **Subject**) needs to notify many other objects (the **Observers**) about its state change, such as in event-driven programming or real-time data processing systems.

This pattern is widely used in Java, especially in GUI libraries and event handling systems.

## Components

The Observer pattern consists of three main components:

1. **Subject**: The object that maintains a list of **Observers** and notifies them when its state changes.
2. **Observer**: The object that needs to be notified when the **Subject**'s state changes. It defines the update() method.
3. **Client**: The object that attaches and detaches **Observers** and triggers state changes in the **Subject**.

## Implementation

### 1. **Subject Interface**

The Subject interface declares methods for attaching, detaching, and notifying observers.

java
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
} 
Vedio link : https://drive.google.com/file/d/1VImTTYv9MaxkW5bJvEUb8A5OovH1oi-Q/view?usp=drive_link
