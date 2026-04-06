public class nestedloop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");
        // // upar wale star ka inverted star pattern

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5 - a + 1; b++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // print half pyramid of pattern

        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);

            }
            System.out.println();
        }

        // print character pattern

        int d = 4;
        char ch = 'A';

        for (int line = 1; line <= 4; line++) {
            for (int chars = 1; chars <= line; chars++) {

                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}