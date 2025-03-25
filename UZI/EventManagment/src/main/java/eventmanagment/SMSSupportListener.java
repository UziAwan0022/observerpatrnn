/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagment;
import java.io.*;

/**
 *
 * @author uzair
 */
public class SMSSupportListener implements EventListener {
    private String phoneNo;

    public SMSSupportListener(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public void update(String eventType, File file) {
        if (file.getName().length() <= 100) {
            System.out.println("Character length is less than or equal to 100");
            return;
        } else {
            System.out.println("Your Message: " + file.getName() + " | Phone No: " + phoneNo);
        }
    }
}
