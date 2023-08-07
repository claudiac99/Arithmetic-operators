public class Main {
    public static void main(String[] args){
        int a = 25;
        int b = 10;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Division: " + ((double)a / b));
        System.out.println("Modulo: " + (a % b));

        //a = a + b
        a += b;
        //a -= b;
        //a *= b;
        //a /= b;
        //a %= b;
        System.out.println(a);

        //b += 1
        b++; //increment operation
        //b--; decrement operation
        System.out.println(b);

        //Post increment and pre increment
        int c = 1;
        System.out.println(c++); //You will see 1

        System.out.println(c);  //Now is 2

        System.out.println(++c); //You will see 3

        //Exponentiation
        System.out.println(Math.pow(2,3));

        //Square root
        System.out.println(Math.sqrt(4));

        //Absolute value
        System.out.println(Math.abs(-3));
    }
}
