/*
 * Java Design Patterns: Singleton
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Singleton
 * has private static variable to hold one instance of the class
 * and method which gives us a way to instantiate the class
 */
public class Singleton {
    
  private static Singleton instance = null;
  
  public synchronized static Singleton get() {
      
    if (Singleton.instance == null) {
      Singleton.instance = new Singleton();
    }
    
    return Singleton.instance;
  }
  
  public void tell() {
    System.out.println("This is singleton.");
  }
  // ...
}
