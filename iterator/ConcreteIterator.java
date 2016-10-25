/*
 * Java Design Patterns: Iterator 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Iterator
 * implements the interface and is responsible 
 * for managing the current position of the iterator
 */
public class ConcreteIterator implements Iterator {

  private final ConcreteAggregate list;
  private int index;
  
  ConcreteIterator(ConcreteAggregate l) {
    this.list = l;
    this.index = 0;
  }
  
  @Override
  public void first() {
    this.index = 0;
  }

  @Override
  public void next() {
    this.index++;
  }

  @Override
  public boolean isDone() {
    return (this.index >= this.list.size());
  }

  @Override
  public int currentItem() {
    if (this.isDone()) {
      return -1;
    }
    return this.list.at(index);
  }
  // ...
}
