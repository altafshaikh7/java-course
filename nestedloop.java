public class nestedloop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");
        // upar wale star ka inverted star pattern

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5 - a + 1; b++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}