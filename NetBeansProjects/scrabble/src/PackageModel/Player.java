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
public abstract class Player {
    private final int id;
    private int score;
    private Boolean draw,play; 
    private String name;
    private Easel easel;
    private Token select;
    
    public Player(int id,String name,Sackcloth sackcloth) {
        this.id = id;
        this.name = name;
        this.easel = new Easel(sackcloth);
        draw = false;
        play = false;
        score = 0;
        select = null;
    }

    public Boolean getDraw() {
        return draw;
    }

    public void setDraw(Boolean draw) {
        this.draw = draw;
    }

    public Boolean getPlay() {
        return play;
    }

    public void setPlay(Boolean play) {
        this.play = play;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Easel getEasel() {
        return easel;
    }

    public void setEasel(Easel easel) {
        this.easel = easel;
    }

    public Token getSelect() {
        return select;
    }

    public void setSelect(Token select) {
        this.select = select;
    }
    
    //dans le PackageController ?
    abstract public void Play();
}
