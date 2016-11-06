/*
 * Java Design Patterns: Template Method 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Class
 * implements the primitive operations to carry out specific steps
 * of the algorithm, there may be many Concrete classes, each implementing
 * the full set of the required operation
 */
public class ConcreteClass extends AbstractClass {

  @Override
  public void primitiveOperation1() {
    System.out.println("Primitive operation 1.");
  }

  @Override
  public void primitiveOperation2() {
    System.out.println("Primitive operation 2.");
  }
  // ...
}
