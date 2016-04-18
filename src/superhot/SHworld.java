/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import environment.Environment;
import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
/**
 *
 * @author ericbeaudet
 */
public class SHworld extends Environment {

    Grid grid;
    private ArrayList<Barrier> barriers;
    LevelManager levelManager;
    private Level currentLevel;

    public SHworld() {
       levelManager = new LevelManager();
    }

    public void createBarrierRange(int startX, int startY, int endX, int endY, Color color, boolean breakable) {
        for (int x = startX; x <= endX; x++) {
            for (int y = startY; y <= endY; y++) {
            }
        }
    }

    
    @Override
    public void initializeEnvironment() {    
    }

    
    @Override
    public void timerTaskHandler() {         
//        this.setBackground(this.levelManager.getBackground(Level.LEVEL_1));
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode()== KeyEvent.VK_1) {
            setCurrentLevel(Level.LEVEL_1);
        }else if (e.getKeyCode()== KeyEvent.VK_2) {
            setCurrentLevel(Level.LEVEL_2);
        }else if (e.getKeyCode()== KeyEvent.VK_3) {
            setCurrentLevel(Level.LEVEL_3);
        }else if (e.getKeyCode()== KeyEvent.VK_4) {
            setCurrentLevel(Level.LEVEL_4);
        }else if (e.getKeyCode()== KeyEvent.VK_5) {
            setCurrentLevel(Level.LEVEL_5);
        }else if (e.getKeyCode()== KeyEvent.VK_6) {
            setCurrentLevel(Level.LEVEL_6);
        }else if (e.getKeyCode()== KeyEvent.VK_7) {
            setCurrentLevel(Level.LEVEL_7);
        }else if (e.getKeyCode()== KeyEvent.VK_8) {
            setCurrentLevel(Level.LEVEL_8);
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
        if (barriers != null) {
            for (int i = 0; i < barriers.size(); i++) {
                barriers.get(i).draw(graphics);
                
            }
        }
        
    }

    /**
     * @return the currentLevel
     */
    public Level getCurrentLevel() {
        return currentLevel;
    }

    /**
     * @param currentLevel the currentLevel to set
     */
    public void setCurrentLevel(Level currentLevel) {
        this.currentLevel = currentLevel;
        
        //layout game
        
        //change background
        this.setBackground(levelManager.getBackground(currentLevel));
        
        //clear and reset barriers
//        barriers.clear();
        levelManager.getBarriers(currentLevel);
    }
}
