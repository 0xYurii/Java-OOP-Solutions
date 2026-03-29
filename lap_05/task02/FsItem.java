package lap_05.task02;

public class FsItem {

    private String name;
    private double size;
    private String path;

    public FsItem(String name, double size, String path) {
        this.name = name.trim();
        this.size = size;
        this.path = path;
    }

    public void rename(String newName) {
        name = newName.trim();
    }

    public String info() {
        return (
            "FsItem{name=" + name + ", path=" + path + ", size=" + size + "kb}"
        );
    }
}
