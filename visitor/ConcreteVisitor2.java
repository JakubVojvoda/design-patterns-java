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
 * Concrete Visitor
 * implements each operation declared by Visitor, which implement
 * a fragment of the algorithm defined for the corresponding class
 * of object in the structure
 */
public class ConcreteVisitor2 implements Visitor {

  @Override
  public void visitElementA(ConcreteElementA element) {
    System.out.println("Concrete Visitor 2: Element A visited.");
  }

  @Override
  public void visitElementB(ConcreteElementB element) {
    System.out.println("Concrete Visitor 2: Element B visited.");
  }
  // ...
}
