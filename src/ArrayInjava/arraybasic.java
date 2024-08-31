package ArrayInjava;

public class arraybasic {
    /*
    1.How do the Array work
    2.Creating and Declaring Array
    3.For each loop
    4.Multi-dimensional Array*/
    public static void main(String[] args) {


     /*   int age[];  // declaration
        age = new int[5];  // allocation
        */

        // in other way:
     /*   int age[]=new int[5];
        age[0]=5;
        age[1]=2;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age.length);*/



    /*    int marks[]={98,58,45,65,42};
        System.out.println(marks[4]);*/






        //for each loop:
        /*The for-each loop in Java, also known as the "enhanced for loop," is a simpler way to iterate over elements in arrays or collections like ArrayList, HashSet, etc. It is particularly useful when you need to access each element in a sequence without worrying about the index or managing the loop counter.

Syntax:
java

for (Type element : collection) {
    // Use element
}
Type: The data type of the elements in the array or collection.
element: A variable that represents the current element in the iteration.
collection: The array or collection you want to iterate over.
How It Works:
The for-each loop automatically iterates over all elements of the collection or array.
During each iteration, the current element is assigned to the element variable, which you can then use inside the loop
*/



        String names[] = {"Ram", "lakhan","rahul","vikash","ajay"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is:"+names[i]);
        }

        for(String name:names){
            System.out.println("For each  " +name);
        }





    }

}
