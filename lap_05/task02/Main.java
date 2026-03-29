package lap_05.task02;

public class Main {

    public static void main(String[] args) {
        // --- VALID inputs ---
        TextField txt = new TextField(
            300,
            "UTF-8",
            "notes.txt",
            12.5,
            "/home/docs"
        );
        ImgField img = new ImgField(
            "photo.png",
            "/home/pics",
            2048.0,
            1920,
            1080,
            "PNG"
        );

        System.out.println(txt.info());
        System.out.println(img.info());

        // rename test
        txt.rename("updated_notes.txt");
        System.out.println("After rename: " + txt.info());

        try {
            txt.rename(" "); // blank rename!
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
