package loopsinjava;
/*break and continue Statements in Java
In Java, break and continue are control statements used to alter the flow of loops like for, while, and do-while. Both of these can also be used with labels for more complex control flows, especially when dealing with nested loops.

1. break Statement
Purpose: The break statement is used to exit a loop immediately. When break is encountered inside a loop, the loop is terminated, and the control flow jumps to the statement following the loop.
*/

public class lableAndbreak {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            System.out.print(i);
        }
// Output: 1 2 3 4

*/

        /*Labeled break: In nested loops, a labeled break can be used to exit not just the inner loop but also the outer loop or any specific loop that is labeled.
Example:
*/
      /*  outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j == 4) {
                    break outerLoop; // Exit the outer loop when the condition is met
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }*/
// Output: i = 1, j = 1
//         i = 1, j = 2
//         i = 1, j = 3
//         i = 2, j = 1


        /*2. continue Statement
Purpose: The continue statement is used to skip the current iteration of a loop and proceed to the next iteration. When continue is encountered, the remaining code in the loop's current iteration is skipped.
*/

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the iteration when i equals 3
            }
            System.out.println(i);
        }
// Output: 1 2 4 5
/*Labeled continue: In nested loops, a labeled continue can be used to skip iterations of an outer loop, not just the inner loop.
* */

   /*break exits the loop entirely.
continue skips to the next iteration of the loop.
Labeled break and continue provide finer control over nested loops, allowing you to exit or skip iterations of specific loops
*/

    }

}




/*Let's break down the code step by step:

### Code:
```java
outerLoop:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i * j == 4) {
            break outerLoop; // Exit the outer loop when the condition is met
        }
        System.out.println("i = " + i + ", j = " + j);
    }
}
```

### Line-by-Line Explanation:

1. **`outerLoop:`**
   - This is a label named `outerLoop`. Labels in Java are used to identify a particular loop or block of code. In this case, `outerLoop` is associated with the outer `for` loop that follows. Labels are typically used in conjunction with `break` or `continue` statements to control the flow of nested loops.

2. **`for (int i = 1; i <= 3; i++) {`**
   - This is the start of the outer `for` loop.
   - `int i = 1`: Initializes the loop variable `i` to 1.
   - `i <= 3`: The loop continues to execute as long as `i` is less than or equal to 3.
   - `i++`: After each iteration of the loop, the value of `i` is incremented by 1.

3. **`for (int j = 1; j <= 3; j++) {`**
   - This is the start of the inner `for` loop.
   - `int j = 1`: Initializes the loop variable `j` to 1.
   - `j <= 3`: The loop continues to execute as long as `j` is less than or equal to 3.
   - `j++`: After each iteration of the loop, the value of `j` is incremented by 1.
   - This inner loop will execute three times for each iteration of the outer loop.

4. **`if (i * j == 4) {`**
   - This `if` statement checks whether the product of `i` and `j` equals 4.
   - If the condition `i * j == 4` is true, the code inside the `if` block will be executed. Otherwise, the code inside the `if` block will be skipped, and the loop will continue as normal.

5. **`break outerLoop;`**
   - If the condition `i * j == 4` is true, the `break outerLoop;` statement is executed.
   - This statement causes the program to immediately exit the loop labeled `outerLoop`. In this case, both the inner and outer loops will terminate, and the program will skip to the line of code that follows the outer loop (if there is any).
   - The `break` statement does not just exit the inner loop; it exits the entire loop structure that includes the label `outerLoop`.

6. **`System.out.println("i = " + i + ", j = " + j);`**
   - This line prints the current values of `i` and `j` to the console.
   - It is only executed if the `if` condition `i * j == 4` is false. If the `if` condition is true, this line will be skipped because of the `break outerLoop;` statement.
   - The output is in the format: `i = <value of i>, j = <value of j>`.

### Execution Flow:

- **First Iteration**: `i = 1`
  - `j = 1`: `i * j = 1`, so `if` condition is false. Prints `i = 1, j = 1`.
  - `j = 2`: `i * j = 2`, so `if` condition is false. Prints `i = 1, j = 2`.
  - `j = 3`: `i * j = 3`, so `if` condition is false. Prints `i = 1, j = 3`.

- **Second Iteration**: `i = 2`
  - `j = 1`: `i * j = 2`, so `if` condition is false. Prints `i = 2, j = 1`.
  - `j = 2`: `i * j = 4`, so `if` condition is **true**. The loop is terminated immediately by the `break outerLoop;` statement.

- **Remaining Iterations**: The outer loop does not continue because of the `break` statement, so `i = 3` is never reached.

### Output:
```java
i = 1, j = 1
i = 1, j = 2
i = 1, j = 3
i = 2, j = 1
```

The loop terminates after printing these lines because `i * j == 4` is true when `i = 2` and `j = 2`, causing the `break outerLoop;` statement to exit the loop.
*/
