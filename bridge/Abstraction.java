/*
 * Java Design Patterns: Bridge
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Abstraction
 * defines the abstraction's interface
 */
abstract class Abstraction {
    
  protected Implementor implementor;
  
  Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }
  
  public abstract void operation();
  // ...
}
