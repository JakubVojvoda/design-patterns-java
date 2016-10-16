/*
 * Java Design Patterns: Facade
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Facade
 * delegates client requests to appropriate subsystem object
 * and unified interface that is easier to use
 */
public class Facade {
    
  private final SubSystemA subsystemA;
  private final SubSystemB subsystemB;
  private final SubSystemC subsystemC;
  // ...
  
  Facade() {
    this.subsystemA = new SubSystemA();
    this.subsystemB = new SubSystemB();
    this.subsystemC = new SubSystemC();
  }
  
  void operation1() {
    this.subsystemA.suboperation();
    this.subsystemB.suboperation();
  }
  
  void operation2() {
    this.subsystemC.suboperation();
  }
  // ...
}
