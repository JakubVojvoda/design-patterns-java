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
 * Element
 * defines an accept operation that takes a visitor as an argument
 */
public interface Element {
    
  public void accept(Visitor visitor);
  // ...
}
