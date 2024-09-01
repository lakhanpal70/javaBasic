package StringInjava;

import java.util.Scanner;

public class LEARNSTRING {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName=sc.nextLine();
        System.out.println("Enter the last name:");
        String lastName= sc.next();
        System.out.println("Your full name is ;" +firstName+" "+lastName);
        System.out.println(firstName+lastName);

        //THE PURPOSE OF SC.NEXT() AND SC.NEXTLINE()
        /*1. sc.next()
Purpose: Reads the next token from the input.
What it does: sc.next() reads input up to the next whitespace (space, tab, or newline), so it can only retrieve a single word or token at a time.
Behavior:
If the input is "Hello World", calling sc.next() will return "Hello". The next call to sc.next() will return "World".
It skips any leading whitespace before the first non-whitespace character and stops reading when it encounters the next whitespace.
*/



        /*sc.nextLine()
Purpose: Reads the entire line of input, including spaces.
What it does: sc.nextLine() reads the input until it encounters a newline character (\n), effectively capturing the whole line of text as a string.
Behavior:
If the input is "Hello World", calling sc.nextLine() will return "Hello World".
It reads everything from the current position to the end of the line, including leading and trailing spaces.
*/

    }
}
