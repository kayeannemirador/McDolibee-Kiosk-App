/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.kiosk.fonts;

/**
 *
 * @author Kaye Anne
 */
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
public class Fonts {
    
    private static Font Mcdo;
    private static Font FakeReceipt;
    
    public static Font getFont(float fontSize) {
        try{
            
            Mcdo = Font.createFont(Font.TRUETYPE_FONT, new File("McDonalds-Regular.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("McDonalds-Regular.ttf")));
        }
         catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return Mcdo;
    }
     public static Font getReceiptFont(float fontSize) {
        try{
            
            FakeReceipt = Font.createFont(Font.TRUETYPE_FONT, new File("fake-receipt.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fake-receipt.ttf")));
        }
         catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return FakeReceipt;
    }
}

