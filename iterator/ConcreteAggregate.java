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
 * Concrete Aggregate
 * has a collection of objects and implements the method
 * that returns an Iterator for its collection
 */
public class ConcreteAggregate implements Aggregate {

  private final int list[];

  ConcreteAggregate(int list[]) {
    this.list = list;
  }
  
  @Override
  public Iterator createIterator() {
    return new ConcreteIterator(this);
  }
  
  public int size() {
    return list.length;
  }
  
  public int at(int index) {
    return list[index];
  }
  // ...
}
