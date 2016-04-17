/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import PackageView.GameMainJPanel;
import PackageView.MainJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;



/**
 *
 * @author pardojeremie
 */
public class ChangeCardActionListener implements ActionListener {
    private final String cardStr;
    private MainJFrame mainJFrame;
    
    public ChangeCardActionListener(MainJFrame mainJFrame,String cardStr) {
        super();
        this.cardStr = cardStr;
        this.mainJFrame = mainJFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ((CardLayout)mainJFrame.getCardsLayoutPanel().getLayout()).show(mainJFrame.getCardsLayoutPanel(), cardStr);
        if(cardStr.equals("GameMainJPanel")) {
            mainJFrame.setSize(740,730);
            for(int i = 0; i < mainJFrame.getCardsLayoutPanel().getComponentCount(); i++){
                if(mainJFrame.getCardsLayoutPanel().getComponent(i) instanceof GameMainJPanel){
                    ((GameMainJPanel)mainJFrame.getCardsLayoutPanel().getComponent(i)).NewTurn();
                    ((GameMainJPanel)mainJFrame.getCardsLayoutPanel().getComponent(i)).getDrawButton().setEnabled(true);
                }
            }
        }
        else
            mainJFrame.setSize(200,250);
    }
    
}
