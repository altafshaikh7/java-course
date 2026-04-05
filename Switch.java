public class Switch {

    public static void main(String[] args) {
        // syntax of switch case

        /*
         * switch (variable) {
         * 
         * case 1:
         * case 2:
         * case 3:
         * 
         * default:
         * 
         * }
         */

        int number = 3;

        switch (number) {
            case 1:
                System.out.println("SAMOSA");
                break;
            case 2:
                System.out.println("JALABIYA");
                break;
            case 3:
                System.out.println("PAKORA");
                break;
            default:
                System.out.println("INVALID INPUT");
        }
    }
}
