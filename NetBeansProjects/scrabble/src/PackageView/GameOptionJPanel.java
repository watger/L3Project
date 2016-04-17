/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageController.ChangeCardActionListener;
import PackageController.NewPartyActionListener;
import PackageModel.Party;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class GameOptionJPanel extends JPanel{
    private JPanel jpanelBoutton, cards;
    private JButton menuButton, gameStartButton;
    private NameSelectionJPanel tabOfNameSelectionJPanel[] = new NameSelectionJPanel [4];
    
    public GameOptionJPanel(Party party) {
        super();
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        for(int i = 0 ;i < tabOfNameSelectionJPanel.length; i++)
        {
        tabOfNameSelectionJPanel[i] = new NameSelectionJPanel();
        this.add(tabOfNameSelectionJPanel[i]);
        }
        
        menuButton = new JButton("MENU");
        menuButton.addActionListener(new ChangeCardActionListener(party.getMainJFrame(),"MenuJPanel"));
        gameStartButton = new JButton("START");
        gameStartButton.addActionListener(new ChangeCardActionListener(party.getMainJFrame(),"GameMainJPanel"));
        gameStartButton.addActionListener(new NewPartyActionListener(this,party));
        
        jpanelBoutton = new JPanel();
        
        jpanelBoutton.setLayout(new BoxLayout(jpanelBoutton, BoxLayout.X_AXIS));
        jpanelBoutton.add( menuButton);
        jpanelBoutton.add( gameStartButton);
        
        this.add(jpanelBoutton); 
    }

    public NameSelectionJPanel[] getTabOfNameSelectionJPanel() {
        return tabOfNameSelectionJPanel;
    }
}
