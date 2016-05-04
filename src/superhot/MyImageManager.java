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
        //adds the images for all of the enemy sprites
        
        this.addImage(ENEMY_1_UP, ResourceTools.loadImageFromResource("superhot/E1U.png"));
        this.addImage(ENEMY_1_DOWN, ResourceTools.loadImageFromResource("superhot/E1D.png"));
        this.addImage(ENEMY_1_LEFT, ResourceTools.loadImageFromResource("superhot/E1L.png"));
        this.addImage(ENEMY_1_RIGHT, ResourceTools.loadImageFromResource("superhot/E1R.png"));

        this.addImage(ENEMY_2_UP, ResourceTools.loadImageFromResource("superhot/E2U.png"));
        this.addImage(ENEMY_2_DOWN, ResourceTools.loadImageFromResource("superhot/E2D.png"));
        this.addImage(ENEMY_2_LEFT, ResourceTools.loadImageFromResource("superhot/E2L.png"));
        this.addImage(ENEMY_2_RIGHT, ResourceTools.loadImageFromResource("superhot/E2R.png"));

        this.addImage(ENEMY_3_UP, ResourceTools.loadImageFromResource("superhot/E3U.png"));
        this.addImage(ENEMY_3_DOWN, ResourceTools.loadImageFromResource("superhot/E3D.png"));
        this.addImage(ENEMY_3_LEFT, ResourceTools.loadImageFromResource("superhot/E3L.png"));
        this.addImage(ENEMY_3_RIGHT, ResourceTools.loadImageFromResource("superhot/E3R.png"));

        this.addImage(ENEMY_4_UP, ResourceTools.loadImageFromResource("superhot/E4U.png"));
        this.addImage(ENEMY_4_DOWN, ResourceTools.loadImageFromResource("superhot/E4D.png"));
        this.addImage(ENEMY_4_LEFT, ResourceTools.loadImageFromResource("superhot/E4L.png"));
        this.addImage(ENEMY_4_RIGHT, ResourceTools.loadImageFromResource("superhot/E4R.png"));

        this.addImage(ENEMY_5_UP, ResourceTools.loadImageFromResource("superhot/E5U.png"));
        this.addImage(ENEMY_5_DOWN, ResourceTools.loadImageFromResource("superhot/E5D.png"));
        this.addImage(ENEMY_5_LEFT, ResourceTools.loadImageFromResource("superhot/E5L.png"));
        this.addImage(ENEMY_5_RIGHT, ResourceTools.loadImageFromResource("superhot/E5R.png"));

        this.addImage(ENEMY_6_UP, ResourceTools.loadImageFromResource("superhot/E6U.png"));
        this.addImage(ENEMY_6_DOWN, ResourceTools.loadImageFromResource("superhot/E6D.png"));
        this.addImage(ENEMY_6_LEFT, ResourceTools.loadImageFromResource("superhot/E6L.png"));
        this.addImage(ENEMY_6_RIGHT, ResourceTools.loadImageFromResource("superhot/E6R.png"));

        this.addImage(ENEMY_7_UP, ResourceTools.loadImageFromResource("superhot/E7U.png"));
        this.addImage(ENEMY_7_DOWN, ResourceTools.loadImageFromResource("superhot/E7D.png"));
        this.addImage(ENEMY_7_LEFT, ResourceTools.loadImageFromResource("superhot/E7L.png"));
        this.addImage(ENEMY_7_RIGHT, ResourceTools.loadImageFromResource("superhot/E7R.png"));

        this.addImage(ENEMY_8_UP, ResourceTools.loadImageFromResource("superhot/E8U.png"));
        this.addImage(ENEMY_8_DOWN, ResourceTools.loadImageFromResource("superhot/E8D.png"));
        this.addImage(ENEMY_8_LEFT, ResourceTools.loadImageFromResource("superhot/E8L.png"));
        this.addImage(ENEMY_8_RIGHT, ResourceTools.loadImageFromResource("superhot/E8R.png"));

        this.addImage(ENEMY_9_UP, ResourceTools.loadImageFromResource("superhot/E9U.png"));
        this.addImage(ENEMY_9_DOWN, ResourceTools.loadImageFromResource("superhot/E9D.png"));
        this.addImage(ENEMY_9_LEFT, ResourceTools.loadImageFromResource("superhot/E9L.png"));
        this.addImage(ENEMY_9_RIGHT, ResourceTools.loadImageFromResource("superhot/E9R.png"));

        this.addImage(ENEMY_10_UP, ResourceTools.loadImageFromResource("superhot/E10U.png"));
        this.addImage(ENEMY_10_DOWN, ResourceTools.loadImageFromResource("superhot/E10D.png"));
        this.addImage(ENEMY_10_LEFT, ResourceTools.loadImageFromResource("superhot/E10L.png"));
        this.addImage(ENEMY_10_RIGHT, ResourceTools.loadImageFromResource("superhot/E10R.png"));

        this.addImage(ENEMY_11_UP, ResourceTools.loadImageFromResource("superhot/E11U.png"));
        this.addImage(ENEMY_11_DOWN, ResourceTools.loadImageFromResource("superhot/E11D.png"));
        this.addImage(ENEMY_11_LEFT, ResourceTools.loadImageFromResource("superhot/E11L.png"));
        this.addImage(ENEMY_11_RIGHT, ResourceTools.loadImageFromResource("superhot/E11R.png"));
    }

    //all of the static stings for the enemys
    
    public static final String ENEMY_1_UP = "ENEMY_1_UP";
    public static final String ENEMY_1_RIGHT = "ENEMY_1_RIGHT";
    public static final String ENEMY_1_DOWN = "ENEMY_1_DOWN";
    public static final String ENEMY_1_LEFT = "ENEMY_1_LEFT";

    public static final String ENEMY_2_UP = "ENEMY_2_UP";
    public static final String ENEMY_2_RIGHT = "ENEMY_2_RIGHT";
    public static final String ENEMY_2_DOWN = "ENEMY_2_DOWN";
    public static final String ENEMY_2_LEFT = "ENEMY_2_LEFT";

    public static final String ENEMY_3_UP = "ENEMY_3_UP";
    public static final String ENEMY_3_RIGHT = "ENEMY_3_RIGHT";
    public static final String ENEMY_3_DOWN = "ENEMY_3_DOWN";
    public static final String ENEMY_3_LEFT = "ENEMY_3_LEFT";

    public static final String ENEMY_4_UP = "ENEMY_4_UP";
    public static final String ENEMY_4_RIGHT = "ENEMY_4_RIGHT";
    public static final String ENEMY_4_DOWN = "ENEMY_4_DOWN";
    public static final String ENEMY_4_LEFT = "ENEMY_4_LEFT";

    public static final String ENEMY_5_UP = "ENEMY_5_UP";
    public static final String ENEMY_5_RIGHT = "ENEMY_5_RIGHT";
    public static final String ENEMY_5_DOWN = "ENEMY_5_DOWN";
    public static final String ENEMY_5_LEFT = "ENEMY_5_LEFT";

    public static final String ENEMY_6_UP = "ENEMY_6_UP";
    public static final String ENEMY_6_RIGHT = "ENEMY_6_RIGHT";
    public static final String ENEMY_6_DOWN = "ENEMY_6_DOWN";
    public static final String ENEMY_6_LEFT = "ENEMY_6_LEFT";

    public static final String ENEMY_7_UP = "ENEMY_7_UP";
    public static final String ENEMY_7_RIGHT = "ENEMY_7_RIGHT";
    public static final String ENEMY_7_DOWN = "ENEMY_7_DOWN";
    public static final String ENEMY_7_LEFT = "ENEMY_7_LEFT";

    public static final String ENEMY_8_UP = "ENEMY_8_UP";
    public static final String ENEMY_8_RIGHT = "ENEMY_8_RIGHT";
    public static final String ENEMY_8_DOWN = "ENEMY_8_DOWN";
    public static final String ENEMY_8_LEFT = "ENEMY_8_LEFT";

    public static final String ENEMY_9_UP = "ENEMY_9_UP";
    public static final String ENEMY_9_RIGHT = "ENEMY_9_RIGHT";
    public static final String ENEMY_9_DOWN = "ENEMY_9_DOWN";
    public static final String ENEMY_9_LEFT = "ENEMY_9_LEFT";

    public static final String ENEMY_10_RIGHT = "ENEMY_10_RIGHT";
    public static final String ENEMY_10_DOWN = "ENEMY_10_DOWN";
    public static final String ENEMY_10_LEFT = "ENEMY_10_LEFT";
    public static final String ENEMY_10_UP = "ENEMY_10_UP";

    public static final String ENEMY_11_UP = "ENEMY_11_UP";
    public static final String ENEMY_11_RIGHT = "ENEMY_11_RIGHT";
    public static final String ENEMY_11_DOWN = "ENEMY_11_DOWN";
    public static final String ENEMY_11_LEFT = "ENEMY_11_LEFT";
}
