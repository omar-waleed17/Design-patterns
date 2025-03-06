package visitor;

public class ExtractTextManager implements TextManagementVisitor{


    @Override
    public void visit(TextFile text) {
        System.out.println("extracting textfile");
    }

    @Override
    public void visit(SpreadSheet spreadSheet) {
        System.out.println("extracting spreadsheet");
    }

    @Override
    public void visit(PresentationFile presentationFile) {
        System.out.println("extracting presentation file");
    }
}
