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
 * Concrete Element
 * implements an accept operation that takes a visitor as an argument
 */
public class ConcreteElementB implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitElementB(this);
  }
  // ...
}
