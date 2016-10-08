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
 * Concrete Builder Y
 * creates real products and stores them in the composite structure
 */
public class ConcreteBuilderY extends Builder {
    
  @Override
  public void buildPartA() {
    super.product.makeA("A-Y");        
  }

  @Override
  public void buildPartB() {
    super.product.makeB("B-Y");
  }

  @Override
  public void buildPartC() {
    super.product.makeC("C-Y");
  }
  // ...    
}
