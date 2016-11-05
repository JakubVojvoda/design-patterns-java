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
 * Context
 * maintains a reference to a Strategy object
 */
public class Context {
  
  private final Strategy strategy;
  
  Context(Strategy strategy) {
    this.strategy = strategy;
  }
  
  public void callStrategy() {
    this.strategy.algorithm();
  }
  // ...
}
