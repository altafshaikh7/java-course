import java.util.*;

public class functions {

    public static void printhelloworld() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    public static void calculatesum(int a, int b) {
        int sum = a + b;
        System.out.println("sum of a + b : " + sum);
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

        System.out.println("Enter the Second number : ");
        int n = sc.nextInt();

        int product = m * n;
        System.out.println("product of m * n : " + product);

        return product;
    }

    // factorial
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // binomial coefficient
    public static int bionimialcoefficient(int n, int r) {
        int factn = factorial(n);
        int factr = factorial(r);
        int factnr = factorial(n - r);

        return factn / (factr * factnr);
    }

    // function overloading
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    // optimized isprime
    public static boolean isprime(int u) {
        if (u == 2)
            return true;
        if (u < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(u); i++) {
            if (u % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // test calls
        printhelloworld();

        calculatesum(5, 10);

        swap(10, 5);

        multiply();

        System.out.println("Factorial: " + factorial(5));

        System.out.println("Binomial Coefficient: " + bionimialcoefficient(5, 2));

        System.out.println("Sum (2 numbers): " + sum(3, 5));
        System.out.println("Sum (3 numbers): " + sum(5, 5, 65));
        System.out.println("Sum (float): " + sum(50.5f, 5.9f));

        System.out.println("Is Prime (7): " + isprime(7));
    }
}