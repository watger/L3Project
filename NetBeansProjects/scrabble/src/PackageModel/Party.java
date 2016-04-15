/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

import PackageView.MainJFrame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pardojeremie
 */
public class Party {
    private MainJFrame mainJFrame;
    private List<Player> listOfPlayer;
    private int id,playerActual,tour;
    private Tray tray;
    private Frame[][] frameTab;
    private Sackcloth sackcloth;
    
    
    public Party(MainJFrame mainJFrame) {
         Frame[][] frameTab = {
                {new Frame(4),new Frame(0),new Frame(0),
                    new Frame(1),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(4),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(1),
                    new Frame(0),new Frame(0),new Frame(4)}
                ,{new Frame(0),new Frame(3),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(2),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(2),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(3),new Frame(0)}
                ,{new Frame(0),new Frame(0),new Frame(3),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(1),new Frame(0),new Frame(1),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(3),new Frame(0),new Frame(0)}
                ,{new Frame(1),new Frame(0),new Frame(0),
                    new Frame(3),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(1),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(3),
                    new Frame(0),new Frame(0),new Frame(1)}
                ,{new Frame(0),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(3),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(3),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(0)}
                ,{new Frame(0),new Frame(2),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(2),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(2),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(2),new Frame(0)}
                ,{new Frame(0),new Frame(0),new Frame(1),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(1),new Frame(0),new Frame(1),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(1),new Frame(0),new Frame(0)}
                ,{new Frame(4),new Frame(0),new Frame(0),
                    new Frame(1),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(3),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(1),
                    new Frame(0),new Frame(0),new Frame(4)}
                ,{new Frame(0),new Frame(0),new Frame(1),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(1),new Frame(0),new Frame(1),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(1),new Frame(0),new Frame(0)}
                ,{new Frame(0),new Frame(2),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(2),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(2),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(2),new Frame(0)}
                ,{new Frame(0),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(3),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(3),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(0)}
                ,{new Frame(1),new Frame(0),new Frame(0),
                    new Frame(3),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(1),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(3),
                    new Frame(0),new Frame(0),new Frame(1)}
                ,{new Frame(0),new Frame(0),new Frame(3),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(1),new Frame(0),new Frame(1),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(3),new Frame(0),new Frame(0)}
                ,{new Frame(0),new Frame(3),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(2),
                    new Frame(0),new Frame(0),new Frame(0),
                    new Frame(2),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(3),new Frame(0)}
                ,{new Frame(4),new Frame(0),new Frame(0),
                    new Frame(1),new Frame(0),new Frame(0),
                    new Frame(0),new Frame(4),new Frame(0),
                    new Frame(0),new Frame(0),new Frame(1),
                    new Frame(0),new Frame(0),new Frame(4)}
                };
         this.frameTab = frameTab;
         this.mainJFrame = mainJFrame;
         NewParty();
    }
    
    public void NewParty() {
        this.listOfPlayer = new ArrayList<Player>();
        this.id = 0;
        this.tray = new Tray(frameTab);
        this.sackcloth = new Sackcloth();
        this.playerActual = 0; 
        this.tour = 0;
    }

    
    public void AddPlayer(String playerType, String playerName) {
        if(!playerType.equals("Null")) {
            if(playerType.equals("Computer"))
                listOfPlayer.add(new Computer(id,playerName,sackcloth));
            else
                listOfPlayer.add(new Human(id,playerName,sackcloth));
            id++;
        }       
    }    

    public MainJFrame getMainJFrame() {
        return mainJFrame;
    }

    public Sackcloth getSackcloth() {
        return sackcloth;
    }

    public Tray getTray() {
        return tray;
    }
   
    public List<Player> getListOfPlayer() {
        return listOfPlayer;
    }
    
    public Player getPlayerActual() {
        return listOfPlayer.get(playerActual);
    }
}
