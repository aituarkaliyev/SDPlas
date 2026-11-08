public class SizeCalculatorVisitor implements FsVisitor {
    private long totalSize = 0;

    @Override
    public void visitFile(FsFile file) {
        totalSize = Math.addExact(totalSize, file.bytes());
    }

    @Override
    public void visitDirectory(FsDirectory directory) {
    }

    public long getTotalSize() {
        return totalSize;
    }
}