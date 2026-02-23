# Day-06

## Operators

### 1. Arithematic operators:

- `+`, `-`, `*`, `/`, `%`

```java
int a = 10;
int b = 20;

// Arithmetic Operators
System.out.println("a + b = " + (a + b)); // Addition
System.out.println("a - b = " + (a - b)); // Subtraction
System.out.println("a * b = " + (a * b)); // Multiplication
System.out.println("a / b = " + (a / b)); // Division
System.out.println("a % b = " + (a % b)); // Modulus
```

### 2. Increment and Decrement Operator:

- `++`, `--`

```java
int d = 5;
System.out.println("d++: " + (d++)); //* Post-increment
System.out.println("d: " + d);       // d = 6
System.out.println("++d: " + (++d)); //* Pre-increment
System.out.println("d: " + d); // d= 7

System.out.println("d--: " + (d--)); //* Post-decrement
System.out.println("d: " + d); // d = 6
System.out.println("--d: " + (--d)); //* Pre-decrement
System.out.println("d: " + d); // d = 5
```

### 3. Relational Operators:

- `==`, `!=`, `<`, `>`, `<=`, `>=`

```java
System.out.println("a == b: " + (a == b)); // Equal to
System.out.println("a != b: " + (a != b)); // Not equal to
System.out.println("a > b: " + (a > b));   // Greater than
System.out.println("a < b: " + (a < b));   // Less than
System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
System.out.println("a <= b: " + (a <= b)); // Less than or equal to
```

### 4. Assignment Operators

- `=`, `+=`, `-=`..

```java
int c = 5;
c += 10; // c = c + 10
System.out.println("c after += 10: " + c);
```

#### 5. Bitwise Operators

- `&`, `|`, `^`, `~`, `>>`, `<<`, `>>>`, `<<<`, `&=`, `|=`, `>>=`, `<<<=`, `>>>=`

Truth table:

```
A  |  B | A&B   | A|B | A^B | ~A | ~B | 
0  | 0  |   0   |  0  | 0   | 1  | 1  |
0  | 1  |   0   |  1  | 1   | 1  | 0  |
1  | 0  |   0   |  1  | 1   | 0  | 1  |
1  | 1  |   1   |  1  | 0   | 0  | 0  |
```