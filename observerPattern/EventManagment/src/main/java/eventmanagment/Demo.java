/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagment;

/**
 *
 * @author uzair
 */


public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        
        
        LogOpenListener LogOL = new LogOpenListener("/path/to/log/file.txt");
        editor.events.subscribe("open",LogOL); 
        
        
        EmailNotificationListener eNL = new EmailNotificationListener("admin@example.com");
        editor.events.subscribe("save",eNL);
        
        SMSSupportListener SSL = new SMSSupportListener("03170200034");
        editor.events.subscribe("sEndSMS",SSL);
        
        try {
            editor.openFile("test.txt");
            editor.saveFile();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
