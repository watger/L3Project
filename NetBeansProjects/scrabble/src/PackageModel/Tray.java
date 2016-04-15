/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

import java.util.ArrayList;

/**
 *
 * @author pardojeremie
 */
public class Tray { 
    private Frame[][] tableFrame = new Frame[15][15];
    
    public Tray(Frame[][] tableFrame) {
        this.tableFrame = tableFrame;
    }
    
    public Boolean setTokenFrames (Party party, int i, int j) {
        if (tableFrame[i][j].getToken() == null) {
            for(int n = 0; n < party.getPlayerActual().getEasel().getEasellenght(); n++)
                if (party.getPlayerActual().getEasel().GetToken(n) != null) 
                    if (party.getPlayerActual().getEasel().GetToken(n).isSelect()) {
                        tableFrame[i][j].setToken(party.getPlayerActual().getEasel().GetToken(n));
                        party.getPlayerActual().getEasel().setToken(n,null);
                        return true;
                    }
        }
        return false;
    }
    
    public Token GetFramesToken ( int height, int width) {
        try {
           return tableFrame[height][width].getToken(); 
        }catch(Exception e) {return null;}
    }
    
    public int GetFramesValues ( int height, int width) {
           return tableFrame[height][width].getValue(); 
    }
    
    public void DeselectAllToken () {
        for (Frame[] tableFrame1 : tableFrame)
            for (Frame tableFrame11 : tableFrame1)
                if (tableFrame11.getToken() != null)
                    tableFrame11.getToken().setSelect(false);
    }
    
    public void SetAllTokenToNull () {
        for (Frame[] tableFrame1 : tableFrame)
            for (Frame tableFrame11 : tableFrame1)
                tableFrame11.setToken(null);
    }
    
    public int GetTrayWidth() {
        return tableFrame[0].length;
    } 
    
    public int GetTrayHeight() {
        return tableFrame.length;
    } 
    
   //get width and height

    public ArrayList<String> GetWords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int GetScoreWords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
