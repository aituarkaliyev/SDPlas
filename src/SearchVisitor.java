import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FsVisitor {
    private final String suffix;
    private final List<String> matches = new ArrayList<>();

    public SearchVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visitFile(FsFile file) {
        if (file.name().endsWith(suffix)) {
            matches.add(file.name());
        }
    }

    @Override
    public void visitDirectory(FsDirectory directory) {
    }

    public List<String> getMatches() {
        return List.copyOf(matches);
    }
}