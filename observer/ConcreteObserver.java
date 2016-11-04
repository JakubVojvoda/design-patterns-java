/*
 * Java Design Patterns: Observer 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Observer
 * stores state of interest to ConcreteObserver objects and
 * sends a notification to its observers when its state changes
 */
public class ConcreteObserver implements Observer {

  private int observer_state;
  
  ConcreteObserver(int state) {
    this.observer_state = state;
  }
  
  @Override
  public int getState() {
    return this.observer_state;
  }

  @Override
  public void update(Subject subject) {
    this.observer_state = subject.getState();
    System.out.println("Observer state updated.");
  }
  // ...
}
