/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import environment.Direction;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author ericbeaudet
 */
public class Blue {
    
    public Blue(){
        this.direction = direction;
        
        body = new ArrayList<>();
        body.add(new Point(10, 0));
    }
    private Direction direction;
    private ArrayList<Point> body = new ArrayList<>();
    private Color bodyColor = Color.GREEN;
    
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    public Direction getDirection() {
        return direction;
    }
}
