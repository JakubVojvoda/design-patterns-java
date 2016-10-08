/*
 * Java Design Patterns: Abstract Factory
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Concrete Product BY
 * defines objects to be created by concrete factory
 */
public class ConcreteProductBY implements ProductB {

  @Override
  public String getName() {
    return "B-Y";
  }
  // ...      
}
