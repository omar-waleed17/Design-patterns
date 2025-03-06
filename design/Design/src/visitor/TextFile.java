package visitor;

public class TextFile  implements DocumentProcessingSystem{
    @Override
    public void accept(TextManagementVisitor visitor) {
        visitor.visit(this);
    }
}
