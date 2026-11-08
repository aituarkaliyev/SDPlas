import java.util.List;

public interface Entry {
    void accept(FsVisitor visitor);
    default List<Entry> children() {
        return List.of();
    }
}