public interface FsVisitor {
    void visitFile(FsFile file);
    void visitDirectory(FsDirectory directory);
}
