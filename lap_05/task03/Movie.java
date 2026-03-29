package lap_05.task03;

public class Movie {

    private int id;
    private String title;
    private int duration;

    public Movie(int id, String title, int duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public String info() {
        return (
            "Movie{id: " +
            id +
            ", title: " +
            title +
            ", duration: " +
            duration +
            "}"
        );
    }
}
