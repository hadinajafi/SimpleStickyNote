/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickynote;

import java.awt.ComponentOrientation;
import java.awt.Font;

/**
 *
 * @author hadi
 */
public class WriteForm extends javax.swing.JFrame {

    private FileIO f;
    private final String TEXT = "text";
    private final String WIDS = "width";
    private final String HITE = "height";

    /**
     * Creates new form WriteForm
     */
    public WriteForm() {
        initComponents();
        f = new FileIO();
        loadText();
        loadFormSize();
    }

    private void loadText() {
        String text = f.getProperty(TEXT);
        textArea.setText(text);
        //load font size
        Font font = textArea.getFont();
        try{
            float size = Float.parseFloat(f.getProperty("fontSize"));
            textArea.setFont(font.deriveFont(size));
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    private void loadFormSize() {
        try {
            int w = Integer.parseInt(f.getProperty(WIDS));
            int h = Integer.parseInt(f.getProperty(HITE));
            this.setSize(w, h);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveSize() {
        f.setProperty(WIDS, String.valueOf(this.getWidth()));
        f.setProperty(HITE, String.valueOf(this.getHeight()));
        //save font size too :)
        Font font = textArea.getFont();
        f.setProperty("fontSize", String.valueOf(font.getSize()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        zoomin = new javax.swing.JButton();
        zoomout = new javax.swing.JButton();
        ltrbtn = new javax.swing.JButton();
        rtlbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Mikhak Medium", 0, 16)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        zoomin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stickynote/+.png"))); // NOI18N
        zoomin.setToolTipText("Zoom in");
        zoomin.setBorder(new RoundedBorder(5));
        zoomin.setFocusPainted(false);
        zoomin.setFocusable(false);
        zoomin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zoominMouseClicked(evt);
            }
        });

        zoomout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stickynote/-.png"))); // NOI18N
        zoomout.setToolTipText("Zoom out");
        zoomout.setBorder(new RoundedBorder(5));
        zoomout.setFocusPainted(false);
        zoomout.setFocusable(false);
        zoomout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zoomoutMouseClicked(evt);
            }
        });

        ltrbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stickynote/ltr.png"))); // NOI18N
        ltrbtn.setToolTipText("Left to right");
        ltrbtn.setBorder(new RoundedBorder(5));
        ltrbtn.setFocusPainted(false);
        ltrbtn.setFocusable(false);
        ltrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltrbtnMouseClicked(evt);
            }
        });
        ltrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltrbtnActionPerformed(evt);
            }
        });

        rtlbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stickynote/rtl.png"))); // NOI18N
        rtlbtn.setToolTipText("Right to left");
        rtlbtn.setBorder(new RoundedBorder(5));
        rtlbtn.setFocusPainted(false);
        rtlbtn.setFocusable(false);
        rtlbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rtlbtnMouseClicked(evt);
            }
        });
        rtlbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtlbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ltrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtlbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zoomout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoomin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zoomin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zoomout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ltrbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rtlbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyPressed
        String text = textArea.getText();
        f.setProperty(TEXT, text);
//        f.setProperty(WIDS, String.valueOf(this.getWidth()));
//        f.setProperty(HITE, String.valueOf(this.getHeight()));
    }//GEN-LAST:event_textAreaKeyPressed

    private void zoominMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zoominMouseClicked
        Font font = textArea.getFont();
        float size = font.getSize() + 1.0f;
        if(size < 70)
            textArea.setFont(font.deriveFont(size));
    }//GEN-LAST:event_zoominMouseClicked

    private void zoomoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zoomoutMouseClicked
        Font font = textArea.getFont();
        float size = font.getSize() - 1.0f;
        if(size > 5)
            textArea.setFont(font.deriveFont(size));
    }//GEN-LAST:event_zoomoutMouseClicked

    private void ltrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltrbtnMouseClicked
        
    }//GEN-LAST:event_ltrbtnMouseClicked

    private void rtlbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rtlbtnMouseClicked
        
    }//GEN-LAST:event_rtlbtnMouseClicked

    private void ltrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltrbtnActionPerformed
        textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        textArea.setText(textArea.getText() + "");
    }//GEN-LAST:event_ltrbtnActionPerformed

    private void rtlbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtlbtnActionPerformed
        textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        textArea.setText(textArea.getText() + "");
    }//GEN-LAST:event_rtlbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WriteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WriteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WriteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WriteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WriteForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ltrbtn;
    private javax.swing.JButton rtlbtn;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton zoomin;
    private javax.swing.JButton zoomout;
    // End of variables declaration//GEN-END:variables
}
