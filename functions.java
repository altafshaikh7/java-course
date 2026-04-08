
import java.util.*;

public class functions {
    public static void printhelloworld() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return;
    }

    public static void calculatesum(int a, int b) {

        int sum = a + b;

        System.out.println("sum of a + b : " + sum); // function
    }

    public static void swap(int j, int k) {
        int temp = j;
        j = k;
        k = temp;

        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    public static int multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int m = sc.nextInt();
        System.out.println("Enter the Secound number : ");
        int n = sc.nextInt();
        int product = m * n;

        System.out.println("product of m * n :" + product);

        return product;

    }

    public static int factorial(int n) {

        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bionimialcoefficient(int n, int r) {
        int factn = factorial(n);
        int factr = factorial(r);
        int factnr = factorial(n - r);

        int bionomial = factn / (factr * factnr);

        return bionomial;
    }

    // public static int sum(int a, int b) {
    // return a + b;
    // }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;

    }

    public static void main(String[] args) {
        // function / method

        // java ke andar functions ek block of code hota hai aur yeh reusable part hota
        // hai

        // printhelloworld(); // this is function called

        // syntax with parameters

        // System.out.println("Enter the value of a and b : ");
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calculatesum(a, b); // arguments

        // call by value

        // swap

        // int j = 10;
        // int k = 5;

        // swap(j, k);

        // find product of m and n by using scanner

        // multiply();

        // factorial of a number n by using function

        // System.out.println(factorial(7));

        // bionomial coefficient
        // System.out.println(bionimialcoefficient(5, 2));

        // function overloading

        System.out.println(sum(3, 5));
        System.out.println(sum(5, 5, 65));

        System.out.println(sum(5, 2));
        System.out.println(sum(50.5f, 5.9f));

        System.out.println(isprime(55));
    }
}
