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
 * Abstract Expression
 * declares an abstract Interpret operation that is common 
 * to all nodes in the abstract syntax tree
 */
public abstract class AbstractExpression {
    
  public Boolean interpret(Context context) {
      return false;
  }
  // ...
}
