/*
 * Java Design Patterns: Factory Method
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
      
    Creator creator = new ConcreteCreator();
    
    Product p1 = creator.createProductA();
    System.out.println("Product: " + p1.getName());
    
    Product p2 = creator.createProductB();
    System.out.println("Product: " + p2.getName());
  }    
}
