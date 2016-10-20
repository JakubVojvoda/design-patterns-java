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
 * Concrete Command
 * implements execute by invoking the corresponding 
 * operation(s) on Receiver 
 */
public class ConcreteCommand implements Command {
    
  private final Receiver receiver;
  
  ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }
  
  @Override
  public void execute() {
    receiver.action();
  }
  // ...  
}
