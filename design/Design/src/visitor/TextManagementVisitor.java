package visitor;

import org.w3c.dom.Text;

public interface TextManagementVisitor {
    void visit(TextFile text);
    void visit(SpreadSheet spreadSheet);
    void visit(PresentationFile presentationFile);
}
