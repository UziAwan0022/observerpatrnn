/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagment;

/**
 *
 * @author uzair
 */
import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
