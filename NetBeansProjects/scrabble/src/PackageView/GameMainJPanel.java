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
        endOfTurnButton = new JButton("FIN DU TOUR");
        menuButton = new JButton("MENU");
        menuButton.addActionListener(new ChangeCardWithPopUpActionListener(cards,"MenuJPanel","test"));
        
        scoreJPanel = new ScoreJPanel();
        northJPanel.add(scoreJPanel);
        
        TrayJPanel trayJPanel = new TrayJPanel(this.party.getTray());
        trayJPanel.addMouseListener(new MouseLayoutActionListener(trayJPanel,15,15));
        eastJPanel.add(trayJPanel);
        
        EaselJPanel easelJPanel = new EaselJPanel();
        easelJPanel.addMouseListener(new MouseLayoutActionListener(easelJPanel,1,7));
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
    }
}
