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
 * Proxy
 * maintains a reference that lets the proxy access the real subject
 */
public class Proxy implements Subject {
    
  private final RealSubject subject = new RealSubject();
  
  @Override
  public void request() {
    this.subject.request();
  }
  // ...
}
