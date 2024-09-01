package methodsInjava;

public class MathClassMethod {
    public static void main(String[] args) {

        int a=4;
        int b=5;
        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(3,4));
        System.out.println(Math.abs(-200));
        System.out.println(getRandom(10,30));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(5.9));
        System.out.println(Math.round(6.5));
        System.out.println(Math.round(0.5));
    }
    public static int getRandom(int a,int b){
       // return (int)(Math.random()*6)+1;
        return (int)(Math.random()*(b-a+1)+a);
    }
}

