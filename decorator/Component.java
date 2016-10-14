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
 * Component
 * defines an interface for objects that 
 * can have responsibilities added to them dynamically
 */
public interface Component {
    
  public void operation();
  // ...
}
