/*
 * Java Design Patterns: Proxy
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Real Subject
 * defines the real object that the proxy represents
 */
public class RealSubject implements Subject {
    
  public void request() {
    System.out.println("Real Subject request.");
  }
  // ...
}
