package lap_01;

import java.util.Scanner;

public class task06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a num:");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("type number " + (i + 1) + ": ");
            int value = sc.nextInt();

            if (value < 0) {
                continue;
            }
            if (value > 999) {
                System.out.println("type smaller value");
                break;
            }
            sum = sum + value;
            count = count + 1;
        }

        System.out.printf("Sum: %d, Count: %d", sum, count);

        sc.close();
    }
}
