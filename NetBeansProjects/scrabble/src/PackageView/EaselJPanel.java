/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageController.Resize;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class EaselJPanel extends JPanel{
    private JLabel jlabels[] = new JLabel[7];
    
    public EaselJPanel() {
        //JLabel Constructor
        super();
        this.setLayout(new GridLayout(1,7));
        this.setBackground(Color.BLACK);
        for(int i = 0;i < jlabels.length; i++){
            jlabels[i] = new JLabel(Resize.ImageResize(new ImageIcon("bin/image Scrabble/0.png"),50,50));
            this.add(jlabels[i]);
        } 
    }   
    
    public void SetIconJLabel(int index,ImageIcon icon) {
        try {
        jlabels[index].setIcon(icon);
        } catch (Exception e) {}
    }
    
    public void Reset() {
        for(int i = 0;i < jlabels.length; i++){
            jlabels[i].setIcon(Resize.ImageResize(new ImageIcon("bin/image Scrabble/0.png"),50,50));
        } 
    }
}