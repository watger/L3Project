/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import PackageView.GameMainJPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import javax.swing.JPanel;



/**
 *
 * @author pardojeremie
 */
public class ChangeCardActionListener implements ActionListener {
    private final String cardStr;
    private JPanel cards;
    
    public ChangeCardActionListener(JPanel cards,String cardStr) {
        super();
        this.cardStr = cardStr;
        this.cards = cards;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ((CardLayout)cards.getLayout()).show(cards, cardStr);
        if(cardStr == "GameMainJPanel")
            for(int i = 0; i < cards.getComponentCount(); i++){
                if(cards.getComponent(i) instanceof GameMainJPanel){
                    ((GameMainJPanel)cards.getComponent(i)).NewTurn();
                    ((GameMainJPanel)cards.getComponent(i)).getDrawButton().setEnabled(true);
                }
            }
    }
    
}
