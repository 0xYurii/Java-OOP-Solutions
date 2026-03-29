package lap_05.task03;

public class ThreeDMovie extends Movie {

    private boolean glassesRequired;

    public ThreeDMovie(
        int id,
        String title,
        int duration,
        boolean glassesRequired
    ) {
        super(id, title, duration);
        this.glassesRequired = glassesRequired;
    }

    public String info() {
        return (
            "ThreeDMovie{" +
            super.info() +
            ", glasses Required: " +
            glassesRequired +
            "}"
        );
    }
}
