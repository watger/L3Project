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
    
    Tray(Frame[][] tableFrame) {
        this.tableFrame = tableFrame;
    }
    
    public void setTokenFrames (Token token, int height, int width) {
        try {
            tableFrame[height][width].setToken(token); 
        }catch(Exception e) {}
    }
    
    public void setTokenFixedTrue () {
        for (Frame[] tableFrame1 : tableFrame) {
            for (Frame tableFrame11 : tableFrame1) {
                if (tableFrame11.getToken() != null) {
                    tableFrame11.getToken().setFixed(true);
                }
            }
        }
    }
    
   //get width and height

    public ArrayList<String> GetWords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int GetScoreWords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
