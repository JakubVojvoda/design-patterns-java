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
 * Nonterminal Expression
 * implements an Interpret operation for nonterminal symbols
 * in the grammar (one such class is required for every rule 
 * in the grammar)
 */
public class NonterminalExpression extends AbstractExpression {
    
  private final AbstractExpression lop;
  private final AbstractExpression rop;
  
  NonterminalExpression(AbstractExpression left, AbstractExpression right) {
    this.lop = left;
    this.rop = right;
  }
  
  @Override
  public Boolean interpret(Context context) {
    return this.lop.interpret(context) && this.rop.interpret(context);
  }
  // ...
}
