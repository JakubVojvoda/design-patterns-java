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

/*
 * Concrete State
 * each subclass implements a behavior associated 
 * with a state of the Context
 */
public class ConcreteStateA implements State {

  @Override
  public void handle() {
    System.out.println("State A handled.");
  }
  // ...
}
