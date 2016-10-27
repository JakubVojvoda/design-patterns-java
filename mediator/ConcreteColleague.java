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
 * Concrete Colleague
 * each colleague communicates with its mediator whenever
 * it would have otherwise communicated with another colleague
 */
public class ConcreteColleague extends Colleague {

  ConcreteColleague(Mediator mediator, int i) {
    super(mediator, i);
  }

  @Override
  public void send(String msg) {
    System.out.println("Message " + msg + " sent by Colleague " + this.id);
    this.mediator.distribute(this, msg);
  }

  @Override
  public void receive(String msg) {
    System.out.println("Message " + msg + " received by Colleague " + this.id);
  }
  // ...
}
