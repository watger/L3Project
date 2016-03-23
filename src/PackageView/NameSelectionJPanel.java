/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageView;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class NameSelectionJPanel extends JPanel {
    private JTextField nameTextField;
    private JComboBox typeComboBox;
    private static int i = 0;
    
    public NameSelectionJPanel() {
        //JLabel Constructor
        super();
    
        nameTextField = new JTextField("Player "+i);
        typeComboBox = new JComboBox();
        typeComboBox.addItem("Player");
        if(i>0) {
            typeComboBox.addItem("Computer");
            if(i>1)
                typeComboBox.addItem("Null");
        }
    
        this.add(nameTextField);
        this.add(typeComboBox);
    
        i++;
    }
    
    public String getComboBoxItem() {
        return (String) typeComboBox.getSelectedItem();
    }
    
     public String getTextFieldString() {
        return nameTextField.getText();
    }
}
