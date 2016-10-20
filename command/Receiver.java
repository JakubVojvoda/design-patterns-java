/*
 * Java Design Patterns: Command 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Receiver
 * knows how to perform the operations associated 
 * with carrying out a request
 */
public class Receiver {

  public void action() {
    System.out.println("Receiver: execute action");
  }
  // ...
}
