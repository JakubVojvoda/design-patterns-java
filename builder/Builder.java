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
 * Builder
 * abstract interface for creating products
 */
public abstract class Builder {
    
  protected Product product;
  
  Builder() {
    product = new Product();
  }
  
  public Product get() {
    return this.product;
  }
  
  abstract void buildPartA();
  abstract void buildPartB();
  abstract void buildPartC();   

  // ...
}
