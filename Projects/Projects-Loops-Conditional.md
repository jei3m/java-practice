## **1. Print Numbers 1 to 10 (FOR loop)**

- No input needed
- Just print numbers 1 through 10 using a **for loop**

**Expected Output:**

```
--- Numbers 1 to 10 ---
1
2
3
4
5
6
7
8
9
10
```

**Code:**

```java
public class NumbersOneToTen {
    public static void main(String[] args) {
        System.out.println("--- Numbers 1 to 10 ---");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```

---

## **2. Print Numbers 1 to N (FOR loop)**

- Input: N
- Print numbers 1 through N using a **for loop**

**Expected Output:**

```
--- Numbers 1 to N ---
Enter N: 5
1
2
3
4
5
```

**Code:**

```java
import java.util.Scanner;

public class NumbersOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("--- Numbers 1 to N ---");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
```

---

## **3. Print Even Numbers Only (FOR loop + IF)**

- Input: N
- Print only the **even** numbers from 1 to N

**Expected Output:**

```
--- Even Numbers ---
Enter N: 10
2
4
6
8
10
```

**Code:**

```java
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("--- Even Numbers ---");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```

---

## **4. Countdown Timer (FOR loop)**

- Input: Starting number
- Count down to 0 using a **FOR loop**

**Expected Output:**

```
--- Countdown ---
Enter starting number: 5
5
4
3
2
1
Blast off!
```

**Code:**

```java
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.println("--- Countdown ---");

        for (int i = start; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Blast off!");
    }
}
```

---

## **5. Keep Asking Until "yes" (WHILE loop)**

- Ask the user: "Do you want to continue? (yes/no)"
- Keep asking **while** the answer is NOT "yes"

**Expected Output:**

```
--- Ask Until Yes ---
Do you want to continue? (yes/no): no
Do you want to continue? (yes/no): maybe
Do you want to continue? (yes/no): yes
Thank you!
```

**Code:**

```java
import java.util.Scanner;

public class AskUntilYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 1;

        System.out.println("--- Ask Until Yes ---");

        while (answer != 1) {
            System.out.print("Do you want to continue? [1] Yes [2] No: ");
            answer = sc.next();
        }

        System.out.println("Thank you!");
    }
}
```

---

## **6. Sum of Numbers 1 to N (FOR loop)**

- Input: N
- Add all numbers from 1 to N using a **for loop**

**Expected Output:**

```
--- Sum Calculator ---
Enter N: 5
Sum: 15
```

**Code:**

```java
import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("--- Sum Calculator ---");
        System.out.println("Sum: " + sum);
    }
}
```

---

## **7. Guess the Number (WHILE + IF)**

- Secret number is **7**
- Keep asking until guessed correctly
- Give "Too high" / "Too low" hints

**Expected Output:**

```
--- Guess the Number ---
Guess: 10
Too high!
Guess: 3
Too low!
Guess: 7
Correct!
```

<!-- **Code:**

```java
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 7;
        int guess = 0;

        System.out.println("--- Guess the Number ---");

        while (guess != secret) {
            System.out.print("Guess: ");
            guess = sc.nextInt();

            if (guess > secret) {
                System.out.println("Too high!");
            } else if (guess < secret) {
                System.out.println("Too low!");
            }
        }

        System.out.println("Correct!");
    }
}
``` -->
