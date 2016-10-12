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
 * Concrete Implementor
 * implements the Implementor interface and defines 
 * concrete implementation
 */
public class ConcreteImplementorB implements Implementor {

  @Override
  public void action() {
    System.out.println("Concrete Implementor B.");
  }
  // ...
}
