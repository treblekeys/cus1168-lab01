# Lab 2: Functional Programming in Java

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

### Assignment Details

You will work with Java streams to process collections of numbers. The lab demonstrates three key functional programming
operations:

- **Filtering elements** - Selecting specific elements from a collection
- **Transforming elements** - Transforming elements
- **Reducing** - Combining elements into a single result

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

### Expected Output

```text
Original numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Even numbers: [2, 4, 6, 8, 10]
Doubled numbers: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
Sum of doubled numbers: 110
```

### Hints

- For Task 2: To double each number, use `.map(n -> n * 2)`
- For Task 3: To sum numbers, convert the stream to `IntStream` using `.mapToInt()`
