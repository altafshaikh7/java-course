public class Arithmicoperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Binary operators
        System.out.println("Addition: " + (a + b)); // addition
        System.out.println("Subtraction: " + (a - b)); // subtraction
        System.out.println("Multiplication: " + (a * b)); // multiplication
        System.out.println("Division: " + (a / b)); // division
        System.out.println("Modulus: " + (a % b)); // modulus

        // unary operators
        // 1. increament operators
        // is me bhi 2 type ke operators hote hai

        // (1. pre increament ++a)
        // yeh sabse pehle value change krega jis pe hame operation ho to uske baad use
        // hogi

        // eg.

        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        // (2. post increament a++)

        int e = 10;
        int f = e++;
        System.out.println(e);
        System.out.println(f);

    }
}
