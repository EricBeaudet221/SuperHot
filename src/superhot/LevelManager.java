/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import images.ImageManager;
import images.ResourceTools;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Oliver
 */
public class LevelManager extends ImageManager {

    public LevelManager() {
        LEVEL_1_IMAGE_NAMES = new ArrayList<>();
        LEVEL_1_IMAGE_NAMES.add(LEVEL_1);
        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
        LEVEL_2_IMAGE_NAMES = new ArrayList<>();
        LEVEL_2_IMAGE_NAMES.add(LEVEL_2);
        LEVEL_3_IMAGE_NAMES = new ArrayList<>();
        LEVEL_3_IMAGE_NAMES.add(LEVEL_3);
        LEVEL_4_IMAGE_NAMES = new ArrayList<>();
        LEVEL_4_IMAGE_NAMES.add(LEVEL_4);
        LEVEL_5_IMAGE_NAMES = new ArrayList<>();
        LEVEL_5_IMAGE_NAMES.add(LEVEL_5);
        LEVEL_6_IMAGE_NAMES = new ArrayList<>();
        LEVEL_6_IMAGE_NAMES.add(LEVEL_6);
        LEVEL_7_IMAGE_NAMES = new ArrayList<>();
        LEVEL_7_IMAGE_NAMES.add(LEVEL_7);
        LEVEL_8_IMAGE_NAMES = new ArrayList<>();
        LEVEL_8_IMAGE_NAMES.add(LEVEL_8);
        LEVEL_9_IMAGE_NAMES = new ArrayList<>();
        LEVEL_9_IMAGE_NAMES.add(LEVEL_9);
        LEVEL_10_IMAGE_NAMES = new ArrayList<>();
        LEVEL_10_IMAGE_NAMES.add(LEVEL_10);
        LEVEL_11_IMAGE_NAMES = new ArrayList<>();
        LEVEL_11_IMAGE_NAMES.add(LEVEL_11);

        this.addImage(LEVEL_1, ResourceTools.loadImageFromResource("superhot/level_1.png"));
        this.addImage(LEVEL_2, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(LEVEL_3, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(LEVEL_4, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(LEVEL_5, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(LEVEL_6, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(LEVEL_7, ResourceTools.loadImageFromResource("superhot/level_2"));
        this.addImage(LEVEL_8, ResourceTools.loadImageFromResource("superhot/level_3"));
        this.addImage(LEVEL_9, ResourceTools.loadImageFromResource("superhot/level_4"));
        this.addImage(LEVEL_10, ResourceTools.loadImageFromResource("superhot/boss_level.png"));
        this.addImage(LEVEL_11, ResourceTools.loadImageFromResource("superhot/endless_level.png"));
    }

    public static final String LEVEL_1 = "LEVEL_1";
    public static final String LEVEL_2 = "LEVEL_2";
    public static final String LEVEL_3 = "LEVEL_3";
    public static final String LEVEL_4 = "LEVEL_4";
    public static final String LEVEL_5 = "LEVEL_5";
    public static final String LEVEL_6 = "LEVEL_6";
    public static final String LEVEL_7 = "LEVEL_7";
    public static final String LEVEL_8 = "LEVEL_8";
    public static final String LEVEL_9 = "LEVEL_9";
    public static final String LEVEL_10 = "LEVEL_10";
    public static final String LEVEL_11 = "LEVEL_11";

    public static ArrayList<String> LEVEL_1_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_2_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_3_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_4_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_5_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_6_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_7_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_8_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_9_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_10_IMAGE_NAMES;
    public static ArrayList<String> LEVEL_11_IMAGE_NAMES;

    private ArrayList<Barrier> barriers;

    public void createBarrierRange(int startX, int startY, int endX, int endY, Color color, boolean breakable) {
        for (int x = startX; x <= endX; x++) {
            for (int y = startY; y <= endY; y++) {
                barriers.add(new Barrier(x, y, 10, 10, color, breakable));
            }
        }
    }
}
