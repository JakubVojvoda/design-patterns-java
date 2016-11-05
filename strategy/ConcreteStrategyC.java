/*
 * Java Design Patterns: Strategy 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Strategy
 * implements the algorithm using the Strategy interface
 */
public class ConcreteStrategyC implements Strategy {

  @Override
  public void algorithm() {
    System.out.println("Concrete Strategy C");
  }
  // ...
}
