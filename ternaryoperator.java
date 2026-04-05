public class ternaryoperator {
    public static void main(String[] args) {

        // ternary operator

        // variable = (condition) ? expression1 : expression2;
        int age = 20;
        String result = (age >= 18) ? "adult" : "minor";
        System.out.println(result);
        // odd or even number
        int num = 10;
        String result1 = (num % 2 == 0) ? "the number is even" : "the number is odd";
        System.out.println(result1);
        // else if condition
        int marks = 80;
        String result2 = (marks >= 85) ? "Grade A"
                : (marks >= 75 && marks < 85) ? "Grade B" : (marks >= 60 && marks < 75) ? "Grade C" : "Grade F";
        System.out.println(result2);
    }
}
