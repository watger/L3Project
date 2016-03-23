/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author pardojeremie
 */
public class Resize {
    public static ImageIcon ImageResize(ImageIcon imageIcon,int width,int height) {
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        return new ImageIcon(newimg);
    }
}
