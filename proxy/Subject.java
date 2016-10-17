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
 * Subject
 * defines the common interface for RealSubject and Proxy 
 * so that a Proxy can be used anywhere a RealSubject is expected
 */
public interface Subject {
    
  public void request();
  // ...
}
