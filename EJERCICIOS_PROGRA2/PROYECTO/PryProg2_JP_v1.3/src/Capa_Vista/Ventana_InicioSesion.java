/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;

import Capa_Logica_Negocios.*;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Estudiante
 */
public class Ventana_InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_InicioSesion
     */
    public Ventana_InicioSesion() {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        this.setSize(new Dimension(900,580));
        this.jPnlInicioSesion.setBackground(new Color(222,222,222,190));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlInicioSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtCorreoElectronico = new javax.swing.JTextField();
        jTxtContrasenna = new javax.swing.JPasswordField();
        jBtoEntrar = new javax.swing.JButton();
        jBtoRegistrar = new javax.swing.JButton();
        jPnlPrincipal_Fondo = new javax.swing.JPanel();
        fondo_pantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPnlInicioSesion.setBackground(new java.awt.Color(102, 102, 102));
        jPnlInicioSesion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Copperplate", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Objetos/tituloAppOficial.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Correo electronico:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        jTxtCorreoElectronico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTxtContrasenna.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTxtContrasenna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtContrasennaActionPerformed(evt);
            }
        });

        jBtoEntrar.setBackground(new java.awt.Color(51, 204, 0));
        jBtoEntrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtoEntrar.setText("ENTRAR");

        jBtoRegistrar.setBackground(new java.awt.Color(255, 204, 0));
        jBtoRegistrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtoRegistrar.setText("REGISTRAR");

        javax.swing.GroupLayout jPnlInicioSesionLayout = new javax.swing.GroupLayout(jPnlInicioSesion);
        jPnlInicioSesion.setLayout(jPnlInicioSesionLayout);
        jPnlInicioSesionLayout.setHorizontalGroup(
            jPnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlInicioSesionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnlInicioSesionLayout.createSequentialGroup()
                            .addComponent(jBtoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTxtContrasenna, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlInicioSesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPnlInicioSesionLayout.setVerticalGroup(
            jPnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlInicioSesionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPnlInicioSesion);
        jPnlInicioSesion.setBounds(244, 52, 442, 380);

        jPnlPrincipal_Fondo.setLayout(null);

        fondo_pantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Pantalla_Ventanas/Collage_Carteleras.jpg"))); // NOI18N
        jPnlPrincipal_Fondo.add(fondo_pantalla);
        fondo_pantalla.setBounds(-10, -10, 930, 590);

        getContentPane().add(jPnlPrincipal_Fondo);
        jPnlPrincipal_Fondo.setBounds(0, 0, 960, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtContrasennaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtContrasennaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtContrasennaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo_pantalla;
    private javax.swing.JButton jBtoEntrar;
    private javax.swing.JButton jBtoRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPnlInicioSesion;
    private javax.swing.JPanel jPnlPrincipal_Fondo;
    private javax.swing.JPasswordField jTxtContrasenna;
    private javax.swing.JTextField jTxtCorreoElectronico;
    // End of variables declaration//GEN-END:variables
}