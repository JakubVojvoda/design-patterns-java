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
 * Concrete Creator
 * implements factory method that is responsible for creating
 * one or more concrete products ie. it is class that has
 * the knowledge of how to create the products
 */
public class ConcreteCreator implements Creator {

  @Override
  public Product createProductA() {
    return new ConcreteProductA();
  }

  @Override
  public Product createProductB() {
    return new ConcreteProductB();
  }
  // ...
}
