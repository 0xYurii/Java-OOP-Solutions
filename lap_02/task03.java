package lap_02;

public class task03 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Two fields are required");
            return;
        }

        String message = args[0];

        int k = Integer.parseInt(args[1]);
        if (k > 25 || k < 0) {
            System.out.println("type k in range [0,25]");
            return;
        }

        String output = "";
        char c;

        for (int i = 0; i < message.length(); i++) {
            c = message.charAt(i);

            if (((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
                c = (char) (((int) message.charAt(i)) + k);
            }
            output = output + c;
        }

        System.out.print(output);
    }
}
