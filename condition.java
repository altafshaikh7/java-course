
import java.util.*;

public class condition {

    public static void main(String[] args) {
        // if-else condition
        int age = 20;

        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("minor");
        }

        // odd or even number
        System.out.println("enter the number from user");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("the number is even ");
        } else {
            System.out.println("the number is odd");
        }

        // else if condition
        System.out.println("enter your marks");
        Scanner sec = new Scanner(System.in);
        int marks = sec.nextInt();

        if (marks >= 85) {
            System.out.println("Grade A");
        } else if (marks >= 75 && marks < 85) {
            System.out.println("Grade B");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

    }

}
