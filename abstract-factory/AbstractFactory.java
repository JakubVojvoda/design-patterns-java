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
 * Abstract Factory
 * provides an abstract interface for creating a family of products
 */
public abstract class AbstractFactory {
    
  abstract ProductA createProductA();
  abstract ProductB createProductB();
  // ...
}
