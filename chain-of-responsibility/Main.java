/*
 * Java Design Patterns: Chain of Responsibility
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

    Handler handler1 = new ConcreteHandler1();
    Handler handler2 = new ConcreteHandler2();
    
    handler1.setHandler(handler2);
    handler1.handleRequest();
  }
}
