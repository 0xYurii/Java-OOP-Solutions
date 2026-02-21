package lap_03;

import java.util.Scanner;

public class task03 {

    static int countOccurrences(int[] a, int target) {
        int occ = 0;
        for (int i : a) {
            if (target == i) {
                occ++;
            }
        }
        return occ;
    }

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
        System.out.print("Type a target number: ");
        int target = sc.nextInt();
        int occ = countOccurrences(nums, target);
        System.out.println("Occurrences: " + occ);

        sc.close();
    }
}
