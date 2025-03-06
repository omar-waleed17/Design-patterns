package visitor;

public class CountWordsManager implements TextManagementVisitor {
    @Override
    public void visit(TextFile text) {
        System.out.println("counting words for a text file");
    }

    @Override
    public void visit(PresentationFile presentationFile) {
        System.out.println("counting words for presentation file");
    }

    @Override
    public void visit(SpreadSheet spreadSheet) {
        System.out.println("counting words for spreadsheet");
    }
}
