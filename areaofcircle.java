import java.util.*;

public class areaofcircle {

    public static void main(String[] args) {

        System.out.println("enter the number from user");

        Scanner sc = new Scanner(System.in);
        Float rad = sc.nextFloat();
        float area = 3.14F * rad * rad;
        System.out.println("area of circle is " + area);
    }
}
