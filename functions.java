
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

        System.out.println(factorial(7));

    }
}
