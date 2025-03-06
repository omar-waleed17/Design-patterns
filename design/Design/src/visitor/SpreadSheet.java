package visitor;

public class SpreadSheet implements DocumentProcessingSystem{
    public void accept(TextManagementVisitor visitor) {
visitor.visit(this);
    }
}
