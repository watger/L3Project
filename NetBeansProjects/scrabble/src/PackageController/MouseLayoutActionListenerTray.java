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
public class MouseLayoutActionListenerTray implements MouseListener{
    private Party party;
            
    
    public MouseLayoutActionListenerTray (Party party) {
         this.party = party;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!party.getPlayerActual().getDraw() && party.getTray().setTokenFrames(party,e.getY()*party.getTray().GetTrayHeight()/party.getMainJFrame().getGameMainJPanel().getTrayJPanel().getHeight(), e.getX()*party.getTray().GetTrayWidth()/party.getMainJFrame().getGameMainJPanel().getTrayJPanel().getWidth())) {
            party.getPlayerActual().setPlay(true); 
            party.getMainJFrame().getGameMainJPanel().getDrawButton().setEnabled(false);
        }
        party.getMainJFrame().getGameMainJPanel().getEaselJPanel().SetAllIconJLabel(party.getPlayerActual().getEasel());
        party.getMainJFrame().getGameMainJPanel().getTrayJPanel().UpdateIconJLabel();
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
