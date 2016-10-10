/*
 * Java Design Patterns: Adapter
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

    Adaptee adaptee = new Adaptee();
    
    Target target = new Adapter(adaptee);
    target.request();
  }    
}
