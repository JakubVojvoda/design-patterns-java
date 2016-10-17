/*
 * Java Design Patterns: Flyweight
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

import java.util.HashMap;

/*
 * FlyweightFactory
 * creates and manages flyweight objects and ensures
 * that flyweights are shared properly
 */
public class FlyweightFactory {

  private HashMap<Integer, Flyweight> flies = new HashMap();
  
  Flyweight getFlyweight(int key) {
    if (flies.get(key) != null) {
      return flies.get(key);
    }
    
    Flyweight fly = new ConcreteFlyweight(key);
    flies.put(key, fly);
    return fly;
  }
  // ...
}
