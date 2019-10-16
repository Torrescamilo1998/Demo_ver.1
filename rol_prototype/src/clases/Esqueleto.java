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
public class Esqueleto extends Clase {
    Graphics g;
    Image img;
    String s;
    int x=0,y=0;
    public Esqueleto(Graphics g) {
        s="Esqueleto.png";
        ImageIcon icon = new ImageIcon(s);
        img = icon.getImage();
        this.g=g;
    }
    
    @Override
    public animacion caminarArriba(){
        animacion an=new animacion(g,s,0,x,y);
        return an;
    }
    @Override
    public animacion caminardoAbajo(){
        animacion an=new animacion(g,s,2,x,y);
        return an;
    }
    @Override
    public animacion caminarIzquierda(){
        animacion an=new animacion(g,s,1,x,y);
        return an;
    }
    public animacion caminarDerecha(){
        animacion an=new animacion(g,s,3,x,y);
        return an;
    }

    @Override
    public Clase Clonar() {
        Clase cs=null;
        
            cs = (Esqueleto)this;
        
        return cs;
    }
    
    @Override
    public void setGraphics(Graphics g){
        this.g=g;
    }

    @Override
    public void setXY(int x, int y) {
        this.x=x;
        this.y=y;//To change body of generated methods, choose Tools | Templates.
    }
    
}
