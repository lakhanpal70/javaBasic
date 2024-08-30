package javaBasic2;

public class Operators {
    public static void main(String[] args) {

        // types of operator
    /*
    1.Arithmetic operators : + (addition), - (subtraction), *(multiplication) , /(division) ,%(modulo operator remainder after division
    2. Assignment operators : = , += ,-=,*= ,/= ,%=
    3. Relational operator : == , != ,> , < , >= , <= relational operator always return boolean values
    4. logical operator : &&(Logical AND) : this is true only if both expression1
    and expression2 are true
    || (OR logical) : true if either expression 1 and expression2 is true
    !(not logical): true if expression is false and vice versa
    5. unary operator : increment operator (++) , decrement operator(--)
    a++ : is equal to the  a= a+1 , a-- : is equal to the a= a-1
    Ternary operator:
     6. Bitwise operator : ~ (bitwise compliment) , <<(left shift) , >>(right shift)
    >>>(unsigned right shift) , & (bitwise AND) , ^ (bitwise exclusive OR)


    */

     /* int a=12;
      int b= 7;
      int c= a%b;
        System.out.println(c);
        a+=b; // is a=a+b
        System.out.println(a);*/


      /*  int firstNumber = 12;
        int secondNumber =14;
        System.out.println(firstNumber==secondNumber);
        System.out.println(firstNumber!=secondNumber);

       */

        boolean firstExpression = true;
        boolean secondExpression = false;
        System.out.println(firstExpression && secondExpression);
        System.out.println(firstExpression || secondExpression);
        System.out.println(!firstExpression);

        int a =12;
        a=a+1; // it give a=13
        a++; // it give 13+1=14
        a--;//it give 14-1=13
        a--;// again it give 13-1=12
        System.out.println(a);



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



    }


}
