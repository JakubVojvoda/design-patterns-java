/*
 * Java Design Patterns: Builder
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Product
 * the final object that will be created using Builder
 */
public class Product {
  
  private String partA;
  private String partB;
  private String partC;
  
  public void makeA(String part) {
    this.partA = part;
  }
  
  public void makeB(String part) {
    this.partB = part;
  }
  
  public void makeC(String part) {
    this.partC = part;
  }
  
  public String get() {
    return (partA + " " + partB + " " + partC);
  }
  // ...
}
