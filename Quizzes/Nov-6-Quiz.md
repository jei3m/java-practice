# Part I. Identify the Control Structure

**Instructions:** Identify the correct control structure being described.

1.  Used to execute a block of code when a condition is true.
2.  Provides an alternative action when if the condition is false.
3.  Used when a variable has multiple possible values.
4.  Repeats a block of code while a condition is true.
5.  Executes the code at least once before checking the condition.
6.  Used when the number of repetitions is already known.
7.  Terminates a loop immediately.
8.  Skips the current iteration and proceeds to the next one.
9.  Transfers control back to the caller of a method.
10. A loop inside another loop.

---

# Part II. Predict the Output

**Instructions:** Analyze each java code snippet and write the expected output. Try to encode to Compiler

### Code Snippet 1
```java
int x = 10;
if (x > 5) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}
```
**Output:**
<br><br><br>

### Code Snippet 2
```java
for (int i = 1; i <= 3; i++) {
    System.out.println(i);
}
```
**Output:**
<br><br><br>

### Code Snippet 3
```java
int x = 3;
while (x > 0) {
    System.out.println(x);
    x--;
}
```
**Output:**
<br><br><br>

### Code Snippet 4
```java
for (int i = 1; i <= 3; i++) {
    if (i == 2) {
        continue;
    }
    System.out.println(i);
}
```
**Output:**
<br><br><br>

### Code Snippet 5
```java
for (int i = 1; i <= 3; i++) {
    if (i == 2) {
        break;
    }
    System.out.println(i);
}
```
**Output:**
<br><br><br>

---

# Part III. Application

**Instructions:** Create a simple java program for each situation.

1.  **Even or Odd:** Ask the user to enter a number and determine whether it is even or odd.
2.  **Counting Numbers:** Display numbers from 1 to 10 using a for loop.