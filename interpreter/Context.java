/*
 * Java Design Patterns: Interpreter 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

import java.util.HashMap;
import java.util.Map;

/*
 * Context
 * contains information that's global to the interpreter
 */
public class Context {

  private final Map<String, Boolean> map = new HashMap<>(); 
  
  public void set(String var, Boolean value) {
    this.map.put(var, value);
  }
  
  public Boolean get(String exp) {
    return this.map.get(exp);
  }
  // ...
}
