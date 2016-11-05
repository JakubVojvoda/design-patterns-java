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
 * State
 * defines an interface for encapsulating the behavior associated
 * with a particular state of the Context
 */
public interface State {
    
  public void handle();
  // ...
}
