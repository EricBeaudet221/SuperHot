/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Oliver
 */
public class Barrier {

//<editor-fold defaultstate="collapsed" desc="Drawing">
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fill3DRect(x, y, width, height, true);
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Constructors">
    public Barrier(int x, int y, int width, int height, Color color, boolean breakable) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.color = color;
        this.breakable = breakable;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Properties">
    private int x, y, width, height;
    private Color color;
    private boolean breakable = false;

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the x
     */
    public Point getLocation() {
        return new Point(x, y);
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param deltaX the amount to add to x
     */
    public void addX(int deltaX) {
        this.x += deltaX;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    public void addY(int deltaY) {
        this.y += deltaY;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
}

//</editor-fold>
