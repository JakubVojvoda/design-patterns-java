/*
 * Java Design Patterns: Composite
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
 * defines an interface for all objects in the composition
 * both the composite and the leaf nodes
 */
public abstract class Component {
  
  public void add(Component component) {}
  public void remove(int index) {}
  
  abstract void operation();
  // ...
}
