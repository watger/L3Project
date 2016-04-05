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
    JPanel cardsLayoutPanel;
    
    public MainJFrame() {
        super();
        Party party = new Party();
        
        this.setTitle("Scrabble");
        //this.setLocationRelativeTo(null);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        this.setLocationRelativeTo(null);
        //this.setLayout( new FlowLayout(FlowLayout.CENTER));
        cardsLayoutPanel = new JPanel(new CardLayout());
        cardsLayoutPanel.add(new MenuJPanel(cardsLayoutPanel),"MenuJPanel");
        cardsLayoutPanel.add(new RuleJPanel(cardsLayoutPanel),"RuleJPanel");
        cardsLayoutPanel.add(new GameOptionJPanel(party,cardsLayoutPanel),"GameOptionJPanel");
        cardsLayoutPanel.add(new GameMainJPanel(party,cardsLayoutPanel),"GameMainJPanel");
        this.add(cardsLayoutPanel);
  }
    
}