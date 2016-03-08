/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

import PackageObserve.Observable;

/**
 *
 * @author pardojeremie
 */
public abstract class Player implements Observable {
    private final int id;
    private int score;
    private String name;
    private Easel easel;
    
    public Player(int id,String name,Easel easel) {
        this.id = id;
        this.name = name;
        this.easel = new Easel(easel);
        score = 0;
    }
   
    //dans le PackageController ?
    abstract public void Play();
}
