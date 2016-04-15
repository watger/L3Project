/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageController.Resize;
import PackageModel.Easel;
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
            jlabels[i] = new JLabel(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/0.png"),50,50));
            this.add(jlabels[i]);
        } 
    }   
    
    public void SetAllIconJLabel(Easel easel) {
        for(int i = 0; i < easel.getEasellenght();i++)
            if(easel.GetToken(i) == null)
                jlabels[i].setIcon(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/0.png"),50,50));
            else if(!easel.GetToken(i).isSelect())
                jlabels[i].setIcon(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/"+easel.GetToken(i).getCharacter()+".png"),50,50));
            else
                jlabels[i].setIcon(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/"+easel.GetToken(i).getCharacter()+"_.png"),50,50));
    }
    
    public void Reset() {
        for(int i = 0;i < jlabels.length; i++){
            jlabels[i].setIcon(Resize.ImageResize(new ImageIcon("build/classes/image Scrabble/0.png"),50,50));
        } 
    }
}