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

    public SHworld() {
        barriers = new ArrayList<>();
             createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
           createBarrierRange(-1, -1, -1, 22, new Color(153, 0, 76, 255), true);
            createBarrierRange(-1, -1, 39, -1, new Color(0, 0, 128, 255), true);
            createBarrierRange(-1, 22, 39, 22, new Color(0, 0, 128, 255), true);
        createBarrierRange(39, 0, 1000, 1000, new Color(153, 76, 0, 255), true);
    }

    public void createBarrierRange(int startX, int startY, int endX, int endY, Color color, boolean breakable) {
        for (int x = startX; x <= endX; x++) {
            for (int y = startY; y <= endY; y++) {
                barriers.add(new Barrier(x, y, 10, 10, color, breakable));
            }
        }
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
        if (barriers != null) {
            for (int i = 0; i < barriers.size(); i++) {
                barriers.get(i).draw(graphics);
            }
        }
    }



}
