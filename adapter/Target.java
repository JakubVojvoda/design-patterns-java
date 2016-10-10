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
 * Target
 * defines specific interface that Client uses
 */
public interface Target {
    
  public void request();
  // ...
}
