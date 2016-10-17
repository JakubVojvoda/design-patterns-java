/*
 * Java Design Patterns: Flyweight
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
      
    FlyweightFactory factory = new FlyweightFactory();
    factory.getFlyweight(1).operation();
    factory.getFlyweight(2).operation();
  }
}
