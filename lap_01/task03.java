package lap_01;

public class task03 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("2 fields are required");
        }
        int option = Integer.parseInt(args[0]);
        double value = Double.parseDouble(args[1]);

        switch (option) {
            case 1:
                double F = (value * 1.8) + 32;
                System.out.println(value + "C => " + F + "F");
                break;
            case 2:
                double C = ((value - 32) * (5 / 9));
                System.out.println(value + "F => " + C + "C");
                break;
            case 3:
                double mile = (value / 1.609);
                System.out.println(value + "Km => " + mile + "miles");
                break;
            case 4:
                double kilo = (value * 1.609);
                System.out.println(value + "miles => " + kilo + "Km");
                break;
            default:
                System.out.println("there's only 4 options availible");
        }
    }
}
