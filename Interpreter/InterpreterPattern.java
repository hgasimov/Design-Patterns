package Interpreter;


public class InterpreterPattern {
    private static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(john, john);
    }
    
    private static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
    
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        
        String context1 = "John";
        String context2 = "Married Julie";
        System.out.println("Is " + context1 + " male? - " + isMale.interpret(context1));
        System.out.println("Is " + context2 + " a married woman? - " + isMarriedWoman.interpret(context2));
    }        
}
