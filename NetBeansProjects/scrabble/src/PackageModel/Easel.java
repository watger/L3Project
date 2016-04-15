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
public class Easel {
    private Token[] tableToken;
    private Sackcloth sackcloth;
    
    public Easel(Sackcloth sackcloth) {
        tableToken = new Token[7];
        this.sackcloth = sackcloth;
        for(int i = 0; i < tableToken.length; i++) {
            tableToken[i] = this.sackcloth.DrawToken();
        }
    }
    
    public Easel(Easel easel) {
        tableToken = easel.tableToken;
    }
    
    public void ChangeToken(Sackcloth sackcloth) {
        ArrayList<Token> temporaryListToken = new ArrayList<Token>();
        
        for(int i = 0; i < tableToken.length; i++) {
            try {
                if(tableToken[i].isSelect()) {
                    tableToken[i].setSelect(false);
                    temporaryListToken.add(tableToken[i]);
                    tableToken[i] = sackcloth.DrawToken();
                }
            }catch(Exception e) {}
        }
        for(int i = 0; i < temporaryListToken.size(); i++)
            sackcloth.AddToken(temporaryListToken.get(i));
    }

    public void setToken(int i, Token token) {
        tableToken[i] = token;
    }
    
    public Token GetToken(int i) {
        return tableToken[i];
    }
    
    public void SelectToken(int i) {
        tableToken[i].setSelect(true);
    }
    
    public void DeselectAllToken() {
        for(int i = 0; i < tableToken.length; i++)
            if(tableToken[i] != null)
                tableToken[i].setSelect(false);
    }
    
    public int getEasellenght() {
        return tableToken.length;
    }

}
/// a faire l'initialisation des token dans l'easel ...
/// faire en sorte que changeToken prène en compte les espace vide?