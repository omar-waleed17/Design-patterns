package visitor;

public class PresentationFile implements DocumentProcessingSystem{
    public void accept(TextManagementVisitor visitor) {
        visitor.visit(this);
    }
}
