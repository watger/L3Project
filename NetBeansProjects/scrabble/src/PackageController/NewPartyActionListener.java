/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import PackageModel.Party;
import PackageView.GameOptionJPanel;
import PackageView.NameSelectionJPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pardojeremie
 */
public class NewPartyActionListener implements ActionListener {
    private GameOptionJPanel gameOptionJPanel; 
    private Party party;
    
    public NewPartyActionListener(GameOptionJPanel gameOptionJPanel,Party party) {
        super();
        this.gameOptionJPanel = gameOptionJPanel;
        this.party = party;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        party.NewParty();
        for (NameSelectionJPanel tabOfNameSelectionJPanel : gameOptionJPanel.getTabOfNameSelectionJPanel()) {
            party.AddPlayer(tabOfNameSelectionJPanel.getComboBoxItem(), tabOfNameSelectionJPanel.getTextFieldString());
        }
    }
}
