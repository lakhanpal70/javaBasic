package loopsinjava;

public class NestedlLoops {
    public static void main(String[] args) {
/*
        for (int count = 0; count < 10; count++) {
            for (int i = 1; i <6; i++) {
                System.out.print(i+ "  ");


            }
            System.out.println("print"+count);


        }

*/
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }



}