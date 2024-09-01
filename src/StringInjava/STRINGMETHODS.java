package StringInjava;

public class STRINGMETHODS {
    public static void main(String[] args) {
        /*String name="    lAkh45n ";


        */

        /*name.toUpperCase(): This method converts all the characters in the name string to uppercase.
Example: If name is "Lakhan", name.toUpperCase() will return "LAKHAN".
*/

      /*  name.toLowerCase(): This method converts all the characters in the name string to lowercase.
        Example: If name is "Lakhan", name.toLowerCase() will return "lakhan".*/
        /*name.trim(): This method removes any leading and trailing whitespace from the name string.
Example: If name is " Lakhan ", name.trim() will return "Lakhan".*/

        /*"Carpet".startsWith("Car"): This method checks if the string "Carpet" starts with the substring "Car".
Example: "Carpet".startsWith("Car") returns true because "Carpet" indeed starts with "Car".*/

/*System.out.println("carpet".endsWith("pet"));
"carpet".endsWith("pet"): This method checks if the string "carpet" ends with the substring "pet".
Example: "carpet".endsWith("pet") returns true because "carpet" ends with "pet".
*/

        /*"carpet".equals("carpet"): This method checks if the string "carpet" is equal to the string "carpet".
Example: "carpet".equals("carpet") returns true because both strings are identical*/

/*carpet".charAt(3): This method returns the character at the specified index (3) in the string "carpet".
Example: The string "carpet" has the characters at indices as follows:
Index 0: 'c'
Index 1: 'a'
Index 2: 'r'
Index 3: 'p' (This is the character that will be returned.)
*/




/*
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("Carpet".startsWith("Car"));
        System.out.println("carpet".endsWith("pet"));
        System.out.println("carpet".equals("carpet"));
        System.out.println("carpet".charAt(3));*/



     /*



        int age =123;
        String stringAge=String.valueOf(age);

        System.out.println(age*3);//369
        System.out.println(stringAge+4);//1234 because of concatation

*//*



        String sentence ="I love java , java is a good programming langiage";

       String words[] = sentence.split("a");
       for(String word: words){
           System.out.println(word);
       }

        String newSentence  =sentence.replace("java","c++");
        System.out.println(sentence);
        System.out.println(newSentence);
        System.out.println(sentence.contains("java"));
        System.out.println(sentence.substring(2 ));
        System.out.println(sentence.substring(2,8 ));*/



        //CONVERT STRING IN CHAR


        String color="brown is my fav color";
       char letters[]= color.toCharArray();
       for (char letter:letters){
           System.out.println(letter);
       }

       String animal="     ";
       if(animal.isEmpty()){
           System.out.println("empty");
       } else if (animal.isBlank()) {
           System.out.println("Blank");

       }


    }
}
