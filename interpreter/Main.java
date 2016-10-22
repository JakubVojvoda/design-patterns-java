/*
 * Java Design Patterns: Interpreter 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

public class Main {
    
  public static void main(String[] args) {

    AbstractExpression A = new TerminalExpression("A");
    AbstractExpression B = new TerminalExpression("B");
    AbstractExpression exp = new NonterminalExpression(A, B);
    
    Context context = new Context();
    context.set("A", true);
    context.set("B", false);
    
    System.out.print(context.get("A") + " AND " + context.get("B"));
    System.out.println(" = " + exp.interpret(context));
  }
}
