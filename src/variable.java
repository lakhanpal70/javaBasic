public class variable {
    public static void main(String[] args) {
        boolean isPassed = true;
        // implicit type conversion
        //int count = 13;
        // data type conversion: int count is store in long
        //long count    long = count;
        // but long will not convert to the int

        //This long data type is an 8 byte store.
        // 12 stores 8 bytes while int stores 4 bytes.
        // Potentially lossy conversion from long to int.
       // long count =12;
        //int countInt = count;

        // explicit type conversion
        long count=12;
        int countint =(int)count;
        System.out.println(countint);
        byte marks = 24;
        short studentCount = 1234;
        float pi = 3.14f;
        double secondPi = 3.23423;

        System.out.println(marks);

        System.out.println(isPassed);
        System.out.println(studentCount);
        System.out.println(pi);
        System.out.println(secondPi);

        char myLetter = 'A';
        // to store a character we're using single
        //  quotes and store a string we use
        // the double quotes
        System.out.println(myLetter);
        // expilict type coonversion : this is lossy conversion
        // in lossy conversion the chance of data lost is high
        //exaple is int store 8 byte but byte data type store 1 byte means 8 bit
        // the byte data type store range is 128 but int age store 150
        // but int convert to the byte it will loss the data it give -106
        int age =150;
        byte newAge = (byte)age;
        System.out.println(newAge);

        /*  ctrl +shift + slash create a multiline comments */
//        ctrl+ slash create a single line comments


}
}
