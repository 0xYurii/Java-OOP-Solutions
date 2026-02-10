package lap_01;

public class task09 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("two arguments are required");
            return;
        }

        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double area = height * width;
        double perimeter = (height + width) * 2;
        String type = (height == width) ? "Square" : "Rectangle";

        System.out.println(
            "Height: " +
                height +
                ", Width: " +
                width +
                ", Area: " +
                area +
                ", Perimeter: " +
                perimeter +
                ", Type: " +
                type
        );
    }
}
