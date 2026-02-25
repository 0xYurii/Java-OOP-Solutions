package lap_03;

public class task07 {

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("One field is required!");
            return;
        }
        int n = Integer.parseInt(args[0]);

        int sum = sumDigits(n);
        int rev = reverseNumber(n);

        System.out.println("Sum of digits of " + n + ": " + sum);
        System.out.println("The digits of " + n + " reversed: " + rev);
    }
}
