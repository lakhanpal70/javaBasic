package ArrayInjava;

public class problemsOnArray {
    public static void main(String[] args) {
/*
        // Step 1: Initialize the array
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Initialize the sum variable
        int sum = 0;

        // Step 3: Use a for loop to iterate over the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add each element to the sum
        }

        // Step 4: Output the sum
        System.out.println("Sum of array elements: " + sum);*/



        // using for each loop
        System.out.println(Integer.MAX_VALUE);
        int[] numbers = {10, 20, 30, 40, 50,1};
       /* int sum=0;
        for (int number: numbers){
            sum+=number;

        }
        System.out.println("Sum is"+sum);
*/
//find smallest element



       /* int min=Integer.MAX_VALUE;
        for(int number: numbers){
            if(number<min){
                min=number;

            }
        }
        System.out.println("Minimum number is"+min);

    }
}
*/


// find Min and Max :

        // Step 2: Initialize min and max to the first element of the array
        int min = numbers[0];
        int max = numbers[0];

        // Step 3: Use a for loop to iterate over the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if the current element is smaller
            }
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if the current element is larger
            }
        }

        // Step 4: Output the min and max values
        System.out.println("Minimum element in the array: " + min);
        System.out.println("Maximum element in the array: " + max);
    }
}