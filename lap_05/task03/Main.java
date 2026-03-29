package lap_05.task03;

public class Main {

    public static void main(String[] args) {
        // 1. Create cinema
        Cinema cinema = new Cinema("Star Cinema");

        // 2. Add screens
        Screen s1 = new Screen(1, 150);
        Screen s2 = new Screen(2, 80);
        cinema.addScreen(s1);
        cinema.addScreen(s2);

        // 3. Add movies (mix of types — polymorphism in action!)
        Movie m1 = new RegularMovie(1, "Interstellar", 169, "PG-13");
        Movie m2 = new ThreeDMovie(2, "Avatar 2", 192, true);
        Movie m3 = new RegularMovie(3, "The Batman", 176, "PG-13");
        Movie m4 = new ThreeDMovie(4, "Doctor Strange", 126, false);

        System.out.println("--- Adding movies ---");
        System.out.println("Add m1: " + cinema.addMovie(m1));
        System.out.println("Add m2: " + cinema.addMovie(m2));
        System.out.println("Add m3: " + cinema.addMovie(m3));
        System.out.println("Add m4: " + cinema.addMovie(m4));

        // duplicate test
        System.out.println("Add duplicate id=1: " + cinema.addMovie(m1));

        // 4. Print all movies
        System.out.println("\n--- All movies ---");
        cinema.printMovies();

        // 5. Total duration
        System.out.println(
            "\nTotal duration: " + cinema.totalDuration() + " min"
        );

        // 6. Remove a movie
        System.out.println("\n--- Remove movie id=2 ---");
        System.out.println("Removed: " + cinema.removeMovieById(2));
        cinema.printMovies();

        // remove non-existent
        System.out.println("Remove id=99: " + cinema.removeMovieById(99));

        // 7. Total duration after removal
        System.out.println(
            "\nTotal duration after removal: " + cinema.totalDuration() + " min"
        );

        // 8. Print screens
        System.out.println("\n--- Screens ---");
        cinema.printScreens();
    }
}
