/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import environment.Direction;
import environment.Environment;
import grid.Grid;
import java.awt.Color;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
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
    Character blue;
    MyImageManager mim;
    Enemy enemy;

    public SHworld() {
        this.setBackground(Color.BLACK);

        mim = new MyImageManager();
        
        barriers = new ArrayList<>();
        levelManager = new LevelManager();
        
        blue = new Character(100, 100, 4, Direction.LEFT, mim);
        
//        enemy = new ArrayList<>();
        
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
        if (e.getKeyCode() == KeyEvent.VK_1) {
            setCurrentLevel(Level.LEVEL_1);
        } else if (e.getKeyCode() == KeyEvent.VK_2) {
            setCurrentLevel(Level.LEVEL_2);
        } else if (e.getKeyCode() == KeyEvent.VK_3) {
            setCurrentLevel(Level.LEVEL_3);
        } else if (e.getKeyCode() == KeyEvent.VK_4) {
            setCurrentLevel(Level.LEVEL_4);
        } else if (e.getKeyCode() == KeyEvent.VK_5) {
            setCurrentLevel(Level.LEVEL_5);
        } else if (e.getKeyCode() == KeyEvent.VK_6) {
            setCurrentLevel(Level.LEVEL_6);
        } else if (e.getKeyCode() == KeyEvent.VK_7) {
            setCurrentLevel(Level.LEVEL_7);
        } else if (e.getKeyCode() == KeyEvent.VK_8) {
            setCurrentLevel(Level.LEVEL_8);
        } else if (e.getKeyCode() == KeyEvent.VK_9) {
            setCurrentLevel(Level.LEVEL_9);
        } else if (e.getKeyCode() == KeyEvent.VK_0) {
            setCurrentLevel(Level.LEVEL_10);
        } else if (e.getKeyCode() == KeyEvent.VK_P) {
            setCurrentLevel(Level.LEVEL_11);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            updateYPosition(15);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            updateYPosition(-15);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            updateXPosition(15);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            updateXPosition(-15);
        }
        
//        if (e.getKeyCode() == KeyEvent.VK_W) {
//            blue.setDirection(Direction.UP);
//            blue.move();
//            System.out.println("moving");
//        }
    }

    private static final int MAX_X = 25;
    private static final int MIN_X = 50;

    private void updateXPosition(int deltaX) {
        if ((deltaX > 0) && (getBackgroundImagePosition().x + deltaX < MAX_X)) {
            this.getBackgroundImagePosition().x += deltaX;
            for (Barrier barrier : barriers) {
                barrier.addX(deltaX);
            }
        } else if ((deltaX > 0) && (getBackgroundImagePosition().x + deltaX < MIN_X)) {
            this.getBackgroundImagePosition().x += deltaX;
            for (Barrier barrier : barriers) {
                barrier.addX(deltaX);
            }
        }
    }

    private static final int MAX_Y = 25;
    private static final int MIN_Y = 60;

    private void updateYPosition(int deltaY) {
        if (getBackgroundImagePosition().y + deltaY < MAX_Y) {
            this.getBackgroundImagePosition().y += deltaY;
            for (Barrier barrier : barriers) {
                barrier.addY(deltaY);
            }
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
            for (Barrier barrier : barriers) {
                barrier.draw(graphics);
            }
        }

        if (blue != null) {
            blue.draw(graphics);
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
        //clear and reset barriers
        if (barriers != null) {
            barriers.clear();
            barriers.addAll(levelManager.getBarriers(currentLevel));
        }
//        levelManager.createBarrierRange(20, 20, 30, 90, Color.yellow, true, barriers);
        this.setBackground(levelManager.getBackground(currentLevel));
    }
}
