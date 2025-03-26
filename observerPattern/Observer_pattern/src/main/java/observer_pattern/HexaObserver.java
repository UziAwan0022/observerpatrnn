/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_pattern;

/**
 *
 * @author uzair
 */
public class HexaObserver extends Observer{

   public HexaObserver(Subject subject){
      this.subject = subject;
      
      if(this.subject != null)subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
   
   public void detach(){
       if(this.subject != null){
           subject.detach(this);
           System.out.println("Successfully Unsubscribe");
       }
       else{
           System.out.println("Subscribe First then Unsubscribe");
       }
   }
}

