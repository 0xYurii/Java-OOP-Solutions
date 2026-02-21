package lap_03;

import java.util.Scanner;

public class task01 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type integer N: ");

        int n = sc.nextInt();
        if (n > 10000 || n < 1) {
            System.out.println("N should be 1<=N<=10000");
            sc.close();
            return;
        }

        int max = 0;
        int min = 999999999;
        double sum = 0;
        double avg;
        int count = 0;

        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.print("Type int number " + (i + 1) + ": ");
            int k = sc.nextInt();

            sum = sum + k;
            max = Math.max(max, k);
            min = Math.min(min, k);

            if (k % 2 != 0) {
                count++;
            }
        }
        avg = (sum / n);

        System.out.println(
            "Max: " +
                max +
                ", Min: " +
                min +
                ", Sum: " +
                sum +
                ", Average: " +
                avg +
                ", Even count: " +
                count
        );

        sc.close();
    }
}
