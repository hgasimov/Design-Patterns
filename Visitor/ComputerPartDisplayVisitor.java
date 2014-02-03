package Visitor;


public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

    @Override
    public void visit(ComputerPart part) {
        switch(part.getPartNo()) {
            case 1:                 
                System.out.println("Displaying keyboard");
                break;
            case 2:
                System.out.println("Displaying monitor");
                break;
            case 3:
                System.out.println("Displaying mouse");                
        }
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying the whole computer");                
    }
    
}
