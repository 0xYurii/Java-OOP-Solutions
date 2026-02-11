package lap_01;

public class task10 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Missing fields or too much");
            return;
        }

        System.out.println("List of rules:");
        System.out.println(". Staff: always allowed.");
        System.out.println(". TA: allowed if time is between 8 and 20");
        System.out.println(
            ". Student: allowed only if: time is between 9 and 17 and id is even."
        );
        System.out.println("__________________________");

        int id = Integer.parseInt(args[0]);
        String input = (args[1]).toLowerCase();
        int time = Integer.parseInt(args[2]);
        boolean status = false;
        String[] roles = { "student", "ta", "staff" };
        boolean valid = false;

        for (String role : roles) {
            if (role.equals(input)) {
                valid = true;
                break;
            }
        }

        if (input.equals("staff")) {
            status = true;
        } else if ((input.equals("ta")) && (time >= 8 && time <= 20)) {
            status = true;
        } else if (
            (input.equals("student")) &&
            (time >= 9) &&
            (time <= 17) &&
            (id % 2 == 0)
        ) {
            status = true;
        }

        if (!valid) {
            System.out.println("Invalid role");
            return;
        }
        String sent = status ? "GRANTED" : "DENIED";
        System.out.println("ACCESS " + sent + "!");
    }
}
