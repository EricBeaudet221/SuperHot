/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import environment.Direction;
import java.awt.Graphics;

/**
 *
 * @author ericbeaudet
 */
public class Enemy extends Character{

    public Enemy(int x, int y, int speed, Direction direction, MyImageManager imageManager, int enemyNumber) {
        super(x, y, speed, direction, imageManager);
        
        leftImageName = String.format("ENEMY_%s_LEFT", enemyNumber);
        rightImageName = String.format("ENEMY_%s_RIGHT", enemyNumber);
        downImageName = String.format("ENEMY_%s_DOWN", enemyNumber);
        upImageName = String.format("ENEMY_%s_UP", enemyNumber);
        
    }
    
    private String leftImageName, rightImageName, upImageName, downImageName; 
    
    @Override
    public void draw(Graphics graphics){
        switch (getDirection()){
            case LEFT:
                graphics.drawImage(getImageManager().getImage(leftImageName), getX(), getY(), getWidth(), getHeight(), null);
                break;

            case RIGHT:
                graphics.drawImage(getImageManager().getImage(leftImageName), getX(), getY(), getWidth(), getHeight(), null);
                break;
            
            case UP:
                graphics.drawImage(getImageManager().getImage(leftImageName), getX(), getY(), getWidth(), getHeight(), null);
                break;
            
            case DOWN:
                graphics.drawImage(getImageManager().getImage(leftImageName), getX(), getY(), getWidth(), getHeight(), null);
                break;
        }
    }
    
}
