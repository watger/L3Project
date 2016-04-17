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
        
        listToken.add(new Token(8,'j'));
        listToken.add(new Token(10,'k'));
        listToken.add(new Token(8,'q'));
        listToken.add(new Token(10,'w'));
        listToken.add(new Token(10,'x'));
        listToken.add(new Token(10,'y'));
        listToken.add(new Token(10,'z'));
        for(int i = 0; i < 2; i++) {
            listToken.add(new Token(3,'b'));
            listToken.add(new Token(3,'c'));
            listToken.add(new Token(4,'f'));
            listToken.add(new Token(2,'g'));
            listToken.add(new Token(4,'h'));
            listToken.add(new Token(3,'p'));
            listToken.add(new Token(4,'v'));
            listToken.add(new Token(0,'#'));
        }
        for(int i = 0; i < 3; i++) {
            listToken.add(new Token(2,'d'));
            listToken.add(new Token(2,'m'));
        }
        for(int i = 0; i < 5; i++)
            listToken.add(new Token(1,'l'));
        for(int i = 0; i < 6; i++) {
            listToken.add(new Token(1,'n'));
            listToken.add(new Token(1,'o'));
            listToken.add(new Token(1,'r'));
            listToken.add(new Token(1,'s'));
            listToken.add(new Token(1,'t'));
            listToken.add(new Token(1,'u'));
        }
        for(int i = 0; i < 8; i++)
            listToken.add(new Token(1,'i'));
        for(int i = 0; i < 9; i++) 
            listToken.add(new Token(1,'a'));
        for(int i = 0; i < 15; i++)
            listToken.add(new Token(1,'e'));
    }
    
    public void AddToken(Token token) {
        listToken.add(token);
    }
    
    //public void AddsTokens(int time ,Token token) {
      //  for(int i = 0; i < time; i++)
        //    listToken.add(new Token(token));
    //}
    
    public Token DrawToken() {
        int index = (int) (Math.random() * listToken.size());
        Token bufferToken = null;
        
        if(!listToken.isEmpty()) {
            bufferToken = listToken.get(index);
            listToken.remove(index);
        }
        
        return bufferToken;
    }
}
