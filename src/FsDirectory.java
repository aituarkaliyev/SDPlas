import java.util.List;

public class FsDirectory implements Entry {
    private final String name;
    private final List<Entry> children;

    public FsDirectory(String name, List<Entry> children) {
        this.name = name;
        this.children = List.copyOf(children);
    }

    public String name() {
        return name;
    }

    @Override
    public List<Entry> children() {
        return children;
    }

    @Override
    public void accept(FsVisitor visitor) {
        visitor.visitDirectory(this);
    }
}