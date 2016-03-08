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
public class Sackcloth {
    private ArrayList<Token> listToken;
    
    public Sackcloth() {
        listToken = new ArrayList<Token>() {};
    }
    
    public void AddToken(Token token) {
        listToken.add(token);
    }
    
    public void AddsTokens(int time ,Token token) {
        for(int i = 0; i < time; i++)
            listToken.add(new Token(token));
    }
    
    public Token DrawToken() {
        int index = (int) (Math.random() * listToken.size());
        Token bufferToken = null;
        
        try {
            bufferToken = listToken.get(index);
            listToken.remove(index);
        }catch(Exception e) {}
        
        return bufferToken;
    }
}
