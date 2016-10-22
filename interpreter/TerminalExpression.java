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

/*
 * Terminal Expression
 * implements an Interpret operation associated with terminal symbols
 * in the grammar (an instance is required for every terminal symbol
 * in a sentence)
 */
public class TerminalExpression extends AbstractExpression {
    
  private final String value;
  
  TerminalExpression(String val) {
    this.value = val;
  }
  
  @Override
  public Boolean interpret(Context context) {
    return context.get(this.value);
  }
  // ...
}
