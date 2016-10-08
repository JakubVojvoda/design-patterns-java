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
 * Concrete Factory X 
 * each concrete factory create a family of products and client uses
 * one of these factories so it never has to instantiate a product object
 */
 public class ConcreteFactoryX extends AbstractFactory {
    
  @Override
  public ProductA createProductA() {
    return new ConcreteProductAX();
  }
  
  @Override
  public ProductB createProductB() {
    return new ConcreteProductBX();
  }
  // ...    
}
