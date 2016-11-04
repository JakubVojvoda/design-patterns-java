/*
 * Java Design Patterns: Observer 
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
 * Subject
 * knows its observers and provides an interface for attaching
 * and detaching observers
 */
public abstract class Subject {
    
  private List<Observer> observers = new ArrayList<>();
  
  public void attach(Observer observer) {
    this.observers.add(observer);
  }
  
  public void detach(int index) {
    this.observers.remove(index);
  }
  
  public void notifyObservers() {
    for (int i = 0; i < this.observers.size(); i++) {
      this.observers.get(i).update(this);
    }
  }
  
  public abstract int getState();
  public abstract void setState(int state);
  // ...
}
