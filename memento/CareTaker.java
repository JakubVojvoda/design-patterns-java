/*
 * Java Design Patterns: Memento 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

import java.util.ArrayList;
import java.util.List;

/*
 * CareTaker
 * is responsible for the memento's safe keeping
 */
public class CareTaker {
    
  public final Originator originator;
  private final List<Originator.Memento> history;
  
  CareTaker() {
    this.originator = new Originator();
    this.history = new ArrayList<>();
  }
      
  public void save() {
    history.add(this.originator.createMemento());
  }
  
  public void undo() {
    int index = this.history.size();
    this.originator.setMemento(this.history.remove(index - 1));
  }
  // ...
}
