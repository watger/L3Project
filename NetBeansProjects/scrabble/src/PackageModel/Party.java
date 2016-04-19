/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

import PackageView.MainJFrame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pardojeremie
 */
public class Party {
    private MainJFrame mainJFrame;
    private List<Player> listOfPlayer;
    private int id,playerActual;
    private Tray tray;
    private Frame[][] frameTab;
    private Sackcloth sackcloth;
    private Dictionary dictionary; 
    
    
    public Party(MainJFrame mainJFrame) throws IOException {
        dictionary = new Dictionary();
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
        listOfPlayer = new ArrayList<Player>();
        id = 0;
        tray = new Tray(frameTab);
        tray.getTableFrame()[tray.GetTrayWidth()/2][tray.GetTrayHeight()/2].setFree(true);
        sackcloth = new Sackcloth();
        playerActual = 0; 
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
    
    public void NextPlayer() {
        tray.ifWordsFalse(tray.VerifWords(tray.GetWordsAndCalculScore(), this),this);
        
        getPlayerActual().getEasel().ChangeToken(sackcloth);
        getPlayerActual().setDraw(false);
        getPlayerActual().setPlay(false);
        if(playerActual< listOfPlayer.size()-1)
            playerActual++;
        else
            playerActual = 0;
        tray.DeselectAllToken();
        tray.ResetXYMaxMin();
        
        
        mainJFrame.getGameMainJPanel().getTrayJPanel().UpdateIconJLabel();
        mainJFrame.getGameMainJPanel().getEaselJPanel().SetAllIconJLabel(listOfPlayer.get(playerActual).getEasel());
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public String getNextPlayerName() {
         if(playerActual< listOfPlayer.size()-1)
            return listOfPlayer.get(playerActual +1).getName();
        else
            return listOfPlayer.get(0).getName();
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
