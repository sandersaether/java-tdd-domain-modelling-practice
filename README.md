# Java Poker Challenge

## Learning Objectives
- Build a simple program using the content from the first week of the Java course
- Use git & GitHub to commit work and open a Pull Request

# Main Task

Given two pairs of cards, calculate the winning pair. The method `winningPair()` should accept two arrays with two cards in each, and return the highest pair found as the winning pair. Only pairs can win, so if neither hand contains a pair then an empty array should be returned. Assume that there will be no draws (ie the two pairs will be different to each other).

## Acceptance Criteria

```java
package com.booleanuk;

public class Main {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.winningPair(new String[]{"Q", "6"}, new String[]{"J", "K"}); // => []

        poker.winningPair(new String[]{"9", "9"}, new String[]{"7", "7"}); // => ["9", "9"]

        poker.winningPair(new String[]{"K", "3"}, new String[]{"K", "K"}); // => ["K", "K"]
    }
}
```

## Extension Criteria

For the extended criteria, you may need to look up functions and techniques you have not used before. 
You could use Arrays, ArrayLists or HashMaps as well as any other Java objects even if we have yet to use them in any of the workshops.

### Array of Pairs - Extension 1

The `winningPairFromArray()` method should accept an array of arrays, each of which contain a pair of cards, and calculate the winning pair from that. For example, the function should be able to take in `{{"A", "A"}, {"3", "7"}, {"K", "K"}}` and return `["A", "A"]`. Assume that there are no draws.

This is known as a two-dimensional array. There is no limit to the amount of arrays contained within the array.

**Example**
```java
package com.booleanuk;

public class Main {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.winningPairFromArray({new String[]{"K", "5"}, new String[]{"3", "7"}}); // => []

        poker.winningPairFromArray({new String[]{"K", "K"}, new String[]{"A", "A"}}); // => ["A", "A"]

        poker.winningPairFromArray({new String[]{"4", "3"}, new String[]{"6", "6"}, new String[]{"7", "7"}, new String[]{"3", "3"}}); // => ["7", "7"]
    }
}
```

### Three of a Kind - Extension 2

Similar to the above, the `winningThreeCardHand()` method should calculate the winning hand from an array that can contain both pairs *and* three of a kind. Each hand may contain either two or three cards, a three card hand containing a pair could win if the pair is higher than any other pair and there are no three of a kind hands. A hand with three of a kind will always beat a pair. If neither a pair nor a three of a kind are present then no hand wins.

**Example**
```java
package com.booleanuk;

public class Main {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.winningThreeCardHand({new String[]{"K", "5"}, new String[]{"3", "7"}, new String[]{"K", "J", "4"}}); // => []

        poker.winningThreeCardHand({new String[]{"5", "5", "3"}, new String[]{"7", "7", "7"}}); // => ["7", "7", "7"]

        poker.winningThreeCardHand({new String[]{"J", "J"}, new String[]{"9", "9"}, new String[]{"6", "6", "4"}}); // => ["J", "J"]
    }
}
```

### Poker Anyone - Extension 3

Extend the game further to enable it to deal with more situations. Can you build a complete Poker class?

Some possible extensions might include:
- All hands have 5 cards and the winning hierarchy is as follows:
  - 4 of a kind -> Full House (3 of one kind, 2 of another) -> 3 of a kind -> 2 Pairs (2 of one card, 2 of another) -> 1 Pair -> High card
  - You will need to implement code to deal with draws between hands, eg if two players have the same 2 pairs then the highest value of the fifth card wins
- How could you deal with suits? If you implement suits then can you make a fully functioning poker simulator?
- Can you implement a deck of cards with shuffling functionality and the ability to deal random hands to players?

If you choose to implement any of these then you will also need to add tests to test that they work, you can access documentation for testing here: [JUnit5](https://junit.org/junit5/) but you can also use the existing tests to provide you with information about how to test them.

## Set up instructions
- Fork this repository and clone the forked version to your machine
- Open the root directory of the project in IntelliJ
- Implement the requirements listed in comments in the `./src/main/java/com.booleanuk/core/Exercise.java` file
- When ready to test your solution, open the `./src/test/java/com.booleanuk/core/ExerciseTest.java` file and click a "Run Test" button. You can either run the entire test suite via figure 1 in the screenshot below, or run a specific test via figure 2.

![](./assets/run-a-test.PNG)

## Test Output

When you run a test, it's either going to pass or fail. When it fails, you'll be presented with a big red stream of text. This is called a stack trace and, though intimidating, does contain some useful information.

One of the core skills of a developer is debugging stack traces like this. The stack trace details in which classes & files the failure happened, and gives you a line number at the end. Most of the lines in the stack trace are irrelevant most of the time, you want to try and identify the files that you're actually working with.

In the sample screenshot below, we've tried to complete the first step of the exercise but provided an invalid value. Then we run the test associated with it and we see a big red stack trace, a test failure.

At the top, we see `expected: <32> but was: <33>`. This means the test expected the value to be 32, but the value the student provided was 33. We can see this in the code snippets at the top of the screenshot.

In the stack trace itself, we see this line: `at app//com.booleanuk.core.ExerciseTest.shouldBeAged32(ExerciseTest.java:20)`. This is helpful! This tells us the exact line in the ExerciseTest.java file (line 20) where the failure happened, as well as the method name (shouldBeAged32), helping us to identify where the issue began. This is the kind of thing you need to look for; a relevant file name, method name, class name and line number to give you a good starting point for debugging.

![](./assets/test-failure.PNG)
