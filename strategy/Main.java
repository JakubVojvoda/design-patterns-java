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

public class Main {
    
  public static void main(String[] args) {

    Strategy strategy = new ConcreteStrategyA();
    // Strategy strategy = new ConcreteStrategyB();
    // Strategy strategy = new ConcreteStrategyC();
    
    Context context = new Context(strategy);
    context.callStrategy();
  }
}
