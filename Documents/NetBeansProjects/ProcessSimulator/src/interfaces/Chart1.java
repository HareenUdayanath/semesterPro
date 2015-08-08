package interfaces;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Chart1 extends Canvas{     
    
   
    
    public Chart1(){       
        //this.setIgnoreRepaint(true); 		
    }
    
    public void drawScreen(int noOfP) {
        Graphics2D g = (Graphics2D) this.getGraphics();	
        BufferedImage image=null;
        try {
            image = ImageIO.read(new File("images/"+String.valueOf(noOfP)+".png"));            
        } catch (IOException ex) {
            System.out.println("dasdasd");
        }       
        g.drawImage(image, 0, 0,this);           
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }   
    
    public void drawQueue(String name) {
        Graphics2D g = (Graphics2D) this.getGraphics();	
        BufferedImage image=null;
        try {
            image = ImageIO.read(new File("images/"+name+".png"));            
        } catch (IOException ex) {
            System.out.println("dasdasd");
        }       
        g.drawImage(image, 0, 0,this);         
        //rect(51+45,19+27,Color.RED);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }   
    
    public void drawAt(int x,int y,String l) {
        Graphics2D g = (Graphics2D) this.getGraphics();
        BufferedImage image=null;
        try {
            image = ImageIO.read(new File("images/"+l+".png"));            
        } catch (IOException ex) {
            System.out.println("dasdasd");
        }       
        g.drawImage(image, x, y,this);          
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    public void pQueueToRQueue(String name){
        
        for(int i=0; i<380 ;i++){
            BufferedImage buffer = new BufferedImage(600,600,BufferedImage.TYPE_4BYTE_ABGR);
        
            Graphics2D g = (Graphics2D) this.getGraphics();	
            Graphics2D gg = (Graphics2D) buffer.getGraphics();
            //g.
            BufferedImage image=null;
          
            try {
                image = ImageIO.read(new File("images/"+name+".png"));            
            } catch (IOException ex) {
                System.out.println("dasdasd");
            }       

            gg.drawImage(image, 480-i, 55,this);
            g.drawImage(buffer, 0, 0,this);
            Toolkit.getDefaultToolkit().sync();
            gg.dispose();
            g.dispose();
        
        }
        for(int i=0; i<100 ;i++){
            BufferedImage buffer = new BufferedImage(600,600,BufferedImage.TYPE_4BYTE_ABGR);
        
            Graphics2D g = (Graphics2D) this.getGraphics();	
            Graphics2D gg = (Graphics2D) buffer.getGraphics();

            BufferedImage image=null;
            try {
                image = ImageIO.read(new File("images/"+name+".png"));            
            } catch (IOException ex) {
                System.out.println("dasdasd");
            }       

            gg.drawImage(image, 480-380, 55+i,this);
            g.drawImage(buffer, 0, 0,this);
            Toolkit.getDefaultToolkit().sync();
            gg.dispose();
            g.dispose();
        
        }
          for(int i=0; i<380 ;i++){
            BufferedImage buffer = new BufferedImage(600,600,BufferedImage.TYPE_4BYTE_ABGR);
        
            Graphics2D g = (Graphics2D) this.getGraphics();	
            Graphics2D gg = (Graphics2D) buffer.getGraphics();

            BufferedImage image=null;
            try {
                image = ImageIO.read(new File("images/"+name+".png"));            
            } catch (IOException ex) {
                System.out.println("dasdasd");
            }       

            gg.drawImage(image, 480-380+i, 55+100,this);
            g.drawImage(buffer, 0, 0,this);
            Toolkit.getDefaultToolkit().sync();
            gg.dispose();
            g.dispose();
        
        }
        
    }
    
}
