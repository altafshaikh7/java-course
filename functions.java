
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

        int j = 10;
        int k = 5;

        swap(j, k);

    }
}
