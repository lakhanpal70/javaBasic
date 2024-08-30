package loopsinjava;

import org.w3c.dom.ls.LSOutput;

/*For Loop: Used when the number of iterations is known.
Real-Life Example: Imagine you are a teacher and you need to check the homework of all 30 students in your class. You know exactly how many students there are, so you plan to check each student's homework one by one.
Explanation: You start from the first student and move to the next until you've checked all 30. The loop runs 30 times.


While Loop: Used when the number of iterations is not known, and the loop may not run at all if the condition is false initially.
Real-Life Example: Imagine you are waiting for a bus at a bus stop. You don't know when the bus will arrive, so you keep waiting until the bus arrives.
Explanation: You keep waiting (the loop runs) until the bus arrives (condition becomes false).


Do-While Loop: Similar to the while loop, but guarantees that the loop runs at least once, even if the condition is false from the beginning.
Real-Life Example: Imagine you're trying a new dish at a restaurant. You taste the dish first, and if you like it, you take another bite; otherwise, you stop eating. But the first bite is guaranteed.
Explanation: You take the first bite (the loop runs at least once), and then you decide whether to take another bite based on whether you like the dish.
 */
public class do_while_loop {
    public static void main(String[] args) {


        int i = 8;
        do {
            System.out.println(i);
            i++;

        } while (i <= 5);
        System.out.println("out of the loop");
    }


}
