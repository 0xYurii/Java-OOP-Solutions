package lap_05.task03;

import java.util.ArrayList;

public class Cinema {

    String name;
    ArrayList<Movie> movies;
    ArrayList<Screen> screens;

    public Cinema(String name) {
        this.name = name;
        this.movies = new ArrayList<Movie>();
        this.screens = new ArrayList<Screen>();
    }

    public boolean addMovie(Movie m) {
        for (Movie existing : movies) {
            if (existing.getId() == m.getId()) return false;
        }
        movies.add(m);
        return true;
    }

    public boolean removeMovieById(int id) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id) {
                movies.remove(i);
                return true;
            }
        }
        return false;
    }

    public int totalDuration() {
        int count = 0;
        for (int i = 0; i < movies.size(); i++) {
            count += movies.get(i).getDuration();
        }
        return count;
    }

    public void printMovies() {
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).info());
        }
    }

    public boolean addScreen(Screen s) {
        for (int i = 0; i < screens.size(); i++) {
            if (screens.get(i).ScreenNum == s.ScreenNum) {
                return false;
            }
        }
        screens.add(s);
        return true;
    }

    public void printScreens() {
        for (int i = 0; i < screens.size(); i++) {
            System.out.println(screens.get(i).info());
        }
    }
}
