/*
Autor: Salvador Elioenai Antonio Pérez. 
Fecha de Creacion: 05 de Junio del 2022.
Fecha de Actualizacion: 19 de Junio del 2022.
Descripción: JFrame AvataresO, JFrame donde el jugador o selecciona su avatar
y recibimos el nombre del jugador x, el icono del jugador x y el nombre del 
jugador o, despues nos iremos a la clase Gato donde finalmente podremos jugar.
 */
package Pojo;

import Modell.Gato;
import static Pojo.JugadorX.jugadorx;
import static Pojo.JugadorO.jugadoro;

import static Pojo.AvataresX.iconox;
import java.awt.Image;
import javax.swing.ImageIcon;

public class AvataresO extends javax.swing.JFrame {

    /*
        Esta variable nos ayudara a guardar el icono del jugador x,
        sera de tipo publico ya que estaremos pasando la informacion por
        las clases.
     */
    public static ImageIcon icono1;

    public AvataresO(String jugadorx, String jugadoro, ImageIcon iconox) {
        initComponents();
        setLocationRelativeTo(null);
    }

    /*
        Constructor vacio
     */
    public AvataresO() {

    }

    AvataresO(String jugadorx, String jugadoro, Image iconox) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AvisoX = new javax.swing.JButton();
        Avatar2 = new javax.swing.JButton();
        Avatar3 = new javax.swing.JButton();
        Avatar4 = new javax.swing.JButton();
        Avatar5 = new javax.swing.JButton();
        Avatar6 = new javax.swing.JButton();
        Avatar7 = new javax.swing.JButton();
        Avatar8 = new javax.swing.JButton();
        Avatar1 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AvisoX.setBackground(new java.awt.Color(0, 0, 0));
        AvisoX.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        AvisoX.setForeground(new java.awt.Color(255, 255, 255));
        AvisoX.setText("ELIGE TU AVATAR");
        AvisoX.setBorder(null);
        AvisoX.setBorderPainted(false);
        AvisoX.setContentAreaFilled(false);
        AvisoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvisoXActionPerformed(evt);
            }
        });
        jPanel1.add(AvisoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 360, 50));

        Avatar2.setBackground(new java.awt.Color(255, 255, 255));
        Avatar2.setForeground(new java.awt.Color(255, 255, 255));
        Avatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/2.png"))); // NOI18N
        Avatar2.setText("jButton1");
        Avatar2.setBorder(null);
        Avatar2.setBorderPainted(false);
        Avatar2.setContentAreaFilled(false);
        Avatar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Avatar2ActionPerformed(evt);
            }
        });
        jPanel1.add(Avatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 160, 170));

        Avatar3.setBackground(new java.awt.Color(255, 255, 255));
        Avatar3.setForeground(new java.awt.Color(255, 255, 255));
        Avatar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/3.png"))); // NOI18N
        Avatar3.setText("jButton1");
        Avatar3.setBorder(null);
        Avatar3.setBorderPainted(false);
        Avatar3.setContentAreaFilled(false);
        Avatar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Avatar3ActionPerformed(evt);
            }
        });
        jPanel1.add(Avatar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 170, 150));

        Avatar4.setBackground(new java.awt.Color(255, 255, 255));
        Avatar4.setForeground(new java.awt.Color(255, 255, 255));
        Avatar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/4.png"))); // NOI18N
        Avatar4.setText("jButton1");
        Avatar4.setBorder(null);
        Avatar4.setBorderPainted(false);
        Avatar4.setContentAreaFilled(false);
        Avatar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Avatar4ActionPerformed(evt);
            }
        });
        jPanel1.add(Avatar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 180, 150));

        Avatar5.setBackground(new java.awt.Color(255, 255, 255));
        Avatar5.setForeground(new java.awt.Color(255, 255, 255));
        Avatar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/5.png"))); // NOI18N
        Avatar5.setText("jButton1");
        Avatar5.setBorder(null);
        Avatar5.setBorderPainted(false);
        Avatar5.setContentAreaFilled(false);
        Avatar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Avatar5ActionPerformed(evt);
            }
        });
        jPanel1.add(Avatar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 190, 140));

        Avatar6.setBackground(new java.awt.Color(255, 255, 255));
        Avatar6.setForeground(new java.awt.Color(255, 255, 255));
        Avatar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/6.png"))); // NOI18N
        Avatar6.setText("jButton1");
        Avatar6.setBorder(null);
        Avatar6.setBorderPainted(false);
        Avatar6.setContentAreaFilled(false);
        Avatar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Avatar6ActionPerformed(evt);
            }
        });
        jPanel1.add(Avatar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 140, 140));

        Avatar7.setBackground(new java.awt.Color(255, 255, 255));
        Avatar7.setForeground(new java.awt.Color(255, 255, 255));
        Avatar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/7.png"))); // NOI18N
        Avatar7.setText("jButton1");
        Avatar7.setBorder(null);
        Avatar7.setBorderPainted(false);
        Avatar7.setContentAreaFilled(false);
        Avatar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Avatar7ActionPerformed(evt);
            }
        });
        jPanel1.add(Avatar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 170, 140));

        Avatar8.setBackground(new java.awt.Color(255, 255, 255));
        Avatar8.setForeground(new java.awt.Color(255, 255, 255));
        Avatar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/8.png"))); // NOI18N
        Avatar8.setText("jButton1");
        Avatar8.setBorder(null);
        Avatar8.setBorderPainted(false);
        Avatar8.setContentAreaFilled(false);
        Avatar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Avatar8ActionPerformed(evt);
            }
        });
        jPanel1.add(Avatar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 170, 140));

        Avatar1.setBackground(new java.awt.Color(255, 255, 255));
        Avatar1.setForeground(new java.awt.Color(255, 255, 255));
        Avatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/1.png"))); // NOI18N
        Avatar1.setText("jButton1");
        Avatar1.setBorder(null);
        Avatar1.setBorderPainted(false);
        Avatar1.setContentAreaFilled(false);
        Avatar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Avatar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Avatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 150, 140));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 180, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Este si.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvisoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvisoXActionPerformed

    }//GEN-LAST:event_AvisoXActionPerformed
    /*
        Dentro de este boton se guarda la direccion de una imagen, se mostrara 
        en el JFrame donde se jugara en caso de que el jugador seleccione ese
        Avatar, se hace una instancia a la siguiente clase (Gato) y le 
        enviamos el nombre del jugador x y su icono, el nombre del jugador o
        y su icono.
     */
    private void Avatar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Avatar6ActionPerformed
        icono1 = new ImageIcon("/home/labso04/Vídeos/respaldo/ParadigmasDeProgramacion/src/Media/6.png");
        Gato saltar = new Gato(jugadorx, jugadoro, iconox, icono1);
        saltar.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Avatar6ActionPerformed
    /*
        Dentro de este boton se guarda la direccion de una imagen, se mostrara 
        en el JFrame donde se jugara en caso de que el jugador seleccione ese
        Avatar, se hace una instancia a la siguiente clase (Gato) y le 
        enviamos el nombre del jugador x y su icono, el nombre del jugador o
        y su icono.
     */
    private void Avatar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Avatar1ActionPerformed
        icono1 = new ImageIcon("/home/labso04/Vídeos/respaldo/ParadigmasDeProgramacion/src/Media/1.png");
        Gato saltar = new Gato(jugadorx, jugadoro, iconox, icono1);
        saltar.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Avatar1ActionPerformed
    /*
        Dentro de este boton se guarda la direccion de una imagen, se mostrara 
        en el JFrame donde se jugara en caso de que el jugador seleccione ese
        Avatar, se hace una instancia a la siguiente clase (Gato) y le 
        enviamos el nombre del jugador x y su icono, el nombre del jugador o
        y su icono.
     */
    private void Avatar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Avatar2ActionPerformed
        icono1 = new ImageIcon("/home/labso04/Vídeos/respaldo/ParadigmasDeProgramacion/src/Media/2.png");
        Gato saltar = new Gato(jugadorx, jugadoro, iconox, icono1);
        saltar.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Avatar2ActionPerformed
    /*
        Dentro de este boton se guarda la direccion de una imagen, se mostrara 
        en el JFrame donde se jugara en caso de que el jugador seleccione ese
        Avatar, se hace una instancia a la siguiente clase (Gato) y le 
        enviamos el nombre del jugador x y su icono, el nombre del jugador o
        y su icono.
     */
    private void Avatar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Avatar3ActionPerformed
        icono1 = new ImageIcon("/home/labso04/Vídeos/respaldo/ParadigmasDeProgramacion/src/Media/3.png");
        Gato saltar = new Gato(jugadorx, jugadoro, iconox, icono1);
        saltar.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Avatar3ActionPerformed
    /*
        Dentro de este boton se guarda la direccion de una imagen, se mostrara 
        en el JFrame donde se jugara en caso de que el jugador seleccione ese
        Avatar, se hace una instancia a la siguiente clase (Gato) y le 
        enviamos el nombre del jugador x y su icono, el nombre del jugador o
        y su icono.
     */
    private void Avatar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Avatar4ActionPerformed
        icono1 = new ImageIcon("/home/labso04/Vídeos/respaldo/ParadigmasDeProgramacion/src/Media/4.png");
        Gato saltar = new Gato(jugadorx, jugadoro, iconox, icono1);
        saltar.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Avatar4ActionPerformed

    private void Avatar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Avatar5ActionPerformed
        icono1 = new ImageIcon("/home/labso04/Vídeos/respaldo/ParadigmasDeProgramacion/src/Media/5.png");
        Gato saltar = new Gato(jugadorx, jugadoro, iconox, icono1);
        saltar.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Avatar5ActionPerformed
    /*
        Dentro de este boton se guarda la direccion de una imagen, se mostrara 
        en el JFrame donde se jugara en caso de que el jugador seleccione ese
        Avatar, se hace una instancia a la siguiente clase (Gato) y le 
        enviamos el nombre del jugador x y su icono, el nombre del jugador o
        y su icono.
     */
    private void Avatar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Avatar7ActionPerformed
        icono1 = new ImageIcon("/home/labso04/Vídeos/respaldo/ParadigmasDeProgramacion/src/Media/7.png");
        Gato saltar = new Gato(jugadorx, jugadoro, iconox, icono1);
        saltar.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Avatar7ActionPerformed
    /*
        Dentro de este boton se guarda la direccion de una imagen, se mostrara 
        en el JFrame donde se jugara en caso de que el jugador seleccione ese
        Avatar, se hace una instancia a la siguiente clase (Gato) y le 
        enviamos el nombre del jugador x y su icono, el nombre del jugador o
        y su icono.
     */
    private void Avatar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Avatar8ActionPerformed
        icono1 = new ImageIcon("/home/labso04/Vídeos/respaldo/ParadigmasDeProgramacion/src/Media/8.png");
        Gato saltar = new Gato(jugadorx, jugadoro, iconox, icono1);
        saltar.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Avatar8ActionPerformed

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
            java.util.logging.Logger.getLogger(AvataresO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvataresO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvataresO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvataresO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvataresO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avatar1;
    private javax.swing.JButton Avatar2;
    private javax.swing.JButton Avatar3;
    private javax.swing.JButton Avatar4;
    private javax.swing.JButton Avatar5;
    private javax.swing.JButton Avatar6;
    private javax.swing.JButton Avatar7;
    private javax.swing.JButton Avatar8;
    private javax.swing.JButton AvisoX;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
