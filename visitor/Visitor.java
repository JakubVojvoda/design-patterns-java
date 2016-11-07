/*
 * Java Design Patterns: Visitor
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Visitor
 * declares a Visit operation for each class of ConcreteElement
 * in the object structure
 */
public interface Visitor {
    
  public void visitElementA(ConcreteElementA element);
  public void visitElementB(ConcreteElementB element);
  // ...
}
