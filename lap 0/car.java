public class car {

    public static void main(String[] args) {
        String name = "406";

        String type = "peugeot";
        String engine = "hdi";
        String color = "gray";
        int maxSpeed = 197;
        public class BasicSyntax {

            public static void main(String[] arg) {
                // Declare and initialize variables
                int number = 10;
                double decimal = 5.5;
                String text = "Java is fun!";
                boolean isLargeNumber = number > 5;

                //Print var
                System.out.println("Number: " + number);
                System.out.println("Decimal: " + decimal);
                System.out.println("Text: " + text);

                // Perform arithmetic operations
                int sum = number + (int) decimal;
                System.out.println("Sum: " + sum);

                //Use loop
                for (int i = 0; i < 5; i++) {
                    System.out.println("Loop outputs: " + i);
                }

                //Use conditional statemnt
                if (isLargeNumber) {
                    System.out.println("Number is greater then 5");
                } else {
                    System.out.println("Number is 5 or less");
                }
            }
        }
        System.out.println(
            "this car has type of: " +
                type +
                " with name: " +
                name +
                " has engine: " +
                engine +
                " with color: " +
                color +
                " and its maximum speed: " +
                maxSpeed
        );
    }
}
