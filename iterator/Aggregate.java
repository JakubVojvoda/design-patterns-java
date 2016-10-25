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
 * Aggregate
 * defines an interface for aggregates and it decouples your
 * client from the implementation of your collection of objects
 */
public interface Aggregate {
    
  public Iterator createIterator();
  // ...
}
