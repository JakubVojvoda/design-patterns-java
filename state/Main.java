/*
 * Java Design Patterns: State 
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
    
    State stateA = new ConcreteStateA();
    State stateB = new ConcreteStateB();
    
    Context context = new Context();
    
    context.setState(stateA);
    context.request();
    
    context.setState(stateB);
    context.request();
  }
}
