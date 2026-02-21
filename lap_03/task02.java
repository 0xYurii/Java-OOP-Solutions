package lap_03;

import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type integer N: ");
        int n = sc.nextInt();
        System.out.println("");

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Type int number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("");
        System.out.print("Type shift number: ");
        int k = sc.nextInt();
        int[] shifted = new int[n];

        System.out.println("Array before shifting: ");
        for (int r : nums) {
            System.out.print(r + ", ");
        }

        for (int i = 0; i < n; i++) {
            int target = (i + k) % n;
            shifted[target] = nums[i];
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Array after shifting: ");
        for (int h : shifted) {
            System.out.print(h + ", ");
        }

        sc.close();
    }
}
