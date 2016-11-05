/*
 * Java Design Patterns: State 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Context
 * defines the interface of interest to clients
 */
public class Context {
  
  private State state;
  
  public void setState(State state) {
    this.state = state;
  }
  
  public void request() {
    if (this.state != null) {
      this.state.handle();
    }
  }
  // ...
}
