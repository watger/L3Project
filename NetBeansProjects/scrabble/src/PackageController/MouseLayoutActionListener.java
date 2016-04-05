/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author pardojeremie
 */
public class MouseLayoutActionListener implements MouseListener{
    private int width, height;
    private JPanel listenedComponent;
    
    public MouseLayoutActionListener (JPanel listenedComponent,int height,int width) {
         this.width = width;
         this.height = height;
         this.listenedComponent = listenedComponent;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("x:"+e.getX()+" y:"+e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("case: ("+e.getX()*width/listenedComponent.getWidth()+","+e.getY()*height/listenedComponent.getHeight()+")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        }

    @Override
    public void mouseExited(MouseEvent e) {
        }

}
