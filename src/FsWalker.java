public class FsWalker {
    public static void walk(Entry entry, FsVisitor visitor) {
        entry.accept(visitor);
        for (Entry child : entry.children()) {
            walk(child, visitor);
        }
    }
}