package Visitor;

public class ComputerPart {
    private int partNo;
    public static final int KEYBOARD = 1;
    public static final int MONITOR = 2;
    public static final int MOUSE = 3;    
    
    public ComputerPart(int partNo) {
        this.partNo = partNo;
    }
    
    public int getPartNo() {
        return partNo;
    }
    
    public void accept(ComputerPartVisitor visitor){
        visitor.visit(this);
    }
}
