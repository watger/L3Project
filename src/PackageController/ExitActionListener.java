/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author pardojeremie
 */
public class ExitActionListener implements ActionListener{
    
    public ExitActionListener() {
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(JOptionPane.YES_OPTION == new JOptionPane().showConfirmDialog(null, " voulez-vous quitter le jeu", "EXIT", JOptionPane.YES_NO_OPTION))
        System.exit(0);
    }
}
