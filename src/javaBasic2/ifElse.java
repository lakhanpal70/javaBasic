package javaBasic2;

public class ifElse {


    /*
    1. if -else statement:
    The if statement executes a certain section of code if the test
    expression is evaluated to true.
    Statements inside the body of else are executed
    if the test expression evaluated to false . This
    is known as the if-..else statement in java.

    2. if-else if-else statement:
    In java we have abn if...else..if ladder that can be used to execute one block
    of code among multiple other blocks.


    3. nested if-else statement :
    In java we have an if..else..if ladder that can be used to execute one block
    of code among multiple other blocks.


    4. working with logical operators
    5. java ternary operator
    6. java switch statement


    *
    */
  /*  public static void main(String[] args) {
        int age = 4;
        if (age >= 18) {
            System.out.println("You can vote");

        } else {
            System.out.println("You can not vote");
        }



    }

   */

    /* public static void main(String[] args) {
        int day =3;
        if(day==1){
            System.out.println("go to home");
        } else if (day==2) {
            System.out.println("Go to village");

        } else if (day==3) {
            System.out.println(" go to the party");

        } else{
            System.out.println("Go to office");
        }
        System.out.println(" Went somewhere today");

     */

    // Nested if else statement

    public static void main(String[] args) {
        // you are given three numbers , find the maximum number

        int a =4;
        int b=8;
        int c= 12;
        if(a>b) {
            System.out.println("A is greater than b");
            if (a > c) {
                System.out.println("A is greater than c");
                System.out.println(" A is largest " + a);
            } else {
                System.out.println("C is greater than A");
            }
        }
        else{
            System.out.println("B is greater than A");
            if (b>c){
                System.out.println("B is bigger than c");
                System.out.println("B is the largest" +b);

        } else {
                System.out.println("C is bigger than b" );
                System.out.println(" C is largest " +c);
            }

    }
    }
}

/// you are given four numbers find the maximum number
