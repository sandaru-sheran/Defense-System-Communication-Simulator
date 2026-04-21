# Defense System Communication Simulator 🚁⚓🚜

A multi-window Java Swing application designed to simulate a centralized communication and command network between a main base and various military units (Helicopter, Tank, Submarine). 

This project was developed to demonstrate advanced Object-Oriented Programming (OOP) concepts, specifically focusing on **Interfaces** and inter-object communication patterns.

## 🚀 Features

* **Centralized Command:** A `MainControllerForm` that broadcasts messages and commands to all active units simultaneously.
* **Unit-Specific Interfaces:** Distinct UI forms for the `Helicopter`, `Tank`, and `Submarine`, each reacting to commands based on their specific capabilities.
* **Real-time Data Sync:** Demonstrates how multiple active windows can share state and update dynamically without tight coupling.

## 🛠️ Technical Implementation

* **Language:** Java (Swing/AWT)
* **Architecture Highlights:**
  * **Interface Segregation:** Uses `DefenceInterface.java` to establish a strict contract for how the main controller interacts with the individual units.
  * **Design Patterns:** Implements concepts akin to the **Observer/Mediator pattern**, allowing the central controller to manage multiple vehicle states without hardcoding their specific implementations into the main loop.
  * **Polymorphism:** Treats different vehicle classes as unified interface types to streamline data broadcasting.

## 💻 How to Run

Because this project uses multiple synchronized GUI windows and was built with the NetBeans GUI Builder, running it through an IDE is highly recommended.

1. Clone the repository:
   ```bash
   git clone [https://github.com/yourusername/defense-system-simulator.git](https://github.com/yourusername/defense-system-simulator.git)
