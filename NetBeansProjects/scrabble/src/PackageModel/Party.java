/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pardojeremie
 */
public class Party {
    private List<Player> listOfPlayer;
    private int idGiver;
    private Tray tray;
    private Frame[][] frameTab;
    
    
    public Party() {
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
         NewParty();
    }
    
    public void AddPlayer(String playerType, String playerName) {
        if(!playerType.equals("Null")) {
            if(playerType.equals("Computer"))
                listOfPlayer.add(new Computer(idGiver,playerName));
            else
                listOfPlayer.add(new Human(idGiver,playerName));
            idGiver++;
        }       
    }    

    public Tray getTray() {
        return tray;
    }
    
    public void NewParty() {
        this.listOfPlayer = new ArrayList<Player>();
        this.idGiver = 0;
        this.tray = new Tray(frameTab);
    }

    public List<Player> getListOfPlayer() {
        return listOfPlayer;
    }
}
