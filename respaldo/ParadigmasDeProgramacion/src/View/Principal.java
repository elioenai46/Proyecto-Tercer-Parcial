/*
Autor: Salvador Elioenai Antonio Pérez. 
Fecha de Creacion: 05 de Junio del 2022.
Fecha de Actualizacion: 19 de Junio del 2022.
Descripción: JFrame Principal, es donde empezaraá el juego.
 */
package View;

import Pojo.JugadorX;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Descripcion = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Descripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/des.png"))); // NOI18N
        jPanel1.add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 400, 230));

        Continuar.setBackground(new java.awt.Color(0, 0, 0));
        Continuar.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        Continuar.setForeground(new java.awt.Color(255, 255, 255));
        Continuar.setText("Continuar");
        Continuar.setBorder(null);
        Continuar.setBorderPainted(false);
        Continuar.setContentAreaFilled(false);
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 130, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 180, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/sci-fi-futuristic-user-interface-hud-template-frame-design-technology-abstract-background-vector_1.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Instanciamos a la clase JugadorX donde registraremos el primer jugador
     */
    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        JugadorX saltar = new JugadorX();
        saltar.setVisible(true);
        this.hide();
    }//GEN-LAST:event_ContinuarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JLabel Descripcion;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

}
