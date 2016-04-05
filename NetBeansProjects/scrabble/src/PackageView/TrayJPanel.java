/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageController.Resize;
import PackageModel.Tray;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class TrayJPanel extends JPanel {
    private JLabel jlabels[][] = new JLabel[15][15];
    private Tray tray;
    
    public TrayJPanel(Tray tray) {
        super();
        this.tray = tray;

        this.setLayout(new GridLayout(15,15));
        this.setBackground(Color.BLACK);
        for(int i = 0;i < jlabels.length; i++)
            for(int j = 0;j < jlabels[i].length; j++) {
                jlabels[i][j] = new JLabel(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/"+tray.GetFramesValues(i, j)+".png"),40,40));
                this.add(jlabels[i][j]);
            }
    }   
    
    public void UpdateIconJLabel(int indexX,int indexY) {
        try {
            if(tray.GetFramesToken(indexX, indexY) == null)
                jlabels[indexX][indexY].setIcon(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/"+tray.GetFramesValues(indexX, indexY)+".png"),40,40));
            else 
                jlabels[indexX][indexY].setIcon(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/"+tray.GetFramesToken(indexX, indexY).getCharacter()+".png"),40,40));
        } catch (Exception e) {}
    }
}
