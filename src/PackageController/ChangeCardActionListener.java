/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import javax.swing.JPanel;



/**
 *
 * @author pardojeremie
 */
public class ChangeCardActionListener implements ActionListener {
    private final String str;
    private JPanel cards;
    
    public ChangeCardActionListener(JPanel cards,String str) {
        super();
        this.str = str;
        this.cards = cards;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ((CardLayout)cards.getLayout()).show(cards, str);
    }
    
}
