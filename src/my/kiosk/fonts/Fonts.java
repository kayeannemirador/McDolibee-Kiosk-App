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
    
  
    private static Font FakeReceipt;
    private static Font Mcdo;
    private static Font Inter;
    private static Font Helvetica;
    private static Font Mcdonalds;
    
    public static Font getMcdoFont(float fontSize) {
        try{
            
            Mcdo = Font.createFont(Font.TRUETYPE_FONT, new File("insaniburger.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("insaniburger.ttf")));
        }
         catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return Mcdo;
    }
    public static Font getInter(float fontSize) {
        try{
            
            Inter = Font.createFont(Font.TRUETYPE_FONT, new File("inter.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("inter.ttf")));
        }
         catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return Inter;
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
      public static Font getHelveticaFont(float fontSize) {
        try{
            
            Helvetica = Font.createFont(Font.TRUETYPE_FONT, new File("helvetica.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("helvetica.ttf")));
        }
         catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return Helvetica;
      }
      
       public static Font getMcFont(float fontSize) {
        try{
            
            Mcdonalds = Font.createFont(Font.TRUETYPE_FONT, new File("mcdo.ttf")).deriveFont(fontSize);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("mcdo.ttf")));
        }
         catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return Mcdonalds;
      }
}

