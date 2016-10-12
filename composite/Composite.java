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

import java.util.List;
import java.util.ArrayList;

/*
 * Composite
 * defines behavior of the components having children
 * and store child components
 */
public class Composite extends Component {

  private List<Component> children;

  public Composite() {
    this.children = new ArrayList<Component>();
  }
      
  @Override
  public void add(Component component) {
    this.children.add(component);
  }

  @Override
  public void remove(int index) {
    this.children.remove(index);
  }

  @Override
  public void operation() {
    for (int i = 0; i < this.children.size(); i++) {
      this.children.get(i).operation();
    }
  }
  // ...
}
