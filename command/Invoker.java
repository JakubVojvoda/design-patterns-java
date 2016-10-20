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
 * Invoker
 * asks the command to carry out the request
 */
public class Invoker {

  private Command command;
  
  void set(Command command) {
    this.command = command;
  }
  
  void confirm() {
    if (this.command != null) {
      this.command.execute();
    }
  }
  // ...
}
