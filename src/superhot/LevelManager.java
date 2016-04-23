/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import images.ImageManager;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Oliver
 */
public class LevelManager extends ImageManager {

//<editor-fold defaultstate="collapsed" desc="constructors">
    public LevelManager() {
//<editor-fold defaultstate="collapsed" desc="old stuff">
//        LEVEL_1_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_1_IMAGE_NAMES.add(LEVEL_1);
//
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_2_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_2_IMAGE_NAMES.add(LEVEL_2);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_3_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_3_IMAGE_NAMES.add(LEVEL_3);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_4_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_4_IMAGE_NAMES.add(LEVEL_4);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_5_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_5_IMAGE_NAMES.add(LEVEL_5);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_6_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_6_IMAGE_NAMES.add(LEVEL_6);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_7_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_7_IMAGE_NAMES.add(LEVEL_7);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_8_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_8_IMAGE_NAMES.add(LEVEL_8);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_9_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_9_IMAGE_NAMES.add(LEVEL_9);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_10_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_10_IMAGE_NAMES.add(LEVEL_10);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//        LEVEL_11_IMAGE_NAMES = new ArrayList<>();
//        LEVEL_11_IMAGE_NAMES.add(LEVEL_11);
//        createBarrierRange(0, 13, 38, 1000, new Color(154, 205, 50), true);
//</editor-fold>
        this.addImage(IMG_LEVEL_1, ResourceTools.loadImageFromResource("superhot/level_1.png"));
        this.addImage(IMG_LEVEL_2, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(IMG_LEVEL_3, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(IMG_LEVEL_4, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(IMG_LEVEL_5, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(IMG_LEVEL_6, ResourceTools.loadImageFromResource("superhot/tutorial_level_1.png"));
        this.addImage(IMG_LEVEL_7, ResourceTools.loadImageFromResource("superhot/level_2.png"));
        this.addImage(IMG_LEVEL_8, ResourceTools.loadImageFromResource("superhot/level_3.png"));
        this.addImage(IMG_LEVEL_9, ResourceTools.loadImageFromResource("superhot/level_4.png"));
        this.addImage(IMG_LEVEL_10, ResourceTools.loadImageFromResource("superhot/boss_level.png"));
        this.addImage(IMG_LEVEL_11, ResourceTools.loadImageFromResource("superhot/endless_level.png"));
    }
//</editor-fold>

    public ArrayList<Barrier> getBarriers(Level level) {
        ArrayList<Barrier> barriers = new ArrayList<>();
        switch (level) {
            default:
            case LEVEL_1:
                barriers = createBarrierRange(38, 55, 123, 100, new Color(154, 205, 50), true, barriers);
                return barriers;
                
            case LEVEL_2:
                barriers = createBarrierRange(14, 200, 223, 3, new Color(154, 205, 50), true, barriers);
                return barriers;
                
            case LEVEL_3:
                barriers = createBarrierRange(14, 200, 784, 3, new Color(154, 205, 50), true, barriers);
                return barriers;
                
             case LEVEL_4:
                barriers = createBarrierRange(14, 200, 300, 3, new Color(154, 205, 50), true, barriers);
                return barriers;               
                
            case LEVEL_5:
                barriers = createBarrierRange(14, 200, 38, 3, new Color(154, 205, 50), true, barriers);
                return barriers;                
                
            case LEVEL_6:
                barriers = createBarrierRange(14, 200, 38, 123, new Color(154, 205, 50), true, barriers);
                return barriers;  
                
            case LEVEL_7:
                barriers = createBarrierRange(14, 200, 38, 3, new Color(154, 205, 50), true, barriers);
                return barriers;                
                
            case LEVEL_8:
                barriers = createBarrierRange(2000, 200, 9, 3, new Color(154, 205, 50), true, barriers);
                return barriers;                
                
            case LEVEL_9:
                barriers = createBarrierRange(150, 200, 12, 3, new Color(154, 205, 50), true, barriers);
                return barriers;

            case LEVEL_10:
                barriers = createBarrierRange(14, 200, 200, 3, new Color(154, 205, 50), true, barriers);
                return barriers; 
                
            case LEVEL_11:
                barriers = createBarrierRange(200, 200, 38, 456, new Color(154, 205, 50), true, barriers);
                return barriers;
        }
    }

    public Image getBackground(Level level) {
        switch (level) {
            default:
            case LEVEL_1:
                return this.getImage(IMG_LEVEL_1);

            case LEVEL_2:
                return this.getImage(IMG_LEVEL_2);

            case LEVEL_3:
                return this.getImage(IMG_LEVEL_3);

            case LEVEL_4:
                return this.getImage(IMG_LEVEL_4);

            case LEVEL_5:
                return this.getImage(IMG_LEVEL_5);

            case LEVEL_6:
                return this.getImage(IMG_LEVEL_6);

            case LEVEL_7:
                return this.getImage(IMG_LEVEL_7);

            case LEVEL_8:
                return this.getImage(IMG_LEVEL_8);

            case LEVEL_9:
                return this.getImage(IMG_LEVEL_9);

            case LEVEL_10:
                return this.getImage(IMG_LEVEL_10);

            case LEVEL_11:
                return this.getImage(IMG_LEVEL_11);

        }
    }

//<editor-fold defaultstate="collapsed" desc="image names">
    public static final String IMG_LEVEL_1 = "IMG_LEVEL_1";
    public static final String IMG_LEVEL_2 = "IMG_LEVEL_2";
    public static final String IMG_LEVEL_3 = "IMG_LEVEL_3";
    public static final String IMG_LEVEL_4 = "IMG_LEVEL_4";
    public static final String IMG_LEVEL_5 = "IMG_LEVEL_5";
    public static final String IMG_LEVEL_6 = "IMG_LEVEL_6";
    public static final String IMG_LEVEL_7 = "IMG_LEVEL_7";
    public static final String IMG_LEVEL_8 = "IMG_LEVEL_8";
    public static final String IMG_LEVEL_9 = "IMG_LEVEL_9";
    public static final String IMG_LEVEL_10 = "IMG_LEVEL_10";
    public static final String IMG_LEVEL_11 = "IMG_LEVEL_11";
    
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
//</editor-fold>

//    private ArrayList<Barrier> barriers;

    public ArrayList<Barrier> createBarrierRange(int startX, int startY, int endX, int endY, Color color, boolean breakable, ArrayList<Barrier> barriers) {
        for (int x = startX; x <= endX; x++) {
            for (int y = startY; y <= endY; y++) {
                barriers.add(new Barrier(x, y, x, y, color, breakable));
            }
        }
        return barriers;
    }
}
