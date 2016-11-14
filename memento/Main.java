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

public class Main {
    
  public static void main(String[] args) {
    
    CareTaker caretaker = new CareTaker();
    
    caretaker.originator.setState(1);
    caretaker.save();
    System.out.println("Set state: " + caretaker.originator.getState());
    
    caretaker.originator.setState(2);
    caretaker.save();
    System.out.println("Set state: " + caretaker.originator.getState());

    caretaker.originator.setState(3);
    System.out.println("Set state: " + caretaker.originator.getState());
    
    caretaker.undo();
    System.out.println("Undo state: " + caretaker.originator.getState());
  }
}
