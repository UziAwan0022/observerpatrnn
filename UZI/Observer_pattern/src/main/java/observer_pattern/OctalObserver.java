/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_pattern;

/**
 *
 * @author uzair
 */
public class OctalObserver extends Observer{

   public OctalObserver(Subject subject){
      this.subject = subject;
      if(this.subject!= null)
       subject.attach(this);
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
   @Override
   public void update() {
     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
   }
   
}
