/*
 * Java Design Patterns: Facade
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Subsystem
 * implements more complex subsystem functionality
 * and has no knowledge of the facade
 */
public class SubSystemB {

  public void suboperation() {
    System.out.println("Subsystem B method.");
  }
  // ...   
}
