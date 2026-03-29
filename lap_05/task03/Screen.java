package lap_05.task03;

public class Screen {

    int ScreenNum;
    int Capacity;

    public Screen(int ScreenNum, int Capacity) {
        this.ScreenNum = ScreenNum;
        this.Capacity = Capacity;
    }

    public int getScreenNum() {
        return ScreenNum;
    }

    public String info() {
        return (
            "Screen{Screen number: " +
            ScreenNum +
            ", capacity: " +
            Capacity +
            "}"
        );
    }
}
