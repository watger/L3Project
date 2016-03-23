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
public class Dictionary {
    private ArrayList<ArrayList<String>> ListWords;
    
    public Dictionary() {
        ListWords = new ArrayList<ArrayList<String>>();
    }   

    public ArrayList<ArrayList<String>> getListWords() {
        return ListWords;
    }

    public void setListWords(ArrayList<ArrayList<String>> ListWords) {
        this.ListWords = ListWords;
    }
}
