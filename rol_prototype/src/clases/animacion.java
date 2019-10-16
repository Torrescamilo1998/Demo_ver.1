/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author Wilmer Sair Ramos
 */
public class animacion extends Thread{

    int mx = 0;
    int my;
    Graphics2D g2d;
    Image img;
    int x;
    int y;
    boolean estado=true;
    
    public animacion(Graphics g, String s,int my,int x,int y) {
        ImageIcon icon = new ImageIcon(s);
        img = icon.getImage();
        g2d = (Graphics2D) g;
        this.my=my;
        this.x=x;
        this.y=y;
      
         

    }

    
    @Override
    public void run() {
        while(estado){
            if (mx != 8) {
                mx++;
            }else{mx=0;}
         g2d.drawImage(img, x, y,x+64,y+64,mx*64,my*64,(mx*64)+64,(my*64)+64,null);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(animacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            g2d.clearRect(x, y,64,64);
        }
   
        //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    
   public void suspender(){
       estado=false;
}

}
