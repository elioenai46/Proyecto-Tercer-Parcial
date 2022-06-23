/*
Autor: Salvador Elioenai Antonio Pérez. 
Fecha de Creacion: 05 de Junio del 2022.
Fecha de Actualizacion: 19 de Junio del 2022.
Descripción: JFrame JugadorX donde registraremos al jugador x, despues nos vamos
a la clase Avatares x.
 */
package Pojo;

import javax.swing.JOptionPane;

public class JugadorX extends javax.swing.JFrame {

    /*
        Esta variable nos ayudara a guardar el nombre del jugador x,
        sera de tipo publico ya que estaremos pasando la informacion por
        las clases.
     */
    public static String jugadorx = "";

    public JugadorX() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Confirmar = new javax.swing.JButton();
        NombreX = new javax.swing.JTextField();
        AvisoX = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Confirmar.setBackground(new java.awt.Color(0, 0, 0));
        Confirmar.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/confirmar (2).png"))); // NOI18N
        Confirmar.setText("Confirmar");
        Confirmar.setBorder(null);
        Confirmar.setBorderPainted(false);
        Confirmar.setContentAreaFilled(false);
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 180, 40));

        NombreX.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        NombreX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreXActionPerformed(evt);
            }
        });
        jPanel1.add(NombreX, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 250, 40));

        AvisoX.setBackground(new java.awt.Color(0, 0, 0));
        AvisoX.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        AvisoX.setForeground(new java.awt.Color(255, 255, 255));
        AvisoX.setText("Jugador X");
        AvisoX.setBorder(null);
        AvisoX.setBorderPainted(false);
        AvisoX.setContentAreaFilled(false);
        AvisoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvisoXActionPerformed(evt);
            }
        });
        jPanel1.add(AvisoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 130, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 180, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/sci-fi-futuristic-user-interface-hud-template-frame-design-technology-abstract-background-vector_1.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Enviamos el nombre del jugador x a el siguiente JFrame ( AvataresX )
     */
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        if (NombreX.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Necesitas registrarte para Jugar", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            jugadorx = NombreX.getText();
            AvataresX saltar = new AvataresX(jugadorx);
            saltar.setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void NombreXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreXActionPerformed

    }//GEN-LAST:event_NombreXActionPerformed

    private void AvisoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvisoXActionPerformed

    }//GEN-LAST:event_AvisoXActionPerformed

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
            java.util.logging.Logger.getLogger(JugadorX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugadorX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugadorX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugadorX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugadorX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvisoX;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField NombreX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

}
