/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageModel.Frame;
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
        
        Frame[][] frameTab = {
                 {new Frame(4),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(4),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(4)}
                ,{new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0)}
                ,{new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0)}
                ,{new Frame(1),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(1)}
                ,{new Frame(0),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(0)}
                ,{new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0)}
                ,{new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0)}
                ,{new Frame(4),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(4)}
                ,{new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0)}
                ,{new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0)}
                ,{new Frame(0),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(0)}
                ,{new Frame(1),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(1)}
                ,{new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0),new Frame(0)}
                ,{new Frame(0),new Frame(3),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(2),new Frame(0),new Frame(0),new Frame(0),new Frame(3),new Frame(0)}
                ,{new Frame(4),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(0),new Frame(4),new Frame(0),new Frame(0),new Frame(0),new Frame(1),new Frame(0),new Frame(0),new Frame(4)}
                };
        
        Tray tray = new Tray(frameTab);
        
        this.setTitle("Scrabble");
        //this.setLocationRelativeTo(null);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        this.setLocationRelativeTo(null);
        //this.setLayout( new FlowLayout(FlowLayout.CENTER));
        cardsLayoutPanel = new JPanel(new CardLayout());
        cardsLayoutPanel.add(new MenuJPanel(cardsLayoutPanel),"MenuJPanel");
        cardsLayoutPanel.add(new RuleJPanel(cardsLayoutPanel),"RuleJPanel");
        cardsLayoutPanel.add(new GameOptionJPanel(cardsLayoutPanel),"GameOptionJPanel");
        cardsLayoutPanel.add(new GameMainJPanel(tray),"GameMainJPanel");
        this.add(cardsLayoutPanel);
  }
    
}