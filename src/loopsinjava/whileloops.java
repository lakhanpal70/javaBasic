package loopsinjava;

import java.util.Scanner;

//For loop: Used when the number of iterations is known.
// While loop: Used when the number of iterations is not known and depends on a condition.

public class whileloops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*boolean hasLearnt = false;

boolean: A primitive data type in Java that can hold only two values: true or false.
hasLearnt = false;: Initializes the hasLearnt variable to false. This variable will be used to track whether the user has understood or "learnt" something.
while (!hasLearnt)

while loop: Repeats a block of code as long as a specified condition is true.
!hasLearnt: The condition in this case is !hasLearnt, which means "not hasLearnt". Since hasLearnt is initially false, !hasLearnt is true, so the loop will start executing.
The loop will keep running until hasLearnt becomes true.*/



        boolean hasLearnt=false;
        while (!hasLearnt){
            System.out.println("Went to school ,tried to learn");
            System.out.println("Have you understood");
            hasLearnt=sc.nextBoolean();
        }
    }
}












   /* public static void main(String[] args) {
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;

        }
    }

}*/
