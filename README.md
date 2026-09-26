# Lab Task 06 – Abstract Data Types (ADT)

## Description
This repository contains the solution for **Lab Task 06: Abstract Data Types (ADT)**
from the **Software Construction** course (5th Semester, Software Engineering, UET
Abbottabad). The lab covers defining ADTs with Java interfaces, the difference between
an ADT and a data structure, encapsulation, and programming to an abstraction.

## Objective
Implement simple ADTs in Java, use interfaces to define contracts, and apply
abstraction and encapsulation principles.

## Technologies Used
- Java 17
- Apache Maven
- NetBeans IDE (Maven project)
- JUnit 5 (Jupiter)

## Project Structure
```
ADTLab/
├── pom.xml
├── src/
│   ├── main/java/
│   │   ├── AbstractDataTypes/
│   │   │   ├── Stack.java           # Guided manual walkthrough - the ADT contract
│   │   │   └── ArrayStack.java      # Guided manual walkthrough - concrete implementation
│   │   ├── labtasks/
│   │   │   ├── Student.java             # Lab Task 2 - encapsulation
│   │   │   └── ListAbstractionDemo.java # Lab Task 3 - programming to an abstraction
│   │   └── homework/
│   │       ├── Book.java                  # Homework 1 - data holder
│   │       ├── LibrarySystem.java         # Homework 1 - the ADT contract
│   │       ├── LibraryImplementation.java # Homework 1 - concrete implementation (HashMap)
│   │       ├── StudentCollection.java     # Homework 2 - the ADT contract
│   │       └── StudentCollectionImpl.java # Homework 2 - concrete implementation (ArrayList)
│   └── test/java/            (mirrors the structure above)
└── README.md
```

## What Was Implemented

**Guided walkthrough :**
- `Stack<T>` (package `AbstractDataTypes`) — the ADT contract: `push`, `pop`, `peek`,
  `isEmpty`, `size`.
- `ArrayStack<T>` — the concrete, fixed-capacity array-based implementation given in
  the manual, using `private Object[] elements` and `private int top` to encapsulate
  internal storage.

**Lab Tasks (3):**
1. Tested `ArrayStack`'s LIFO behavior: `push(10); push(20); push(30);` followed by
   `pop()` returns `30`, and further pops return `20` then `10`.
2. `Student` — private `id`, `name`, `cgpa` fields with public getters only; a
   commented-out block in `StudentTest` shows the direct-field-access lines that fail
   to compile if uncommented, proving encapsulation.
3. `ListAbstractionDemo` — builds the same logical list once backed by `ArrayList` and
   once by `LinkedList`, both through a `List<String>`-typed variable, showing client
   code depends only on the interface.

**Homework (2):**
1. `LibrarySystem` / `LibraryImplementation` — a library ADT (`addBook`, `removeBook`,
   `searchBook`, `issueBook`, `returnBook`) backed by a `HashMap<String, Book>` keyed
   by book ID.
2. `StudentCollection` / `StudentCollectionImpl` — a student-collection ADT
   (`addStudent`, `removeStudent`, `findStudent`, `getSize`, `isEmpty`) backed by an
   `ArrayList<Student>`, reusing the `Student` class from Lab Task 2.

## How to Run the Code
- **In NetBeans:** open the project (File > Open Project, select the folder containing
  `pom.xml`), then right-click the project → **Run**.
- **From the command line:** 
  ```sh
  mvn compile
  ```
- Note: none of these classes have a `main()` method — they're exercised through the
  JUnit tests below, which is expected for this kind of lab.

## How to Run the Tests
- **In NetBeans:** right-click the project → **Test**, or right-click an individual
  test class → **Test File**.
- **From the command line:**
  ```sh
  mvn test
  ```

## Testing
JUnit 5 (Jupiter) was used for all test classes, covering the LIFO stack behavior,
encapsulation (getters plus a compile-error demonstration), interchangeable List
implementations, and the Library/StudentCollection ADTs' normal and not-found/edge
cases.

## Author
Muhammad Umar Basit – 24ABSWE0003

## Course
Software Construction and Development, 5th Semester Software Engineering,
UET Abbottabad Campus. Instructor: Engr. Rizwan Shah.
