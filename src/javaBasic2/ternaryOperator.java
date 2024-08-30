package javaBasic2;

//public class ternaryOperator {



    /*
    ternary operator :
    A ternary operator evaluates the test condition
    and executes a block of code based on the result of the condition.
    the ternary operator can be used to replace certain
    types of if...else statements.

    syntax: condition ? expression : expression2;

     */


    // find largest number and put and store in maximum variable

//
//    public static void main(String[] args) {

    // find largest number and put and store in maximum variable
       /* int a=12;
        int b= 14;
        int maximum=0; */
    //    if (a>b){
    //      maximum=a;
    //    }
    //  else {
    //    maximum=b;
    //   }

    // Ternary operation use in this condition:


        /*  maximum = a>b ? a: b;
        // Explanation : if a>b then a is put on maximum and
        // else put b in maximum
        System.out.println("value of max is "+ maximum);

         */


    // Nested ternary operation:
//
//        int a= 26;
//        int b=23;
//        int c= 123;
//        int max =0;
//        max= a>b ? a>c ? a : c : b > c ? b : c;
//        System.out.println("value of max is "+ max);


    //   }
//}

/*   // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");

        // Read a line of text from the user
        String name = scanner.nextLine();

        // Display the user's input
        System.out.println("Hello, " + name + "!");*/


// using logical operator

//    public static void main(String[] args) {
//        int time = 21;
//        if (time >= 10) {
//            if (time <= 20) {
//                System.out.println("office is open");
//            } else {
//                System.out.println("office is close");
//            }
//        } else {
//            System.out.println("office is close");
//        }
//    }
//}
//

// using logical operator to solve the above problem

public class ternaryOperator {
    public static void main(String[] args) {
        int time = 12;
        if(time >=10 && time <=20){
            System.out.println("Office is open");
        } else {
            System.out.println("Office is closed");
        }

    }
}










