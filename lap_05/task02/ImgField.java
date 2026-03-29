package lap_05.task02;

public class ImgField extends FsItem {

    private int width, height;
    private String format;

    public ImgField(
        String name,
        String path,
        double size,
        int width,
        int height,
        String format
    ) {
        super(name, size, path);
        this.width = width;
        this.height = height;
        this.format = format;
    }

    public String getResolution() {
        return width + "x" + height;
    }

    public String info() {
        return (
            "ImageFile{" +
            super.info() +
            ", " +
            getResolution() +
            ", format=" +
            format +
            "}"
        );
    }
}
