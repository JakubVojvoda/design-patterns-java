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
 * Product
 * products implement the same interface so that the classes can refer
 * to the interface not the concrete product
 */
public interface Product {
    
  public String getName();
  // ...
}
