/*
 * Java Design Patterns: Composite
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
      
    Composite composite = new Composite();
    
    for (int i = 0; i < 10; i++) {
      composite.add(new Leaf(i));
    }
    
    composite.operation();
  }
}
