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
 * Colleague classes
 * each colleague communicates with its mediator whenever
 * it would have otherwise communicated with another colleague
 */
public abstract class Colleague {
    
  protected Mediator mediator;
  protected int id;
  
  Colleague(Mediator mediator, int i) {
    this.mediator = mediator;
    this.id = i;
  }
  
  public int getID() {
    return this.id;
  }
  
  public abstract void send(String msg);
  public abstract void receive(String msg);
  // ...
}
