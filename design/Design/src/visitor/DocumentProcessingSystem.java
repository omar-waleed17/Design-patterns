package visitor;

public interface DocumentProcessingSystem {
   void  accept(TextManagementVisitor visitor);
}
