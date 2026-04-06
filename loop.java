import java.util.*;

public class loop {
    public static void main(String[] args) {

        // loop ka matlab hota hai koi bhi kaam ko multiple time krna ho to ham loop ka
        // istemal krte hai
        // iske 3 2 type ke loop hote hai
        // 1. for loop
        // 2. while loop
        // 3 . do while loop

        // 1. whole loop

        // print hello world 100 times
        // int counter = 0;

        // while (counter < 100) {
        // System.out.println("hello world ");
        // counter++;
        // }
        // System.out.println("loop khatam ho gya");

        // print numbers 1 to 10

        // int number = 1;
        // while (number < 11) {
        // System.out.println(number);
        // number++;
        // }

        // print numbers 1 to n

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // int counter = 1;
        // while (counter <= n) {
        // System.out.print(counter + " ");
        // counter++;
        // }
        // System.out.println();

        // print sum of fist n natural numbers
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);

    }

}
