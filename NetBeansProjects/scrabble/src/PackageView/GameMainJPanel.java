/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageController.*;
import PackageModel.Party;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class GameMainJPanel extends JPanel{
    private JPanel northJPanel,eastJPanel,southJPanel,westJPanel;
    private JButton drawButton,endOfTurnButton,menuButton;
    private List<String> str;
    private ScoreJPanel scoreJPanel;
    private Party party;
    private EaselJPanel easelJPanel;
    private  TrayJPanel trayJPanel;
    
    public GameMainJPanel(Party party,JPanel cards) {
        //JLabel Constructor
        super();
        
        this.party = party;
        this.setLayout(new BorderLayout());
        
        northJPanel = new JPanel();
        eastJPanel = new JPanel();
        southJPanel = new JPanel();
        westJPanel = new JPanel(new GridLayout(4,1));
        
        
        drawButton = new JButton("PIOCHER");
        drawButton.addActionListener(new DrawButtonActionListener(party));
        endOfTurnButton = new JButton("FIN DU TOUR");
        menuButton = new JButton("MENU");
        menuButton.addActionListener(new ChangeCardWithPopUpActionListener(cards,"MenuJPanel","test"));
        
        scoreJPanel = new ScoreJPanel();
        northJPanel.add(scoreJPanel);
        
        trayJPanel = new TrayJPanel(this.party.getTray());
        trayJPanel.addMouseListener(new MouseLayoutActionListenerTray(party));
        eastJPanel.add(trayJPanel);
        
        easelJPanel = new EaselJPanel();
        easelJPanel.addMouseListener(new MouseLayoutActionListenerEasel(party));
        southJPanel.add(easelJPanel);
        westJPanel.add(drawButton);
        westJPanel.add(endOfTurnButton);
        westJPanel.add(menuButton);
        
        this.add(northJPanel, BorderLayout.NORTH);
        this.add(eastJPanel, BorderLayout.EAST);
        this.add(southJPanel, BorderLayout.SOUTH);
        this.add(westJPanel, BorderLayout.WEST);
    }
    
    public void NewTurn () {
        scoreJPanel.NewScorePlayer(party.getListOfPlayer());
        easelJPanel.SetAllIconJLabel(party.getPlayerActual().getEasel());
        party.getTray().SetAllTokenToNull();
        trayJPanel.UpdateIconJLabel();
    }

    public JButton getDrawButton() {
        return drawButton;
    }

    public JButton getEndOfTurnButton() {
        return endOfTurnButton;
    }

    public JButton getMenuButton() {
        return menuButton;
    }

    public ScoreJPanel getScoreJPanel() {
        return scoreJPanel;
    }

    public EaselJPanel getEaselJPanel() {
        return easelJPanel;
    }

    public TrayJPanel getTrayJPanel() {
        return trayJPanel;
    }
}
