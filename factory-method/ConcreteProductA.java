/*
 * Java Design Patterns: Factory Method
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Product
 * define product to be created
 */
public class ConcreteProductA implements Product {

  @Override
  public String getName() {
    return "type A";
  }
  // ...
}
