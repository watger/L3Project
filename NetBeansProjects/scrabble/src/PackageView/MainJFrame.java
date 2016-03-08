/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
        this.setTitle("Scrabble");
        //this.setLocationRelativeTo(null);
       this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        //this.setLayout( new FlowLayout(FlowLayout.CENTER));
        cardsLayoutPanel = new JPanel(new CardLayout());
        cardsLayoutPanel.add(new MenuJPanel(cardsLayoutPanel),"MenueJPanel");
        cardsLayoutPanel.add(new RuleJPanel(cardsLayoutPanel),"RuleJPanel");
        cardsLayoutPanel.add(new GameOptionJPanel(cardsLayoutPanel),"GameOptionJPanel");
        this.add(cardsLayoutPanel);
  }
    
}