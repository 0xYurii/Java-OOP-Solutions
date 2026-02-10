package lap_01;

import java.util.Scanner;

public class task07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Type a number: ");
            n = sc.nextInt();
        } while (n < 10 || n > 50);
        System.out.println(
            "Accepted number: " + n + ", its square: " + (n * n)
        );

        sc.close();
    }
}
