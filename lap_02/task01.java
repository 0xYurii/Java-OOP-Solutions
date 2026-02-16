package lap_02;

public class task01 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You didn't pass anything");
            return;
        }
        String input = args[0];

        int count = 1;
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (
                (i + 1 < input.length()) &&
                (input.charAt(i) == input.charAt(i + 1))
            ) {
                count = count + 1;
            } else {
                output = output + input.charAt(i) + count;
                count = 1;
            }
        }
        System.out.println(output);
    }
}
