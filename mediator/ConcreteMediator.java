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

import java.util.List;
import java.util.ArrayList;

/*
 * Concrete Mediator
 * implements cooperative behavior by coordinating Colleague objects
 * and knows its colleagues
 */
public class ConcreteMediator implements Mediator {
  
  private List<Colleague> colleagues = new ArrayList<>();

  @Override
  public void add(Colleague colleague) {
    this.colleagues.add(colleague);
  }

  @Override
  public void distribute(Colleague sender, String msg) {
    for (int i = 0; i < this.colleagues.size(); i++) {
      if (this.colleagues.get(i).getID() != sender.getID()) {
        this.colleagues.get(i).receive(msg);
      }
    }
  }
  // ...
}
