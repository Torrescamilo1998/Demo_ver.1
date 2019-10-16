/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Graphics;

/**
 *
 * @author Wilmer Sair Ramos
 */
public abstract class Clase {
    public abstract animacion caminarArriba();
    public abstract animacion caminardoAbajo();
    public abstract animacion caminarIzquierda();
    public abstract animacion caminarDerecha();
    public abstract Clase Clonar();
    public abstract void setGraphics(Graphics g);
    public abstract void setXY(int x, int y);
}
