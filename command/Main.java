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

public class Main {
    
  public static void main(String[] args) {
    
    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    
    Invoker invoker = new Invoker();
    invoker.set(command);
    invoker.confirm();
  }
}
