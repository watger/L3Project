/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import PackageModel.Party;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pardojeremie
 */
public class DrawButtonActionListener implements ActionListener {
    private Party party;

    public DrawButtonActionListener(Party party) {
    super();
    this.party = party;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!party.getPlayerActual().getPlay()) {
            if (party.getPlayerActual().getDraw()) {
                party.getPlayerActual().getEasel().ChangeToken(party.getSackcloth());
                party.getMainJFrame().getGameMainJPanel().getDrawButton().setEnabled(false);
            }
            party.getPlayerActual().setDraw(true);
            party.getMainJFrame().getGameMainJPanel().getEaselJPanel().SetAllIconJLabel(party.getPlayerActual().getEasel());
        }
    } 
}