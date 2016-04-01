/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhot;

import environment.ApplicationStarter;

/**
 *
 * @author ericbeaudet
 */
public class SuperHot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("Super Hot", new SHworld());
    }
    
}
