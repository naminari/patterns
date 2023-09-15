public class Main {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEExprassion = getJavaEEExprassion();

        System.out.println("Does developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEExprassion.interpret("Java Spring"));
    }
    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExprassion(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AddExpression(java, spring);
    }
}