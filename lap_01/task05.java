package lap_01;

import java.util.Scanner;

public class task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("No Data");
            sc.close();
            return;
        }

        int sum = 0;
        int count = 0;
        double avg = 0;

        while (n != 0) {
            sum = sum + n;
            count = count + 1;
            if (count > 0) {
                avg = ((double) sum / count);
            }
            System.out.print("Type a number: ");
            n = sc.nextInt();
        }
        System.out.printf("Sum: %d, Count: %d, Average: %.2f", sum, count, avg);
        sc.close();
    }
}
