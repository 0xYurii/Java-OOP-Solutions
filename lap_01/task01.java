package lap_01;

public class task01 {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("missing fields");
            return;
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double weighted_avg = (a * 0.2) + (b * 0.3) + (c * 0.5);

        String status = (weighted_avg >= 50) ? "PASS" : "FAIL";
        String merit = (weighted_avg >= 80) ? "Yes" : "No";
        System.out.println("status: " + status + ", merit: " + merit);
    }
}
