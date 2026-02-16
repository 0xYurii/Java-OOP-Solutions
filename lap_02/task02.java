package lap_02;

public class task02 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You didn't pass anything");
            return;
        }
        String input = args[0];
        String sub_Str;
        String output = "";
        int l;
        int r;
        boolean is_Pal = true;

        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length() - 1; j > i; j--) {
                is_Pal = true;
                sub_Str = input.substring(i, j + 1);
                l = 0;
                r = sub_Str.length() - 1;

                while (l < r && is_Pal) {
                    if (sub_Str.charAt(l) == sub_Str.charAt(r)) {
                        l = l + 1;
                        r = r - 1;
                    } else {
                        is_Pal = false;
                    }
                }
                if (is_Pal) {
                    output = (output.length() > sub_Str.length())
                        ? output
                        : sub_Str;
                }
            }
        }
        if (output.length() == 0 && input.length() == 1) {
            output = input;
        }
        System.out.println(output + ", " + output.length());
    }
}
