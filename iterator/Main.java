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

public class Main {
    
  public static void main(String[] args) {
      
    int l[] = {1, 2, 3, 4, 5};
    ConcreteAggregate list = new ConcreteAggregate(l);
    
    Iterator it = list.createIterator();
    for ( ; !it.isDone(); it.next()) {
      System.out.println("Item value: " + it.currentItem());
    }
  }
}
