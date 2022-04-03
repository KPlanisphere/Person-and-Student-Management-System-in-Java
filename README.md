# Person and Student Management System in Java

This repository contains a Java project that demonstrates the concept of inheritance through a person and student management system. The project includes classes for defining person and student attributes, handling user input, and performing operations such as displaying and manipulating data.

## Features

- **Inheritance**: Demonstrates the concept of inheritance by extending a base class `TPersona` to a derived class `TAlumno`.
- **Person and Student Attributes**: Defines attributes such as name, age, address for a person, and additional attributes for a student.
- **User Interaction**: Handles user input to create and manage person and student data.
- **Data Display**: Outputs the details of the people and students managed by the system.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes methods for managing person and student data.

```java
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TPersona> people = new ArrayList<>();
        List<TAlumno> students = new ArrayList<>();

        // Input for Person
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        TPersona person = new TPersona(name, age, address);
        people.add(person);

        // Input for Student
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student address: ");
        String studentAddress = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        TAlumno student = new TAlumno(studentName, studentAge, studentAddress, studentID);
        students.add(student);

        // Display data
        System.out.println("List of people:");
        for (TPersona p : people) {
            System.out.println(p);
        }

        System.out.println("List of students:");
        for (TAlumno s : students) {
            System.out.println(s);
        }
    }
}
```

#### Person Class

The `TPersona` class represents a person with attributes such as name, age, and address. It includes methods for displaying person details.

```java
public class TPersona {
    private String name;
    private int age;
    private String address;

    public TPersona(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
```

#### Student Class

The `TAlumno` class extends `TPersona` and adds attributes specific to a student, such as student ID.

```java
public class TAlumno extends TPersona {
    private String studentID;

    public TAlumno(String name, int age, String address, String studentID) {
        super(name, age, address);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentID;
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Principal`) to start the program.
3.  Follow the prompts to enter the details of persons and students.
4.  The program will display the list of persons and students with their details.

### Classes and Methods

-   `Principal`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `TPersona`: A base class representing a person with attributes and methods for displaying details.
    -   `TPersona(String name, int age, String address)`: Constructor that initializes the person's attributes.
    -   `toString()`: Method that returns the string representation of the person's details.
-   `TAlumno`: A derived class representing a student, extending `TPersona` and adding additional attributes.
    -   `TAlumno(String name, int age, String address, String studentID)`: Constructor that initializes the student's attributes.
    -   `toString()`: Method that returns the string representation of the student's details, including inherited attributes.
