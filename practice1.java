public class practice1 {
    public static void main(String[] args) {
        // check if a student fail or pass
        // marks => 33 pass
        // marks <33 fail

        // is operation ko ternary operator se likhna hai

        int marks = 75;

        String reportCard = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(reportCard);

    }
}
