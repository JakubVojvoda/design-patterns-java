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
 * AbstractClass
 * implements a template method defining the skeleton of an algorithm
 */
public abstract class AbstractClass {
    
  public void templateMethod() {    
    // ...
    primitiveOperation1();
    // ...
    primitiveOperation2();
    // ...
  }
  
  public abstract void primitiveOperation1();
  public abstract void primitiveOperation2();
  // ...
}
