/*
 * Java Design Patterns: Abstract Factory
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Product AX
 * defines objects to be created by concrete factory
 */
 public class ConcreteProductAX implements ProductA {

  @Override
  public String getName() {
    return "A-X";
  }
  // ...
}
