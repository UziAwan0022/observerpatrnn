/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_pattern;

/**
 *
 * @author uzair
 */
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

     HexaObserver hexa = new HexaObserver(subject);
     OctalObserver oct = new OctalObserver(subject);
     BinaryObserver bin = new BinaryObserver(subject);

     
     OctalObserver oct1 = new OctalObserver(null);
     HexaObserver hexa1 = new HexaObserver(subject);
     
      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
      
       oct1.detach();
       hexa1.detach();
   }
}
