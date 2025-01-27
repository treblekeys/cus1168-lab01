# Lab 1: Functional Programming in Java

### Learning Objectives

- Understand the concept and importance of functional programming in Java development
- Learn how to implement functional programming using Java Streams and Lambda expressions
- Explore practical applications of functional programming in real-world Java projects
- Identify common pitfalls and best practices when working with functional concepts
- Gain hands-on experience with a complete Java example that demonstrates functional programming

### Prerequisites

- Basic understanding of Java programming
- Familiarity with Java collections (`List`, `Arrays`)
- Understanding of basic Java syntax

### What You'll Achieve

- Develop a solid understanding of functional programming concepts
- Implement practical examples using Java streams and lambda expressions
- Enhance your skills in writing more concise and readable code

### Part 1 : Java Streams - Functional Programming Operations

In this lab, you will learn how to use Java streams to process collections of numbers. The lab demonstrates three key functional programming operations:

The goal is to perform the following operations on a list of integers:

- Filter even numbers and print them.
- Double each number in the list and print the transformed list.
- Sum all numbers in the doubled list and print the sum.

```java
package academy.javapro;

import java.util.*;
import java.util.stream.*;

public class FunctionalProgramming {
    public static void main(String[] args) {
        // We create a list of numbers for you
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // First, let's print our original list
        System.out.println("Original numbers: " + numbers);

        // TASK 1: Filter even numbers and print them
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)     // This keeps only even numbers
                .collect(Collectors.toList());  // This collects results into a new list

        System.out.println("Even numbers: " + evenNumbers);

        // TASK 2: Now it's your turn!
        // TODO: Create a stream that doubles each number in the original list
        // Hint: Use .map(n -> ...)
        List<Integer> doubledNumbers = numbers.stream()
                // Write your code here
                .collect(Collectors.toList());

        // TASK 3: Sum all numbers in doubledNumbers
        // TODO: Create a stream that sums all numbers
        // Hint: Use .mapToInt(n -> n).sum()
        int sum = 0; // Replace with your stream code

        // Print results
        System.out.println("Doubled numbers: " + doubledNumbers);
        System.out.println("Sum of doubled numbers: " + sum);
    }
}

```

**Expected Output :**

```text
Original numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Even numbers: [2, 4, 6, 8, 10]
Doubled numbers: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
Sum of doubled numbers: 110
```

**Hints:**

- For Task 2: To double each number, use `.map(n -> n * 2)`
- For Task 3: To sum numbers, convert the stream to `IntStream` using `.mapToInt()`

### Part 2 : Apply Filtering, Mapping, Reducing, and Collecting Results

In this section, we’ll create a class representing a student with a GPA and college year (Freshman, Sophomore, Junior, Senior), and apply functional programming operations on a list of students.

**Functional Operations**

- Filtering: Filter students with a GPA higher than 3.0.
- Mapping: Extract only the names of students whose GPA is higher than 3.0.
- Reducing: Calculate the average GPA of all students.
- Collecting: Collect all students into a list who are Juniors.

```java
package academy.javapro;

import java.util.*;
import java.util.stream.*;

public class StudentStreamLab {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.5, "Junior"),
                new Student("Bob", 3.8, "Senior"),
                new Student("Charlie", 2.9, "Sophomore"),
                new Student("David", 3.1, "Freshman"),
                new Student("Eve", 3.9, "Junior")
        );

        // TODO - Filtering: Students with GPA > 3.0
        
        // TODO - Mapping: Extract names of students with GPA > 3.0

        // TODO - Reducing: Calculate the average GPA of all students

        // TODO - Collecting: Collect all "Junior" students into a list
    }
}
```

**Expected Output :**

```text
Students with GPA > 3.0:
Alice (Junior) - GPA: 3.5
Bob (Senior) - GPA: 3.8
David (Freshman) - GPA: 3.1
Eve (Junior) - GPA: 3.9

High GPA student names:
Alice
Bob
David
Eve

Average GPA: 3.46

Juniors:
Alice (Junior) - GPA: 3.5
Eve (Junior) - GPA: 3.9
```