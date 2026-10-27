# JavaFX Calculator

A desktop calculator application developed in **Java** using **JavaFX** and **FXML** for a CIST 2372 Java 2 coursework project at Gwinnett Technical College.

## Project overview

This project demonstrates how a JavaFX graphical user interface can connect to Java application logic. The interface was designed with **Scene Builder**, and a controller class handles user actions.

## Features

- Graphical calculator interface built with JavaFX
- Arithmetic operations: addition, subtraction, multiplication, and division
- Button-driven input and calculation
- FXML layout connected to a Java controller
- Exit menu action

  <img width="1134" height="393" alt="image" src="https://github.com/user-attachments/assets/3cfe175d-6851-4cb2-af82-54d16f103353" />


> **Note:** The feature list reflects the intended calculator assignment. Check it against your final submitted code and remove or revise anything that is not implemented.

## Technologies and concepts

- **Java** — application and calculation logic
- **JavaFX** — desktop user interface
- **FXML** — declarative user-interface layout
- **Scene Builder** — visual interface design
- **Event handling** — responding to calculator button and menu actions
- **IntelliJ IDEA** — development environment

## Project files

Your uploaded project may include files similar to these (use the actual filenames and folders from your IntelliJ project):

```text
javafx-calculator/
├── README.md
├── pom.xml                    # If the project uses Maven
└── src/
    └── main/
        ├── java/
        │   ├── J208_1.java
        │   ├── J208_1Controller.java
        │   └── module-info.java  # If the project is modular
        └── resources/
            └── J208_1.fxml
```

- **Application class:** Starts JavaFX and opens the calculator window.
- **Controller class:** Responds to user interface events and performs calculations.
- **FXML file:** Defines the calculator's visual layout and controls.

## How to run

1. Install a compatible Java Development Kit (JDK) and JavaFX SDK, or use the JavaFX dependencies configured in your project.
2. Open the project in **IntelliJ IDEA**.
3. Ensure the project dependencies and JavaFX run configuration are correct.
4. Run the application's main class (`J208_1.java`, if that is the name in your project).
5. Use the calculator controls to perform arithmetic operations.

If your project uses Maven, consult its `pom.xml` for the configured JavaFX version and run instructions.

## Screenshot

Add a screenshot of the running application to a folder such as `screenshots/`, then update the image link below:

<!-- Uncomment after adding a screenshot at this path:
![JavaFX Calculator running](screenshots/calculator.png)
-->

## What I learned

This project helped me practice connecting a visual interface to Java code, using event handlers, organizing code into an application class and controller, and debugging JavaFX application behavior.

## Author

**Deuane Hessel**  
Computer Programming — Gwinnett Technical College  
GitHub: [DPHessel](https://github.com/DPHessel)

## Academic note

This application was created as a coursework project and is shared for learning and portfolio demonstration, subject to instructor/course sharing rules.
