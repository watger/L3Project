/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

import PackageModel.Easel;

/**
 *
 * @author pardojeremie
 */
public class Human extends Player{
    
    public Human(int id, String name,Sackcloth sackcloth) {
        super(id, name, sackcloth);
    }

    @Override
    public void Play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
