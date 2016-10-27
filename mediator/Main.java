/*
 * Java Design Patterns: Mediator 
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
    
    Mediator mediator = new ConcreteMediator();

    Colleague c1 = new ConcreteColleague(mediator, 1);
    Colleague c2 = new ConcreteColleague(mediator, 2);
    Colleague c3 = new ConcreteColleague(mediator, 3);
    
    mediator.add(c1);
    mediator.add(c2);
    mediator.add(c3);
    
    c1.send("Hi!");
    c3.send("Hello!");
  }
}
