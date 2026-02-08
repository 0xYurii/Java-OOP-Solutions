public class loop {

    public static void main(String args[]) {
        String t = args[1];
        args[1] = args[0];
        args[0] = t;
        System.out.println("Your second argument: " + args[1]);
        System.out.println("Your first argument: " + args[0]);
    }
}
