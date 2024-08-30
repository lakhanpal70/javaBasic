package loopsinjava;
/*Break: Used to completely exit a loop when a certain condition is met.
Continue: Used to skip the current iteration of a loop when a certain condition is met, but the loop continues with the next iteration.
In Real Life:

Break: Like finding the specific document and stopping the search.
Continue: Like skipping over unimportant papers while counting the important ones.

*/

public class Continue_and_break_Statement {
    public static void main(String[] args) {
        for (int i = 0; i <=20 ; i++) {
            if(i==2 || i==8) continue;
            if (i>=15) break;
            System.out.println("Gave to toffee to" + " " +i);

        }



    }

}
