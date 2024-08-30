package loopsinjava;


/*Break Statement in Java
Theory:

The break statement is used to exit a loop or switch statement prematurely. When the break statement is encountered, the control flow immediately exits the loop or switch and moves on to the next line of code after the loop or switch.
Real-Life Example:
Imagine you are searching for a book in a stack of books. You start checking each book one by one. The moment you find the book you're looking for, you stop searching and leave the stack.*/

/*Explanation:
Before the break: You start checking each book in the stack.
At the break: As soon as you find the book you were looking for (in this case, "MyBook"), you decide to stop searching. The break statement tells the program to exit the loop immediately.
After the break: The program continues with whatever comes after the loop, which might be something else or simply ending the search.
In Summary: The break statement is like finding what you're looking for in real life—once you've found it, you don't need to keep looking, so you stop.
*/

public class break_statement {
    public static void main(String[] args) {
        /*for (int i = 0; i <=20; i=i+2) {
            System.out.println(i);
            if(i>=10) break;;*/


            /*The loop starts at i = 0 and increments by 2 each time. It prints the value of i during each iteration. However, once i reaches 10, the loop is stopped early by the break statement.*/
// using while loop
        int i=0;
        while(i<=5){
            System.out.println(i);
            i++;
            if(i==3) break;;

        }
    }
}
