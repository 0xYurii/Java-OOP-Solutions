package lap_03;

import java.util.Scanner;

public class task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nType Rows number: ");
        int r = sc.nextInt();
        if (r < 1) {
            System.out.println("Rows must be >=1");
            sc.close();
            return;
        }

        System.out.print("\nType Columns number: ");
        int c = sc.nextInt();
        if (c > 50) {
            System.out.println("Columns must be <=50");
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

        int total_sum = 0;
        int row_sum = 0;
        int col_sum = 0;

        System.out.println("\nthe finale matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                total_sum = total_sum + matrix[i][j];
                row_sum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + row_sum);
            row_sum = 0;
        }

        System.out.println("");
        for (int j = 0; j < c; j++) {
            col_sum = 0;
            for (int i = 0; i < r; i++) {
                col_sum += matrix[i][j];
            }
            System.out.println("Sum of col " + j + ": " + col_sum);
        }

        System.out.println("");
        System.out.println("Total Sum of all values: " + total_sum);

        sc.close();
    }
}
