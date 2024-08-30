package javaBasic2;
import java.util.Scanner;

public class userInput {
// Taking user  input using scanner:
        /* In order to use the object of scanner we need to import java.util.Scanner
        package.
        Scanner is a class .this is the predefined class in java

        Scanner sc = new Scanner (System.in);
        sc is scanner object name
        new scanner is s constructor
        system.in : passed in constructor
        take integer input by user we use the

        sc.nextInt()
        take float input:
        sc.next float()

        take line input ;
        sc.newLine() or sc.next()
        Note: it is recommended to close the scanner object once the input is taken
        using the close() method

         */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);

       */
       /* System.out.println("The firstNumber is :");
        int firstNumber = sc.nextInt();
        System.out.println("The secondNumber is :");
        int secondNumber = sc.nextInt();
        int result = firstNumber +  secondNumber;
        System.out.println("The sum is :" + result);

        */
// using type cast
        System.out.println("The firstNumber is :");
        int firstNumber = sc.nextInt();
        System.out.println("The secondNumber is :");
        long secondNumber = sc.nextInt();
        int result = (int)(firstNumber +  secondNumber);
        System.out.println("The sum is :" + result);
        sc.close();



    }

}





