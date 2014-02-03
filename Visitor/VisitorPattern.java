package Visitor;


public class VisitorPattern {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.accept(new ComputerPartDisplayVisitor());
    }        
}
