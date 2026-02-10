package lap_01;

import java.util.Scanner;

public class task08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("type a day: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}
