/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pardojeremie
 */
public class Tray { 
    private Frame[][] tableFrame = new Frame[15][15];
    private int xmax,xmin,ymax,ymin,yFirstTokenPose,xFirstTokenPose,score;
    private ArrayList lSelect;
    
    public Tray(Frame[][] tableFrame) {
        this.tableFrame = tableFrame;
        ResetXYMaxMin();
        lSelect = new ArrayList();
    }
    
    public Boolean setTokenFrames (Party party, int i, int j) {
        if (setTokenIsPossible(party,i,j)) {
            for(int n = 0; n < party.getPlayerActual().getEasel().getEasellenght(); n++)
                if (party.getPlayerActual().getEasel().GetToken(n) != null && party.getPlayerActual().getEasel().GetToken(n).isSelect()) 
                {
                    tableFrame[i][j].setToken(party.getPlayerActual().getEasel().GetToken(n));
                    party.getPlayerActual().getEasel().setToken(n,null);
                    lSelect.add(tableFrame[i][j]);
                    UpdateFramesFree(i,j);
  
                    return true;
                }
        }
        return false;
    }
    
    public Boolean setTokenIsPossible(Party party, int i, int j) {
        if (tableFrame[i][j].getToken() == null && tableFrame[i][j].isFree()) {
            if (((xmin == i && ymin == j)||(xmax == i && ymax == j)||xmin == -1))
                return true;
            if((xmin == xmax && ymin == ymax)) {
                if(xmin == i) {
                    if(j < ymin)
                        for(int n = j+1; n < ymin; n++)
                            if(tableFrame[i][n].getToken() == null)
                                return false;
                    if(j > ymin)
                        for(int n = j-1; n > ymin; n--)
                            if(tableFrame[i][n].getToken() == null) 
                                return false;
                    return true;
                }
                else if(ymin == j) {
                    if(i < xmin)
                        for(int n = i+1; n < xmin; n++)
                            if(tableFrame[n][j].getToken() == null)
                                return false;
                    if(i > xmin)
                        for(int n = i-1; n > xmin; n--)
                            if(tableFrame[n][j].getToken() == null)
                                return false;
                    return true;
                }
            }
        }
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
            yFirstTokenPose = i;
            xFirstTokenPose = j;
            score = 0;
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
                
                if(ymax < tableFrame[xmin].length && tableFrame[xmin][ymax].getToken() != null)
                    UpdateXYMaxMin(xmin,ymax);
                if(ymin > 0 && tableFrame[xmin][ymin].getToken() != null)
                    UpdateXYMaxMin(xmin,ymin);
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
                
                if(xmax < tableFrame.length && tableFrame[xmax][ymin].getToken() != null)
                    UpdateXYMaxMin(xmax,ymin);
                if(xmin > 0 && tableFrame[xmin][ymin].getToken() != null)
                    UpdateXYMaxMin(xmin,ymin);
            }
        }
        else {
            if(xmin == xmax)
            {
                if(ymax == j) 
                    ymax = j + 1;
                else if(ymin == j) 
                    ymin = j - 1;
                
                if(ymax < tableFrame[xmin].length && tableFrame[xmin][ymax].getToken() != null)
                    UpdateXYMaxMin(xmin,ymax);
                if(ymin > 0 && tableFrame[xmin][ymin].getToken() != null)
                    UpdateXYMaxMin(xmin,ymin);
            }
            else if(ymin == ymax)
            {
                if(xmax == i) 
                    xmax = i + 1;
                else if(xmin == i) 
                    xmin = i - 1;
                
                if(xmax < tableFrame.length && tableFrame[xmax][ymin].getToken() != null)
                    UpdateXYMaxMin(xmax,ymin);
                if(xmin > 0 && tableFrame[xmin][ymin].getToken() != null)
                    UpdateXYMaxMin(xmin,ymin);
            }
        }
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

    public List<String> GetWordsAndCalculScore() {
        int i = yFirstTokenPose, j = xFirstTokenPose, k;
        List<String> l = new ArrayList();
        String strTemp = new String();
        
        if(xmax == -1);
        else if(xmax == xmin ) {
            strTemp = "";
            k = 0;
            while(tableFrame[i][j + k].getToken() != null) {
                strTemp = strTemp+tableFrame[i][j+k].getToken().getCharacter();
                int n = 1;
                
                if(tableFrame[i][j+k].getToken().isSelect()) {
                    
                    String strTemp2 = ""+tableFrame[i][j+k].getToken().getCharacter();
                    while(tableFrame[i+n][j+k].getToken() != null) {
                        strTemp2 = strTemp2+tableFrame[i+n][j+k].getToken().getCharacter();
                        
                        n++;
                    }

                    n = 1;
                    while(tableFrame[i-n][j+k].getToken() != null) {
                        strTemp2 = tableFrame[i-n][j+k].getToken().getCharacter()+strTemp2;
                        n++;
                    }
                    if(strTemp2.length()>1)
                        l.add(strTemp2);
                }
                k++;
            }
            
            k = 1;
            while(tableFrame[i][j-k].getToken() != null) {
                strTemp = tableFrame[i][j-k].getToken().getCharacter()+strTemp;
                
                if(tableFrame[i][j-k].getToken().isSelect()) {
                    int n = 1;
                    String strTemp2 = ""+tableFrame[i][j-k].getToken().getCharacter();
                    while(tableFrame[i+n][j-k].getToken() != null) {
                        strTemp2 = strTemp2+tableFrame[i+n][j-k].getToken().getCharacter();
                        n++;
                    }
            
                    n = 1;
                    while(tableFrame[i-n][j-k].getToken() != null) {
                        strTemp2 = tableFrame[i-n][j-k].getToken().getCharacter()+strTemp2;
                        n++;
                    }
                    if(strTemp2.length()>1)
                    l.add(strTemp2);
                }
                
                k++;
            }
            if(strTemp.length()>1)
                l.add(strTemp);
        }
        else {
            strTemp = "";
            k=0;
            while(tableFrame[i+k][j].getToken() != null) {
                strTemp = strTemp+tableFrame[i+k][j].getToken().getCharacter();
                
                if(tableFrame[i+k][j].getToken().isSelect()) {
                    int n = 1;
                    String strTemp2 = ""+tableFrame[i+k][j].getToken().getCharacter();
                    while(tableFrame[i+k][j+n].getToken() != null) {
                        strTemp2 = strTemp2+tableFrame[i+k][j+n].getToken().getCharacter();
                        n++;
                    }
            
                    n = 1;
                    while(tableFrame[i+k][j-n].getToken() != null) {
                        strTemp2 = tableFrame[i+k][j-n].getToken().getCharacter()+strTemp2;
                        n++;
                    }
                    if(strTemp2.length()>1)
                    l.add(strTemp2);
                }
                
                k++;
            }
            k = 1;
            while(tableFrame[i-k][j].getToken() != null) {
                strTemp = tableFrame[i-k][j].getToken().getCharacter()+strTemp;
                
                if(tableFrame[i-k][j].getToken().isSelect()) {
                    int n = 1;
                    String strTemp2 = ""+tableFrame[i-k][j].getToken().getCharacter();
                    while(tableFrame[i-k][j+n].getToken() != null) {
                        strTemp2 = strTemp2+tableFrame[i-k][j+n].getToken().getCharacter();
                        n++;
                    }
            
                    n = 1;
                    while(tableFrame[i-k][j-n].getToken() != null) {
                        strTemp2 = tableFrame[i-k][j-n].getToken().getCharacter()+strTemp2;
                        n++;
                    }
                    if(strTemp2.length()>1)
                    l.add(strTemp2);
                }
                
                k++;
            }
            if(strTemp.length()>1)
                l.add(strTemp);
             
        }
        System.out.println(l.toString());
        return l;
    }
    
    public String replace(String str, int index, char replace){     
        if(str==null){
            return str;
        }else if(index<0 || index>=str.length()){
            return str;
        }
        char[] chars = str.toCharArray();
        chars[index] = replace;
        return String.valueOf(chars);       
    }  
    
    public Boolean VerifWords(List<String> l,Party party) {
        Boolean b = true;
        System.out.println(l.size());
        for(int i = 0 ; i < l.size(); i++) {
            for(int n = 0; n <l.get(i).length();n++)
                if(l.get(i).charAt(n) == '#') {
                    b = false;
                    for(char c = 'a'; c <= 'z'; c++)
                        if(party.getDictionary().ContainWords(replace(l.get(i),n,c)))
                            b = true;
                }
                    
            if(!party.getDictionary().ContainWords(l.get(i)))
                b = false;
        }
        return b;
    }
    
    public void ifWordsFalse (Boolean b,Party party){
        if(!b) {
            int i = 0;
            for(int n = 0; n <party.getPlayerActual().getEasel().getEasellenght() && i < lSelect.size();n++ )
                if(party.getPlayerActual().getEasel().GetToken(n) == null) {
                    party.getPlayerActual().getEasel().setToken(n,((Frame)lSelect.get(i)).getToken());
                    party.getPlayerActual().getEasel().GetToken(n).setSelect(false);
                    ((Frame)lSelect.get(i)).setToken(null);
                    i++;
                }
        }
        
        lSelect.clear();
    }
    
    public int getScoreWords() {
        return 0;
    }
}
