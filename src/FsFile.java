public class FsFile implements Entry {
    private final String name;
    private final long bytes;

    public FsFile(String name, long bytes) {
        this.name = name;
        this.bytes = bytes;
    }

    public String name() {
        return name;
    }

    public long bytes() {
        return bytes;
    }

    @Override
    public void accept(FsVisitor visitor) {
        visitor.visitFile(this);
    }
}