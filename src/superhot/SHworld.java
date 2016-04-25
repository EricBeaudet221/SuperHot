/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import environment.Direction;
import environment.Environment;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author ericbeaudet
 */
public class SHworld extends Environment{
    
    Blue blue;
    
    public SHworld() {
        
        Image sprite_1 = ResourceTools.loadImageFromResource("superhot/sprite_1.png");
        blue = new Blue(50, 50, 4, Direction.LEFT);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            blue.setDirection(Direction.UP);
            blue.move();
            System.out.println("moving");
        }
        
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
        if (blue != null) {
            blue.draw(graphics);
        }
    }
    
}
