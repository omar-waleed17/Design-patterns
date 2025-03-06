package visitor;

public class FormatTextManager implements TextManagementVisitor{
    @Override
    public void visit(TextFile text) {
        System.out.println("formating textfile");
        System.out.println("//////////////");
    }

    @Override
    public void visit(SpreadSheet spreadSheet) {
        System.out.println("formating spreadsheet");
        System.out.println("//////////////");
    }

    @Override
    public void visit(PresentationFile presentationFile) {
        System.out.println("formating presentation file");
        System.out.println("//////////////");
    }
}
