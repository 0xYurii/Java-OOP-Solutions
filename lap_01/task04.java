package lap_01;

public class task04 {

    public static void main(String[] args) {
        int cent = Integer.parseInt(args[0]);

        if (cent > 9999) {
            System.out.println("enter number from 0 to 9999");
            return;
        }
        int[] list_of_cents = { 200, 100, 50, 20, 10, 5, 2, 1 };
        for (int i = 0; i < list_of_cents.length; i++) {
            int piece = cent / list_of_cents[i];
            System.out.println(list_of_cents[i] + "c: " + piece + ";");
            cent = cent - (piece * list_of_cents[i]);
        }
    }
}
