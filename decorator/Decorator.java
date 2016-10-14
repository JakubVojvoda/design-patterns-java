/*
 * Java Design Patterns: Decorator
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Decorator
 * maintains a reference to a Component object and defines 
 * an interface that conforms to Component's interface
 */
public abstract class Decorator implements Component {

  protected Component component;
  
  Decorator(Component component) {
    this.component = component;
  }
  
  @Override
  public void operation() {
    this.component.operation();
  }
  // ...
}
