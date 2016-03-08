/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageController.Resize;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class TrayJPanel extends JPanel {
    private JLabel jlabels[][] = new JLabel[15][15];
    
    public TrayJPanel() {
        super();

        this.setLayout(new GridLayout(15,15));
        this.setBackground(Color.LIGHT_GRAY);
        ImageIcon icon = Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/a.png"),50,50);
        for(int i = 0;i < jlabels.length; i++)
            for(int j = 0;j < jlabels[i].length; j++) {
                jlabels[i][j] = new JLabel(icon);
                this.add(jlabels[i][j]);
        } 
        
        jlabels[8][7].setIcon( Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/i.png"),50,50));
        jlabels[14][2].setIcon( Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/w.png"),50,50));
    }   
    
    public void setIconJLabel(int indexX,int indexY,ImageIcon icon) {
        try {
        jlabels[indexX][indexY].setIcon(icon);
        } catch (Exception e) {}
    }
}
