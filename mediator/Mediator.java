/*
 * Java Design Patterns: Mediator 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Mediator
 * defines an interface for communicating with Colleague objects
 */
public interface Mediator {
  
  public void add(Colleague colleague);
  public void distribute(Colleague sender, String msg);
  // ...
}
