/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickgame;

/**
 *
 * @author Dell
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
         setVisible(true);
    setBounds(500,190,600,420);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Stencil", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/Image/zwlcm.png"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, -20, 484, 150);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/Image/@Game.png"))); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 130, 24);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/Image/zpp6.png"))); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 450, 40);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/Image/zpp7.png"))); // NOI18N
        jLabel4.setText(" ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 150, 540, 50);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/Image/zpp8.png"))); // NOI18N
        jLabel5.setText("3. NetBeans IDE 2.0 ,windows 10 ,core i3 7th gen useed");
        jLabel5.setToolTipText(" ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 200, 550, 50);

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/Image/@dev.png"))); // NOI18N
        jLabel6.setText(" ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 250, 200, 30);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/Image/zpp9.png"))); // NOI18N
        jLabel7.setText(" ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 280, 360, 40);

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/Image/zpp10.png"))); // NOI18N
        jLabel8.setText(" ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 320, 310, 50);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/back.png"))); // NOI18N
        b1.setText(" ");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b1MouseReleased(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(450, 370, 130, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\pramod25.jpg")); // NOI18N
        jLabel9.setText(" ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 600, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        // TODO add your handling code here:
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/back1.png")));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        // TODO add your handling code here:
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickgame/back.png")));
    }//GEN-LAST:event_b1MouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new OPTION().setVisible(true);
    }//GEN-LAST:event_b1MouseClicked

    private void b1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseReleased
        // TODO add your handling code here:
        audioclass ac4 = new audioclass();
        ac4.back1.play();
    }//GEN-LAST:event_b1MouseReleased

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}