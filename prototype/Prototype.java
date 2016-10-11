/*
 * Java Design Patterns: Prototype
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Prototype
 * declares an interface for cloning itself
 */
public interface Prototype {
    
  public Prototype clone();    
  public String type();
  // ...
}
