package Visitor;

public interface ComputerPartVisitor {
    public void visit(ComputerPart part);
    public void visit(Computer computer);    
}
