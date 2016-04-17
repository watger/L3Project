/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageController.*;
import PackageModel.Party;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class MenuJPanel extends JPanel{
    private JButton startButton, ruleButton, exitButton;
    private Party party;
    
    public MenuJPanel(Party party) {
        //JLabel Constructor
        super();
        
        this.party = party;
        //set of the layout
         this.setLayout(new  GridLayout(3, 1));
        
        //set of the JButtons
        startButton = new JButton("START");
        ruleButton = new JButton("RULE");
        exitButton = new JButton("EXIT");
        
        //set of the JButtons action listener
        startButton.addActionListener(new ChangeCardActionListener(party.getMainJFrame(),"GameOptionJPanel"));
        ruleButton.addActionListener(new ChangeCardActionListener(party.getMainJFrame(),"RuleJPanel"));
        exitButton.addActionListener(new ExitActionListener());
        
        //add of the JButton in the JPanel
        this.add(startButton);
        this.add(ruleButton);
        this.add(exitButton);
    }
   
    
}
