/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageModel.Player;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class ScoreJPanel extends JPanel{
    
    public ScoreJPanel () {
        super();
        this.add( new JLabel("(not init)"));
        this.add( new JLabel("(not init)"));
        this.add( new JLabel("(not init)"));
        this.add( new JLabel("(not init)"));
    }
    
    public void NewScorePlayer (List<Player> listOfPlayer) {
        for (int i = 0; i < 4; i++) {
            if (i < listOfPlayer.size()) {
                JLabel temporary = (JLabel)this.getComponent(i);
                temporary.setText(listOfPlayer.get(i).getName()+": "+listOfPlayer.get(i).getScore()+" ");
            }
            else {
                JLabel temporary = (JLabel)this.getComponent(i);
                temporary.setText("");
            }
        }
    }
    
    /*public void ChangeScoreAt(String name, int score) {
        for (int i = 0; i < this.playerName.size(); i++)
            if(this.playerName.get(i).equals(name))
                scorePlayer.get(i).setText(this.playerName.get(i)+": "+score+" ");
    }*/
}
