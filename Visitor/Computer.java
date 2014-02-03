package Visitor;


public class Computer {
    private ComputerPart[] parts;
    
    public Computer() {
        ComputerPart keyboard = new ComputerPart(ComputerPart.KEYBOARD);
        ComputerPart monitor = new ComputerPart(ComputerPart.MONITOR);
        ComputerPart mouse = new ComputerPart(ComputerPart.MOUSE);
        
        parts = new ComputerPart[] {keyboard, monitor, mouse};
    }
    
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part: parts)
            visitor.visit(part);
        
        visitor.visit(this);
    }
}
