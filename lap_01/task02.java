package lap_01;

public class task02 {

    public static void main(String[] args) {
        if (args[0].length() != 4) {
            System.out.println("Type 4 digits number!!");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;
        if ((a + d) == (b + c) && (n % 2 == 0)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
