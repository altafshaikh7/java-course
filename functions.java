
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

        System.out.println("sum of a + b : " + sum);
    }

    public static void main(String[] args) {
        // function / method

        // java ke andar functions ek block of code hota hai aur yeh reusable part hota
        // hai

        // printhelloworld(); // this is function called

        // syntax with parameters

        System.out.println("Enter the value of a and b : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a, b);

    }
}
