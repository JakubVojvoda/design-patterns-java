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
public class ConcretePrototypeA implements Prototype {

  @Override
  public Prototype clone() {
    return new ConcretePrototypeA();
  }

  @Override
  public String type() {
    return "type A";
  }
  // ...
}
