
import java.util.*;

public class product {

    public static void main(String[] args) {
        System.out.println("enter your first number");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("enter your second number");
        Scanner sec = new Scanner(System.in);
        int num2 = sec.nextInt();

        int sum = num1 * num2;
        System.out.println(sum);
    }
}