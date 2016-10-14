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
 * Concrete Decorators
 * adds responsibilities to the component 
 * (can extend the state of the component)
 */
public class ConcreteDecoratorB extends Decorator {
    
  public ConcreteDecoratorB(Component component) {
    super(component);
  }
  
  @Override
  public void operation() {
    super.operation();
    System.out.println("Decorator B");
  }
  // ...
}
