/*
 * Java Design Patterns: Chain of Responsibility
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Handler
 * handles requests it is responsible for
 */
public class ConcreteHandler2 extends Handler {
    
  public Boolean canHandle() {
    // ...
    return true;
  }
  
  @Override
  void handleRequest() {
    if (this.canHandle()) {
      System.out.println("Handled by Concrete Handler 2");
    } else {
      System.out.println("Cannot handle by Handler 2");
      super.handleRequest();
    }
  }
  // ...
}
