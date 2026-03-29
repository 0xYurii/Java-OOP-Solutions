package lap_05.task03;

public class RegularMovie extends Movie {

    private String ageRating;

    public RegularMovie(int id, String title, int duration, String ageRating) {
        super(id, title, duration);
        this.ageRating = ageRating;
    }

    public String info() {
        return (
            "RegularMovie{" + super.info() + ", age Rating: " + ageRating + "}"
        );
    }
}
