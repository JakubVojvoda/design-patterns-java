/*
 * Java Design Patterns: Visitor
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
    
    Element elementA = new ConcreteElementA();
    Element elementB = new ConcreteElementB();
    
    Visitor visitor1 = new ConcreteVisitor1();
    Visitor visitor2 = new ConcreteVisitor2();

    elementA.accept(visitor1);
    elementA.accept(visitor2);
    
    elementB.accept(visitor1);
    elementB.accept(visitor2);        
  }
}
