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
 * Product A
 * products implement the same interface so that the classes can refer
 * to the interface not the concrete product
 */
public interface ProductA {
    
  String getName();
  // ...
}
