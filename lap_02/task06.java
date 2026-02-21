package lap_02;

public class task06 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("one field is required");
            return;
        }

        String input = args[0];
        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean special = false;

        if (input.length() > 16 || input.length() < 8) {
            System.out.println("length is not in [8,16] range");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                System.out.println("space is not allowed");
                return;
            }

            if (i >= 2) {
                char p1 = input.charAt(i - 1);
                char p2 = input.charAt(i - 2);
                if (ch == p1 && ch == p2) {
                    System.out.println(
                        "same character repeated 3 times in a row"
                    );
                    return;
                }
            }

            if (ch >= 'A' && ch <= 'Z') {
                uppercase = true;
            } else if (ch >= 'a' && ch <= 'z') {
                lowercase = true;
            } else if (ch >= '0' && ch <= '9') {
                digit = true;
            } else if (
                ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '!'
            ) {
                special = true;
            }
        }

        if (!uppercase) {
            System.out.println("missing uppercase letter");
            return;
        }
        if (!lowercase) {
            System.out.println("missing lowercase letter");
            return;
        }
        if (!digit) {
            System.out.println("missing digit");
            return;
        }
        if (!special) {
            System.out.println("missing special character");
            return;
        }

        System.out.println("ACCEPTED");
    }
}
