/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageModel.Tray;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class GameMainJPanel extends JPanel{
    private JPanel northJPanel,eastJPanel,southJPanel,westJPanel;
    private JButton drawButton,endOfTurnButton,menuButton;
    private ArrayList<String> str;
    private Tray tray;
 
    public GameMainJPanel(Tray tray) {
        //JLabel Constructor
        super();
        this.tray = tray;
        
        this.setLayout(new BorderLayout());
        
        northJPanel = new JPanel();
        eastJPanel = new JPanel();
        southJPanel = new JPanel();
        westJPanel = new JPanel(new GridLayout(4,1));
        
        
        drawButton = new JButton("PIOCHER");
        endOfTurnButton = new JButton("FIN DU TOUR");
        menuButton = new JButton("MENU");
        
        str = new ArrayList<>();
        str.add("chaine1");str.add("chaine2"); str.add("chaine3");str.add("chaine4");
        
        northJPanel.add(new ScoreJPanel(str));
        eastJPanel.add(new TrayJPanel(tray));
        southJPanel.add(new EaselJPanel());
        westJPanel.add(drawButton);
        westJPanel.add(endOfTurnButton);
        westJPanel.add(menuButton);
        
        this.add(northJPanel, BorderLayout.NORTH);
        this.add(eastJPanel, BorderLayout.EAST);
        this.add(southJPanel, BorderLayout.SOUTH);
        this.add(westJPanel, BorderLayout.WEST);
    }
    
    //get ScoreJPanel
    //get TrayJPanel
    //get EaselJPAnel
}
