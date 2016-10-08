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
 * Concrete Product BX
 * defines objects to be created by concrete factory
 */
public class ConcreteProductBX implements ProductB {

  @Override
  public String getName() {
    return "B-X";
  }
  // ...    
}
