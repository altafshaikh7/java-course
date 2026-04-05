import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        System.out.println("calculator ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fist number: ");
        int a = sc.nextInt();
        System.out.println("Enter Secound number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println(" Wrong operator");
        }
    }
}
