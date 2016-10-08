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
 * Director
 * responsible for managing the correct sequence of object creation
 */
public class Director {
  
  private Builder builder;
  
  public void set(Builder b) {
    this.builder = b;
  }
  
  public Product get() {
    return this.builder.get();
  }
  
  public void construct() {
    this.builder.buildPartA();
    this.builder.buildPartB();
    this.builder.buildPartC();
  }
  // ... 
}
