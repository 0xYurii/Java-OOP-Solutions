package lap_03;

import java.util.Scanner;

public class task06 {

    public static int maxValue(int[][] m) {
        int ma = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                ma = Math.max(ma, m[i][j]);
            }
        }
        return ma;
    }

    public static int sumMainDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static boolean isSquare(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            if (m[i].length != m.length) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        if (r < 1) {
            System.out.println("Rows must be >=1");
            sc.close();
            return;
        }

        int c = sc.nextInt();
        if (c < 1) {
            System.out.println("Columns must be >=1");
            sc.close();
            return;
        }

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean isSq = isSquare(matrix);
        int maxVal = maxValue(matrix);

        System.out.println(isSq ? "Square" : "Not square");
        System.out.println("Max Value: " + maxVal);

        if (isSq) {
            int sum = sumMainDiagonal(matrix);
            System.out.println("Diagonal sum: " + sum);
        } else {
            System.out.println("No diagonal sum");
        }

        sc.close();
    }
}
