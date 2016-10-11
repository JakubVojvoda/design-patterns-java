/*
 * Java Design Patterns: Prototype
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
 * Client
 * creates a new object by asking a prototype to clone itself
 */
public class Client {

  private static List<Prototype> types; 
  
  static {
    Client.types = new ArrayList<Prototype>() {
      {
        add(new ConcretePrototypeA());
        add(new ConcretePrototypeB());
      }
    };
  }
  
  public static Prototype make(int index) {
    return Client.types.get(index).clone();
  } 
  // ...
}
