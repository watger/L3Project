/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

import PackageObserve.Observable;
import java.util.ArrayList;

/**
 *
 * @author pardojeremie
 */
public class Easel implements Observable {
    private Token[] tableToken;
    
    public Easel() {
        tableToken = new Token[7];
    }
    
    public Easel(Easel easel) {
        tableToken = easel.tableToken;
    }
    
    public void ChangeToken(Sackcloth sackcloth) {
        ArrayList<Token> temporaryListToken = new ArrayList<Token>();
        
        for(int i = 0; i < tableToken.length; i++) {
            try {
                if(!tableToken[i].isFixed()) {
                    temporaryListToken.add(tableToken[i]);
                    tableToken[i] = sackcloth.DrawToken();
                }
            }catch(Exception e) {}
        }
        for(int i = 0; i < temporaryListToken.size(); i++)
            sackcloth.AddToken(temporaryListToken.get(i));
    }
    
    public boolean PoseToken(Tray tray) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void SelectToken(/*Mouse mouse?? or Token token??*/) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void DeselectAllToken(/*Mouse mouse?? or Token token??*/) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
/// a faire l'initialisation des token dans l'easel ...
/// faire en sorte que changeToken prène en compte les espace vide?