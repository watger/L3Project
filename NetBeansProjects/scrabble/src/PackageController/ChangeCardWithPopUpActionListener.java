/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class ChangeCardWithPopUpActionListener implements ActionListener {
    private final String cardStr,message;
    private JPanel cards;
    
    public ChangeCardWithPopUpActionListener(JPanel cards,String cardStr,String message) {
        super();
        this.cardStr = cardStr;
        this.message = message;
        this.cards = cards;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(JOptionPane.YES_OPTION == new JOptionPane().showConfirmDialog(null, message, "EXIT", JOptionPane.YES_NO_OPTION))
            ((CardLayout)cards.getLayout()).show(cards, cardStr);
    }
}
