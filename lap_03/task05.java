package lap_03;

import java.util.Scanner;

public class task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nType Rows number: ");
        int r = sc.nextInt();
        if (r < 1) {
            System.out.println("Rows must be >=1");
            sc.close();
            return;
        }

        System.out.print("\nType seats number: ");
        int c = sc.nextInt();
        if (c < 1) {
            System.out.println("Columns must be >=1");
            sc.close();
            return;
        }

        System.out.print("\nType consecutive block you want: ");
        int k = sc.nextInt();
        if (k > c || k < 1) {
            System.out.println("k must be 1<=k<=c");
            sc.close();
            return;
        }

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(
                    "Type int num [" + (i + 1) + "][" + (j + 1) + "]: "
                );
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nthe finale matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                    if (count == k) {
                        int startCol = j - k + 1;
                        System.out.println(
                            "Row = " +
                                (i + 1) +
                                ", StartSeat = " +
                                (startCol + 1)
                        );
                        sc.close();
                        return;
                    }
                } else {
                    count = 0;
                }
            }
        }

        System.out.println("No block found");

        sc.close();
    }
}
