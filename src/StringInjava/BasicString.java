package StringInjava;

public class BasicString {
    /*string in java


In Java, a String is a sequence of characters used to represent text. Strings are a very commonly used data type in Java and are treated as objects, which means they come with methods that allow various operations on text. Here's a detailed explanation:

1. String Basics
a. Creating a String
There are several ways to create a String in Java:

Using String literals:


String greeting = "Hello, World!";
When you create a string using double quotes, Java internally creates a String object.
Using the new keyword:


String greeting = new String("Hello, World!");
This explicitly creates a new String object, although it's less common to use this form.



Immutability of Strings:
Strings are immutable: Once a String object is created, it cannot be changed. Any operation that appears to modify a string actually creates a new String object.

*/
    public static void main(String[] args) {
        String name ="lakhan";
        String  sameName="lakhan";
        String newName = new String("lAKHAN");
        System.out.println(name);
        System.out.println(newName);
        System.out.println(sameName);
      /*  if(name == sameName){
            System.out.println("Both are same");

        }
        if(newName==name){
            System.out.println("Both are same");
        }
        else{
            System.out.println("they not same");

        }*/
// COMPARING TWO STRING : Using .equals() Method and other is equalIgnorecase
//The .equals() method checks if the values of two strings are the same, regardless of their memory location.
// the equalsIgnorecase() (string another) compares the string to another string ,ignore case.

        if(name.equalsIgnoreCase(newName)){
            System.out.println("name and newNames have same value");
        }
        else {
            System.out.println("They are not same");
        }
    }
}


/*name and sameName reference the same object in the String Pool, so name == sameName is true.
newName references a different object on the heap, so newName == name is false.
The program demonstrates how string literals are handled differently from new String() objects in terms of memory allocation and comparison.
*/
