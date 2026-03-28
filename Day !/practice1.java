import java.util.Scanner;

public class practice1 {

    public static void main(String[] args)

    {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

    }

}
