package ArrayInjava;

public class multiDimensionalArray {
    public static void main(String[] args) {
  /*      int marks[][]=new int[4][3];
        marks[0][0]=12;
        marks[0][1]=95;
        marks[0][2]=94;


        marks[1][0]=25;
        marks[1][1]=98;
        marks[1][2]=92;


        marks[2][0]=25;
        marks[2][1]=98;
        marks[2][2]=92;
        */
   /*     int marks[][]={
                {12,65,62},
                {45,84,98},
                {85,56,25},
                {78,98,99}
        };
        System.out.println(marks[2][1]);
        System.out.println(marks[2][2]);*/
        // Step 1: Declare a 2D array
        int[][] matrix = new int[3][3];

        // Step 2: Initialize the 2D array
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // Step 3: Access and print 2D array elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }




}
