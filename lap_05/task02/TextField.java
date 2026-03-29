package lap_05.task02;

public class TextField extends FsItem {

    private int lineCount;
    private String encoding;

    public TextField(
        int lineCount,
        String encoding,
        String name,
        double size,
        String path
    ) {
        super(name, size, path);
        this.encoding = encoding;
        this.lineCount = lineCount;
    }

    public String info() {
        return (
            "TextField{" +
            super.info() +
            ", line count: " +
            lineCount +
            ", encoding: " +
            encoding +
            "}"
        );
    }
}
