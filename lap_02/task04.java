package lap_02;

import java.util.Scanner;

public class task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a phrase: ");
        String s = (sc.nextLine()).trim();

        String word = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                if (!word.isEmpty()) {
                    System.out.println(word);
                    count++;
                    word = "";
                }
            }
        }

        if (!word.isEmpty()) {
            System.out.println(word);
            count++;
        }
        System.out.println("Total words: " + count);
        sc.close();
    }
}
