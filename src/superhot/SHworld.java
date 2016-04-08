/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import environment.Environment;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author ericbeaudet
 */
public class SHworld extends Environment{
    
    
    public SHworld() {
        this.setBackground(ResourceTools.loadImageFromResource("SuperHot/level_1.png"));
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
    }
    
}
