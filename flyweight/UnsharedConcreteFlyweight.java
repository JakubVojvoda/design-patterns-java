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
 * UnsharedConcreteFlyweight
 * not all subclasses need to be shared
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    
  private int state;
  
  UnsharedConcreteFlyweight(int intrinsic_state) {
    this.state = intrinsic_state;
  }
  
  @Override
  public void operation() {
    System.out.println("Unshared Flyweight with state " + this.state);
  }
  // ...
}
