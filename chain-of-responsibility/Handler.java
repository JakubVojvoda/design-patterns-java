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
 * Handler
 * defines an interface for handling requests and
 * optionally implements the successor link
 */
public abstract class Handler {
    
  private Handler successor;
  
  public void setHandler(Handler handler) {
    this.successor = handler;
  }
  
  public void handleRequest() {
    if (this.successor != null) {
      this.successor.handleRequest();
    }
  }
  // ...
}
