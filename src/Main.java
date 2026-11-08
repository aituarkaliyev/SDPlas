import java.util.List;

public class Main {
    public static void main(String[] args) {
        Entry root = new FsDirectory("project", List.of(
                new FsFile("README.md", 100),
                new FsDirectory("src", List.of(
                        new FsFile("Main.java", 250),
                        new FsFile("Util.java", 150)
                ))
        ));

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        FsWalker.walk(root, sizeVisitor);
        System.out.println("Total project size: " + sizeVisitor.getTotalSize() + " bytes");

        SearchVisitor searchVisitor = new SearchVisitor(".java");
        FsWalker.walk(root, searchVisitor);
        System.out.println("Found Java files: " + searchVisitor.getMatches());
    }
}