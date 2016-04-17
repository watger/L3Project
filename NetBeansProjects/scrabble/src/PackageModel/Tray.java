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
    private int xmax,xmin,ymax,ymin;
    
    public Tray(Frame[][] tableFrame) {
        this.tableFrame = tableFrame;
        ResetXYMaxMin();
    }
    
    public Boolean setTokenFrames (Party party, int i, int j) {
        if (setTokenIsPossible(party,i,j)) {
            for(int n = 0; n < party.getPlayerActual().getEasel().getEasellenght(); n++)
                if (party.getPlayerActual().getEasel().GetToken(n) != null && party.getPlayerActual().getEasel().GetToken(n).isSelect()) 
                {
                    tableFrame[i][j].setToken(party.getPlayerActual().getEasel().GetToken(n));
                    party.getPlayerActual().getEasel().setToken(n,null);
                    UpdateFramesFree(i,j);
  
                    return true;
                }
        }
        return false;
    }
    
    public Boolean setTokenIsPossible(Party party, int i, int j) {
        if (tableFrame[i][j].getToken() == null && tableFrame[i][j].isFree() && ((xmin == i && ymin == j)||(xmax == i && ymax == j)||(xmin == xmax && ymin == ymax)))
            return true;
        return false;
    }
    
    public void UpdateFramesFree( int i, int j) {
        if(i != tableFrame.length-1)
            tableFrame[i+1][j].setFree(true);
        if(i != 0)
            tableFrame[i-1][j].setFree(true);
        if(j != tableFrame[0].length-1)
            tableFrame[i][j+1].setFree(true);
        if(j != 0)
            tableFrame[i][j-1].setFree(true);
        UpdateXYMaxMin(i,j);
    }
    
    public void UpdateXYMaxMin(int i, int j) {
        if (xmin == -1){
            xmin = i;
            xmax = i;
            ymin = j;
            ymax = j;
        }
        else if(xmin == xmax && ymin == ymax) {
            if(xmin == i)
            {
                if(ymax < j) 
                {
                    ymax = j + 1;
                    ymin -= 1;
                }
                else if(ymax > j) 
                {
                    ymin = j - 1;
                    ymax += 1;
                }
            }
            else if(ymin == j)
            {
                if(xmax < i) 
                {
                    xmax = i + 1;
                    xmin -= 1;
                }
                else if(xmax > i) 
                {
                    xmin = i - 1;
                    xmax += 1;
                }
            }
        }
        else {
            if(xmin == xmax)
            {
                if(ymax == j) 
                    ymax = j + 1;
                else if(ymin == j) 
                    ymin = j - 1;
                
                //if(tableFrame[xmin][ymax] != null)
                  //  UpdateXYMaxMin(xmin,ymax);
                //if(tableFrame[xmin][ymin] != null)
                  //  UpdateXYMaxMin(xmin,ymin);
            }
            else if(ymin == ymax)
            {
                if(xmax == i) 
                    xmax = i + 1;
                else if(xmin == i) 
                    xmin = i - 1;
                
                //if(tableFrame[xmin][ymin] != null)
                  //  UpdateXYMaxMin(xmin,ymin);
                //if(tableFrame[xmax][ymin] != null)
                  //  UpdateXYMaxMin(xmax,ymin);
            }
        }
        System.out.println("xmax:"+xmax+" xmin:"+xmin+" ymax:"+ymax+" ymin:"+ymin);
    }
    
    public void ResetXYMaxMin() {
        xmax = -1;
        xmin = -1;
        ymax = -1;
        ymin = -1;
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

    public Frame[][] getTableFrame() {
        return tableFrame;
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
