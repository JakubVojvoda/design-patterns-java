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
 * Creator
 * contains the implementation for all of the methods
 * to manipulate products except for the factory method
 */
public interface Creator {
    
  public Product createProductA();
  public Product createProductB();
  // ...
}
