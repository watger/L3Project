/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageModel.Frame;
import PackageModel.Party;
import PackageModel.Tray;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class MainJFrame extends JFrame{
    private JPanel cardsLayoutPanel;
    private MenuJPanel menuJPanel;
    private RuleJPanel ruleJPanel;
    private GameOptionJPanel gameOptionJPanel;
    private GameMainJPanel gameMainJPanel;

    public MainJFrame() {
        super();
        Party party = new Party(this);
        
        this.setTitle("Scrabble");
        //this.setLocationRelativeTo(null);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        this.setLocationRelativeTo(null);
        //this.setLayout( new FlowLayout(FlowLayout.CENTER));
        cardsLayoutPanel = new JPanel(new CardLayout());
        
        menuJPanel = new MenuJPanel(party);
        ruleJPanel = new RuleJPanel(party);
        gameOptionJPanel = new GameOptionJPanel(party);
        gameMainJPanel = new GameMainJPanel(party);
        
        cardsLayoutPanel.add(menuJPanel,"MenuJPanel");
        cardsLayoutPanel.add(ruleJPanel,"RuleJPanel");
        cardsLayoutPanel.add(gameOptionJPanel,"GameOptionJPanel");
        cardsLayoutPanel.add(gameMainJPanel,"GameMainJPanel");
        
        this.add(cardsLayoutPanel);
        this.setSize(200,300);
  }

    public JPanel getCardsLayoutPanel() {
        return cardsLayoutPanel;
    }
    
     public MenuJPanel getMenuJPanel() {
        return menuJPanel;
    }

    public RuleJPanel getRuleJPanel() {
        return ruleJPanel;
    }

    public GameOptionJPanel getGameOptionJPanel() {
        return gameOptionJPanel;
    }

    public GameMainJPanel getGameMainJPanel() {
        return gameMainJPanel;
    }  
}