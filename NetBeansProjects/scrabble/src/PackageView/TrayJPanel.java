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
    
    public void UpdateIconJLabel() {
        ImageIcon n =  Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/a.png"),40,40);
        for(int i = 0; i < tray.GetTrayHeight();i++)
            for(int j = 0; j < tray.GetTrayWidth(); j++)
                if(tray.GetFramesToken(i, j) == null)
                    jlabels[i][j].setIcon(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/"+tray.GetFramesValues(i, j)+".png"),40,40));
                else if(tray.GetFramesToken(i, j).isSelect())
                    jlabels[i][j].setIcon(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/"+tray.GetFramesToken(i, j).getCharacter()+"_.png"),40,40));
                else
                    jlabels[i][j].setIcon(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/"+tray.GetFramesToken(i, j).getCharacter()+".png"),40,40));
    }
}
