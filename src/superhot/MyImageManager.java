/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import images.ImageManager;
import images.ResourceTools;

/**
 *
 * @author ericbeaudet
 */
public class MyImageManager extends ImageManager {
    
    {
        this.addImage(ENEMY_10_UP, ResourceTools.loadImageFromResource("superhot/E10U.png"));
        this.addImage(ENEMY_10_DOWN, ResourceTools.loadImageFromResource("superhot/E10D.png"));
        this.addImage(ENEMY_10_LEFT, ResourceTools.loadImageFromResource("superhot/E10L.png"));
        this.addImage(ENEMY_10_RIGHT, ResourceTools.loadImageFromResource("superhot/E10R.png"));
    }
    
    public static final String ENEMY_10_RIGHT = "ENEMY_10_RIGHT";
    public static final String ENEMY_10_DOWN = "ENEMY_10_DOWN";
    public static final String ENEMY_10_LEFT = "ENEMY_10_LEFT";
    public static final String ENEMY_10_UP = "ENEMY_10_UP";
    
}
