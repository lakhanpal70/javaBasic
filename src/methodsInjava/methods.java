package methodsInjava;

public class methods {
    /*
    1,How to the function work:
    In Java, methods are similar to functions in other programming languages. They are blocks of code designed to perform specific tasks and can be called (invoked) whenever needed. Java does not use the term "function" directly; instead, it refers to these blocks of code as "methods."

    2. Declaring a java method
    3. calling a method
    4.method return type
    5.method parameters:A method parameter is a value accepted by the method .
    a method can also have any number of parameters,
    6.math library methods
    */

    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//
//        greet();
//        System.out.println(3);

//        /*
//        purpose of this void main(String[] args) is below
//        for (String arg : args) {
//            System.out.println(arg);
//        }
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        */

        int averageFromFunction = average(5, 5, false);
        // we have store the average value in averagefronfunction name variable
        // and we have do any work and operation on averagefromfunction.
        int doubleOfAvg = averageFromFunction * 8;
        System.out.println("hello");
        System.out.println("The averageFromFunction value is :" + averageFromFunction);
        System.out.println("The value of doubleAvg is :" + doubleOfAvg);

    }

    public static void greet() {
        System.out.println(4);
        System.out.println("hello");
        System.out.println(5);
    }



    /*public static void  average(int a ,int b){
        int avg= (a+b)/2;
        System.out.println("The average is :"+avg);
    }
*/

    // USE RETURN TYPE;

    public static int average(int a, int b, boolean shouldAverage) {
        if (shouldAverage == false) {
            return -1;
        }
        int avg = (a + b) / 2;
        System.out.println("Returning the average");
        return avg;
    }
}
