import java.util.*;

public class breakstatemnt {

    public static void main(String[] args) {

        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }

        // System.out.println("i am out of the loop ");

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number");
            int j = sc.nextInt();

            if (j % 10 == 0) {
                break;

            }
            System.out.println(j);

        } while (true);

    }
}
