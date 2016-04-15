/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

/**
 *
 * @author pardojeremie
 */
public class Token {
    private final int value;
    private final char character;
    private boolean select;

    public Token(int value, char character) {
        this.value = value;
        this.character = character;
        select = false;
    }
    
    public Token(Token token) {
        value = token.value;
        character = token.character;
        select = token.select;
    }
    
    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public int getValue() {
        return value;
    }

    public char getCharacter() {
        return character;
    }

}
