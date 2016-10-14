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
 * Concrete Component
 * defines an object to which additional responsibilities
 * can be attached
 */
 public class ConcreteComponent implements Component {

  @Override
  public void operation() {
    System.out.println("Concrete Component operation.");
  }
  // ...
}
