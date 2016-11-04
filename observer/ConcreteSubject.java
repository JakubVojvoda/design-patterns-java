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

/*
 * Concrete Subject
 * stores state that should stay consistent with the subject's
 */
public class ConcreteSubject extends Subject {

  private int subject_state;
  
  @Override
  public int getState() {
    return this.subject_state;
  }

  @Override
  public void setState(int state) {
    this.subject_state = state;
  }
  // ...  
}
