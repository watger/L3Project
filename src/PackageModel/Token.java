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
    private boolean fixed;

    public Token(int value, char character) {
        this.value = value;
        this.character = character;
        fixed = true;
    }
    
    public Token(Token token) {
        value = token.value;
        character = token.character;
        fixed = token.fixed;
    }
    
    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public int getValue() {
        return value;
    }

    public char getCharacter() {
        return character;
    }

}
