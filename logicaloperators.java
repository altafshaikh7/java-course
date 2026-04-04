public class logicaloperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // logical AND
        System.out.println((a < b) && (b < c)); // true
        System.out.println((a > b) && (b < c)); // false

        // logical OR
        System.out.println((a < b) || (b > c)); // true
        System.out.println((a > b) || (b > c)); // false

        // logical NOT
        System.out.println(!(a < b)); // false
        System.out.println(!(a > b)); // true
    }
}
