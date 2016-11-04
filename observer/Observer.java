/*
 * Java Design Patterns: Observer 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Observer
 * defines an updating interface for objects that should be notified
 * of changes in a subject
 */
public interface Observer {
    
  public int getState();
  public void update(Subject subject);
  // ...
}
