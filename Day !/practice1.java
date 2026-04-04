import java.util.*;

public class practice1 {

    public static int sumnumber(int n) {

        if (n == 0) {
            return n;

        }

        return n + sumnumber(n - 1);

    }

    public static void sumn(int n) {
        int s = 0;

        for (int i = 1; i <= n; i++) {

            s += i;
        }

        System.out.println(s);

    }

    public static void main(String[] args)

    {
        // System.out.println("taking input from user");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter first number");
        // int a = sc.nextInt();
        System.out.println(sumnumber(5));
        // sumn(5);
        // System.out.println(sumn(5));
        // int sum = a + b;
        // System.out.println("The sum of " + a + " and " + b + " is: " + sum);

    }

}
