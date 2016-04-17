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
public class Frame {
    private final int value;
    private boolean free;
    private Token token;
    
    public Frame(int value) {
        this.value = value;
        token = null;
        free = false;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public int getValue() {
        return value;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
