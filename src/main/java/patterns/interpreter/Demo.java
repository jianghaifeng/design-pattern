package patterns.interpreter;

public class Demo {
    public static void main(String[] args) {
        Expression john = new TerminalExpression("John");
        Expression robert = new TerminalExpression("Robert");
        Expression isMale = new OrExpression(john, robert);

        Expression married = new TerminalExpression("married");
        Expression kate = new TerminalExpression("Kate");
        Expression isMarried = new AndExpression(married, kate);

        System.out.println("John is male: " + isMale.interpret("John"));
        System.out.println("Kate is married: " + isMarried.interpret("Kate married"));
    }
}
