/*
 * Java Design Patterns: Prototype
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
      
    Prototype prototype;
    
    prototype = Client.make(0);
    System.out.println("Prototype " + prototype.type());
    
    prototype = Client.make(1);
    System.out.println("Prototype " + prototype.type());
  }
}
