package loopsinjava;

import java.util.Scanner;

public class basicLoops {
    // sum of even number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + 2 * i;


        }
        System.out.println(sum);
    }
}

/*
    // sum of n number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum=0;

        for (int i=1; i<=n; i++){
            sum = sum+i;

    }
        System.out.println(sum);


}

*/



/*
    // print the multiplication table

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        int n= sc.nextInt();
        for (int i=0; i<=20;i++){
            System.out.println(n+" *" +i+"="i*n);
        }


    }

*/



   /* public static void main(String[] args) {
        // int i =0; is the initialization of the for loop
        // i<=10; is the condition where for loop end
        // i++ is the updation part
        // BODY OF THE LOOP
        for (int i=0; i<=10; i++) {
            System.out.println("Hello");
        }
    }
}


/*

.INITIALIZATION EXPRESSION
.TEST EXPRESSION(CONDITION)
.UPDATE EXPRESSION
.BODY OF THE LOOP

*/


