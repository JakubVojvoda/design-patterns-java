/*
 * Java Design Patterns: Adapter
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Adaptee
 * defines an existing interface that needs adapting 
 * and thanks to Adapter it will get calls that client 
 * makes on the Target
 *
 */
public class Adaptee {
    
  void specificRequest() {
    System.out.println("Specific request.");
  }
  // ...
}
