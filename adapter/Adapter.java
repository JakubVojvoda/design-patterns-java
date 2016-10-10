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

/*
 * Adapter
 * implements the Target interface and when it gets a method 
 * call it delegates the call to a Adaptee
 */
public class Adapter implements Target {  
  
  private final Adaptee adaptee;
  
  Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    adaptee.specificRequest();
  }
  // ...   
}
