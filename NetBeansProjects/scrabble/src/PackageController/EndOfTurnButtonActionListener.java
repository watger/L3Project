package PackageController;

import PackageModel.Party;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pardojeremie
 */
public class EndOfTurnButtonActionListener  implements ActionListener {
    private final Party party;

    public EndOfTurnButtonActionListener(Party party) {
    super();
    this.party = party;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        party.getMainJFrame().getGameMainJPanel().getDrawButton().setEnabled(true);
        party.getMainJFrame().getGameMainJPanel().getEaselJPanel().Reset();
        party.getMainJFrame().getGameMainJPanel().getTrayJPanel().UpdateIconJLabel();
        if(JOptionPane.YES_OPTION == new JOptionPane().showConfirmDialog(null, "Tour de "+party.getNextPlayerName(), "EXIT", JOptionPane.DEFAULT_OPTION))
            party.NextPlayer();
    } 
}
