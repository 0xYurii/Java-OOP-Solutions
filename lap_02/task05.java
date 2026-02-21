package lap_02;

import java.util.Scanner;

public class task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a phrase: ");
        String s = sc.nextLine();

        int balance = 0;
        boolean ok = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) {
                    ok = false;
                    break;
                }
            }
        }
        if (balance != 0) {
            ok = false;
        }
        System.out.println(ok ? "BALANCED" : "NOT BALANCED");
        sc.close();
    }
}
