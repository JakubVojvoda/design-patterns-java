/*
 * Java Design Patterns: Bridge
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
      
    Implementor ia = new ConcreteImplementorA();
    Implementor ib = new ConcreteImplementorB();
    
    Abstraction abstract1 = new RefinedAbstraction(ia);
    abstract1.operation();
    
    Abstraction abstract2 = new RefinedAbstraction(ib);
    abstract2.operation();
  }
}
