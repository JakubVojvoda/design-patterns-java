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
 * Leaf
 * defines the behavior for the elements in the composition,
 * it has no children
 */
public class Leaf extends Component {
    
  private int id;
  
  Leaf(int index) {
    this.id = index;
  }
  
  @Override
  public void operation() {
    System.out.println("Leaf " + this.id + " operation.");
  }
  // ...
}
