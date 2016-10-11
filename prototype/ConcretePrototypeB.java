/*
 * Java Design Patterns: Prototype
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Prototype
 * implements an operation for cloning itself
 */
public class ConcretePrototypeB implements Prototype {

  @Override
  public Prototype clone() {
    return new ConcretePrototypeB();
  }

  @Override
  public String type() {
    return "type B";
  }
  // ...
}
