/*
 * Java Design Patterns: Flyweight
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * ConcreteFlyweight
 * implements the Flyweight interface and adds storage
 * for intrinsic state
 */
public class ConcreteFlyweight implements Flyweight {

  private int state;
  
  ConcreteFlyweight(int all_state) {
    this.state = all_state;
  }
  
  @Override
  public void operation() {
    System.out.println("Concrete Flyweight with state " + this.state);
  }
  // ...
}
