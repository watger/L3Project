/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import PackageController.ChangeCardActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author pardojeremie
 */
public class RuleJPanel extends JPanel{
    private JTextArea ruleTextArea;
    private JButton menuButton;
    private JPanel cards;
    
    public RuleJPanel(JPanel cards) {
        //JLabel
        super();
        this.cards = cards;
        
        //set of the layout
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        //set of the JTextArea
        ruleTextArea = new JTextArea("REGLE SCRABBLE:\n"
                + "Le premier joueur doit obligatoirement poser le premier mot au centre du plateau, sur l’étoile. Ce mot doit être au minimum composé de 2 lettres. Le deuxième joueur doit s’appuyer sur ce mot pour placer le sien et ainsi de suite…\n"
                + "Un joueur peut échanger ses lettres par d’autres en piochant dans le sac mais cela lui fera obligatoirement passer son tour\n"
                + "\n"
                + "Le score d’un coup est calculé en additionnant la valeur de toutes les lettres des nouveaux mots formés (y compris celles déjà posées sur la grille). Si l’un des lettres du mot est sur une case bleu ciel, bleu foncé, la valeur doit être calculée. Idem pour les cases rose et rouge correspondant au mot compte double et mot compte triple.\n"
                + "A savoir que si un mot est posé sur 2 cases « compte double » ou 2 cases « compte triple », la valeur du mot est alors multipliée par 4 et par 9.\n"
                + "Attention ! Chaque case multiplicatrice ne sert qu’une fois!\n"
                + "Si l’un des joueurs arrivent à placer ses 7 lettres d’un seul coup, on dit qu’il a fait un « Scrabble« . Ce coup lui rapporte une prime de 50 points.\n"
                + "\n"
                + "Quand le sac est vide et qu’un des joueurs pose toutes ses lettres, la partie est terminée. Celui-ci prend alors en bonus la valeur des lettres des autres joueurs.\n"
                + "Alors, on fait les totaux de points de chacun des joueurs et celui possédant le plus de points gagne la partie de Scrabble.\n"
        );      
        ruleTextArea.setEditable(false); 
        ruleTextArea.setLineWrap(true);
        
        //set of the JButton
        menuButton = new JButton("MENU");
        //set of the JButton action listener
        menuButton.addActionListener(new ChangeCardActionListener(cards,"MenuJPanel"));
        
        //add of the JTextArea and JButton to the JPanel
        this.add(new JScrollPane(ruleTextArea));
        this.add(menuButton);
    }
}
