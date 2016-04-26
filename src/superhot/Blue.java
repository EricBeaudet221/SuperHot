/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import environment.Direction;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ericbeaudet
 */
public class Blue {
    
    public Blue(int x, int y, int speed, Direction direction){
        this.x = x;
        this.y = y;
        
        this.width = 50;
        this.height = 50;
        
        this.speed = speed;
        this.direction = direction;
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.drawOval(x, y, width, height);
        
        //fix this, please...
    }
    
    public void move(){
        switch (direction){
            case LEFT:
                x -= speed;
                break;

            case RIGHT:
                x += speed;
                break;
            
            case UP:
                y -= speed;
                break;
            
            case DOWN:
                y += speed;
                break;
        }
    }
    
//<editor-fold defaultstate="collapsed" desc="Properties">
    private int x;
    private int y;
    private int width, height;
    private int speed;
    private Direction direction;
    
    public int getX() {
        return x;
    }
    
    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
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
    
    /**
     * @return the direction
     */
    public Direction getDirection() {
        return direction;
    }
    
    /**
     * @param direction the direction to set
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
//</editor-fold>
    
}
