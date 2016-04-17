/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import PackageModel.Party;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author pardojeremie
 */
public class MouseLayoutActionListenerEasel  implements MouseListener{
    private Party party;
    
    public MouseLayoutActionListenerEasel (Party party) {
        this.party = party;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int i = e.getX()*party.getPlayerActual().getEasel().getEasellenght()/party.getMainJFrame().getGameMainJPanel().getEaselJPanel().getWidth();
        if (party.getPlayerActual().getEasel().GetToken(i) != null) {
            if( party.getPlayerActual().getEasel().GetToken(i).isSelect())
                    party.getPlayerActual().getEasel().GetToken(i).setSelect(false);
            else if (!party.getPlayerActual().getDraw()) {
                party.getPlayerActual().getEasel().DeselectAllToken();
                party.getPlayerActual().getEasel().GetToken(i).setSelect(true);
            }
            else
                party.getPlayerActual().getEasel().GetToken(i).setSelect(true);
            party.getMainJFrame().getGameMainJPanel().getEaselJPanel().SetAllIconJLabel(party.getPlayerActual().getEasel());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}