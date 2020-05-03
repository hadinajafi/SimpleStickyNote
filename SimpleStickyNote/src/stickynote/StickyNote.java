/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickynote;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author hadi
 */
public class StickyNote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WriteForm wf = new WriteForm();
        wf.setVisible(true);
        wf.setTitle("Sticky Note");
        wf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
                wf.saveSize();
            }
        });
    }

}
