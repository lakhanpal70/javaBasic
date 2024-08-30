package javaBasic2;

import java.util.Scanner;

public class switchStatement {
// switch statement;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your day");
    int day = sc.nextInt();
/*
    switch (day) {
        case 1:
            System.out.println("Today is sunday");
        case 2:
            System.out.println("Today is monday");
        case 3:
            System.out.println("Today is tuesday");
        case 4:
            System.out.println("Today is wednesday");
        case 5:
            System.out.println("Today is thursday");
        case 6:
            System.out.println("Today is friday");
        case 7:
            System.out.println("Today is saturday");
    }

 */




    switch (day) {
        case 1:
            System.out.println("Today is sunday");
            break;
        case 2:
            System.out.println("Today is monday");
            break;
        case 3:
            System.out.println("Today is tuesday");
            break;
        case 4:
            System.out.println("Today is wednesday");
            break;
        case 5:
            System.out.println("Today is thursday");
            break;
        case 6:
            System.out.println("Today is friday");
            break;
        case 7:
            System.out.println("Today is saturday");
            break;
        default:
            System.out.println("Invalid Day");
    }













}


}
