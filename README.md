# Library Management System

A robust, console-based Library Management System developed in Core Java using Object-Oriented Programming (OOP) principles. This application enforces strict business logic limits for library operations through a clean, menu-driven interface, allowing librarians to seamlessly manage books, students, and transaction records.

## Features

* **Book Management**: Add new titles to the catalog and view all available records.
* **Member Management**: Register students and view detailed student records.
* **Transaction Engine**: Seamlessly issue and return books with real-time availability updates.
* **Borrow Limit Validation**: Strict business rules to prevent students from exceeding their maximum allowed books.
* **Exception Fault-Tolerance**: Custom exceptions handling business rule violations (e.g., over-borrowing limits, identity collisions, or out-of-stock titles).
* **Menu-Driven Interface**: An interactive, console-based CLI loop for intuitive user interaction.

## OOP Concepts Implemented

* **Encapsulation**: Strict use of private class state variables (e.g., in `Book`, `Library`) exposed safely via public getters, setters, and structural accessors.
* **Inheritance**: A hierarchical structure where `Student` and `Librarian` subclasses inherit core attributes and behaviors from an abstract `Person` base class.
* **Polymorphism**: Runtime method overriding utilized for dynamic display functions and profile rendering across different user types.
* **Abstraction**: Decoupled design featuring explicit interface mappings (`LibraryOperations`) separating architectural definitions from local business logic implementations.

## Architecture & Technologies Used

* **Language/Platform**: Java (Core Java)
* **Data Structures**: `ArrayList` for dynamic, in-memory collection management of books, users, and logs.
* **I/O Management**: Console Input/Output via `Scanner` for user interactions.

### Component Mapping

```
├── main
│   └── Main.java (Application entry point & CLI Menu)
├── model
│   ├── Book.java
│   ├── Person.java (Abstract)
│   ├── Student.java
│   └── Librarian.java
├── service
│   ├── LibraryOperations.java (Interface)
│   └── LibraryManager.java (Implementation)
└── exception
    ├── BorrowLimitExceededException.java
    └── ItemUnavailableException.java

```

## Run Instructions

1. **Navigate** to the root directory containing the package layers.
2. **Compile** the source files via your CLI:
```bash
javac main/Main.java model/*.java service/*.java exception/*.java

```


3. **Execute** the compiled application:
```bash
java main.Main

```
