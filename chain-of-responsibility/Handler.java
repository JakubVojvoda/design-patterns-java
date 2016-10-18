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
  
  void setHandler(Handler handler) {
    this.successor = handler;
  }
  
  void handleRequest() {
    if (this.successor != null) {
      this.successor.handleRequest();
    }
  }
  // ...
}
