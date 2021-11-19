/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;

import Capa_Logica_Negocios.*;
import static Capa_Vista.FrmVentana_InicioSesion.cont;
import static Capa_Vista.FrmVentana_InicioSesion.usuarioInicicioSesion;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class FrmVentana_Perfil extends javax.swing.JFrame {
    public static Usuario usuarioAux=null;
    public static int contPerfil=0;
    public Usuario_Perfil perfil1=null,perfil2=null,perfil3=null,perfil4=null,perfil5=null;
    private ArrayList <String> nomPerfil;
    
    
    /**
     * Creates new form FrmVentana_Perfil
     */
    public FrmVentana_Perfil() {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        this.jPanelPerfiles.setBackground(new Color(222,222,222,190));
        this.setSize(new Dimension(900,580));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.nomPerfil= new ArrayList();
    }
    public FrmVentana_Perfil(Usuario usuarioAuxp, int contPerfilp) {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        this.jPanelPerfiles.setBackground(new Color(222,222,222,190));
        this.setSize(new Dimension(900,580));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.usuarioAux= usuarioAuxp;
        this.contPerfil=contPerfilp;
        this.nomPerfil= new ArrayList();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPerfiles = new javax.swing.JPanel();
        jBtnPerfil4 = new javax.swing.JButton();
        jBtnPerfil1 = new javax.swing.JButton();
        jBtnPerfil2 = new javax.swing.JButton();
        jBtnPerfil3 = new javax.swing.JButton();
        jBtnPerfil5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnBotonAtras = new javax.swing.JButton();
        jLblFondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanelPerfiles.setBackground(new java.awt.Color(102, 102, 102));

        jBtnPerfil4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnPerfil4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPerfil4ActionPerformed(evt);
            }
        });

        jBtnPerfil1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnPerfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPerfil1ActionPerformed(evt);
            }
        });

        jBtnPerfil2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnPerfil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPerfil2ActionPerformed(evt);
            }
        });

        jBtnPerfil3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnPerfil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPerfil3ActionPerformed(evt);
            }
        });

        jBtnPerfil5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnPerfil5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPerfil5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Favor seleccionar un perfil disponible:");

        jBtnBotonAtras.setText("Atras");
        jBtnBotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBotonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPerfilesLayout = new javax.swing.GroupLayout(jPanelPerfiles);
        jPanelPerfiles.setLayout(jPanelPerfilesLayout);
        jPanelPerfilesLayout.setHorizontalGroup(
            jPanelPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPerfilesLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPerfilesLayout.createSequentialGroup()
                        .addGroup(jPanelPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnBotonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(jBtnPerfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jBtnPerfil3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jBtnPerfil4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jBtnPerfil5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanelPerfilesLayout.setVerticalGroup(
            jPanelPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanelPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPerfil3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPerfil4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPerfil5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPerfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jBtnBotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanelPerfiles);
        jPanelPerfiles.setBounds(80, 90, 730, 380);

        jLblFondoPantalla.setBackground(new java.awt.Color(153, 153, 153));
        jLblFondoPantalla.setForeground(new java.awt.Color(153, 153, 153));
        jLblFondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Pantalla_Ventanas/fondoPerfiles.jpg"))); // NOI18N
        getContentPane().add(jLblFondoPantalla);
        jLblFondoPantalla.setBounds(-10, -500, 930, 1100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Botones que se encargan de mandar al menu de opciones el usuario y perfil correspondiente ( SON 5 PERFILES COMO MAXIMO )
    
    //perfil 1
    private void jBtnPerfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPerfil1ActionPerformed
        // Manda el usuario correspondiente a la siguiente ventana, ysobre el cual se le asignaran las compras
        FrmVentana_MenuOpcion menu = new FrmVentana_MenuOpcion(usuarioAux, perfil1);
                     menu.setLocationRelativeTo(null);
                     menu.setVisible(true);
    }//GEN-LAST:event_jBtnPerfil1ActionPerformed
    //perfil 2
    private void jBtnPerfil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPerfil2ActionPerformed
        // Manda el usuario correspondiente a la siguiente ventana, ysobre el cual se le asignaran las compras:
        FrmVentana_MenuOpcion menu = new FrmVentana_MenuOpcion(usuarioAux, perfil2);
                     menu.setLocationRelativeTo(null);
                     menu.setVisible(true);
    }//GEN-LAST:event_jBtnPerfil2ActionPerformed
    //perfil 3
    private void jBtnPerfil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPerfil3ActionPerformed
       // Manda el usuario correspondiente a la siguiente ventana, ysobre el cual se le asignaran las compras
       FrmVentana_MenuOpcion menu = new FrmVentana_MenuOpcion(usuarioAux, perfil3);
                     menu.setLocationRelativeTo(null);
                     menu.setVisible(true);
    }//GEN-LAST:event_jBtnPerfil3ActionPerformed
    //perfil 4
    private void jBtnPerfil4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPerfil4ActionPerformed
        // Manda el usuario correspondiente a la siguiente ventana, ysobre el cual se le asignaran las compras
        FrmVentana_MenuOpcion menu = new FrmVentana_MenuOpcion(usuarioAux, perfil4);
                     menu.setLocationRelativeTo(null);
                     menu.setVisible(true);
    }//GEN-LAST:event_jBtnPerfil4ActionPerformed
    //perfil 5
    private void jBtnPerfil5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPerfil5ActionPerformed
        // Manda el usuario correspondiente a la siguiente ventana, ysobre el cual se le asignaran las compras
        FrmVentana_MenuOpcion menu = new FrmVentana_MenuOpcion(usuarioAux, perfil5);
                     menu.setLocationRelativeTo(null);
                     menu.setVisible(true);
    }//GEN-LAST:event_jBtnPerfil5ActionPerformed

    
    
    // boton que me lleva a la pantalla de inicio de sesion
    private void jBtnBotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBotonAtrasActionPerformed
        // Vuelve a la ventana anterior
        this.dispose();
        FrmVentana_InicioSesion frm = new FrmVentana_InicioSesion();
        frm.setVisible(true);
    }//GEN-LAST:event_jBtnBotonAtrasActionPerformed

    // cuando se habra la ventana se va cargar y activar los botones de acuerdo a los perfiles asociados
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // activacion de perfiles
        this.llenaArrayPerfil();
        this.activaBtoPerfiles();
        this.asigNombrePerfil(); 
        
    }//GEN-LAST:event_formWindowOpened

    
    
    
    // METODOS QUE SE EJECUTAN CUANDO SE ACTIVA LA VENTANA(SE HABRE)
    private void asigNombrePerfil(){
         if(contPerfil==0){
            this.jBtnPerfil1.setText(nomPerfil.get(0));
            this.perfil1=usuarioAux.getArrayPerfiles().get(0);
        }
         if(contPerfil==1){
            this.jBtnPerfil1.setText(nomPerfil.get(0));
            this.jBtnPerfil2.setText(nomPerfil.get(1));
              this.perfil1=usuarioAux.getArrayPerfiles().get(0);
                this.perfil2=usuarioAux.getArrayPerfiles().get(1);
        }
          if(contPerfil==2){
            this.jBtnPerfil1.setText(nomPerfil.get(0));
            this.jBtnPerfil2.setText(nomPerfil.get(1));
            this.jBtnPerfil3.setText(nomPerfil.get(2));
             this.perfil1=usuarioAux.getArrayPerfiles().get(0);
                this.perfil2=usuarioAux.getArrayPerfiles().get(1);
                  this.perfil3=usuarioAux.getArrayPerfiles().get(2);
        }
           if(contPerfil==3){
            this.jBtnPerfil1.setText(nomPerfil.get(0));
            this.jBtnPerfil2.setText(nomPerfil.get(1));
            this.jBtnPerfil3.setText(nomPerfil.get(2));
            this.jBtnPerfil4.setText(nomPerfil.get(3));
             this.perfil1=usuarioAux.getArrayPerfiles().get(0);
                this.perfil2=usuarioAux.getArrayPerfiles().get(1);
                  this.perfil3=usuarioAux.getArrayPerfiles().get(2);
                    this.perfil4=usuarioAux.getArrayPerfiles().get(3);
        }
         if(contPerfil==4){
            this.jBtnPerfil1.setText(nomPerfil.get(0));
            this.jBtnPerfil2.setText(nomPerfil.get(1));
            this.jBtnPerfil3.setText(nomPerfil.get(2));
            this.jBtnPerfil4.setText(nomPerfil.get(3));
            this.jBtnPerfil5.setText(nomPerfil.get(4));
             this.perfil1=usuarioAux.getArrayPerfiles().get(0);
                this.perfil2=usuarioAux.getArrayPerfiles().get(1);
                  this.perfil3=usuarioAux.getArrayPerfiles().get(2);
                    this.perfil4=usuarioAux.getArrayPerfiles().get(3);
                      this.perfil5=usuarioAux.getArrayPerfiles().get(4);
        }
    }
    private void activaBtoPerfiles(){
          if(contPerfil==0){
            this.jBtnPerfil1.setEnabled(true);
            this.jBtnPerfil2.setEnabled(false);
            this.jBtnPerfil3.setEnabled(false);
            this.jBtnPerfil4.setEnabled(false);
            this.jBtnPerfil5.setEnabled(false);
        }
         if(contPerfil==1){
            this.jBtnPerfil1.setEnabled(true);
            this.jBtnPerfil2.setEnabled(true);
            this.jBtnPerfil3.setEnabled(false);
            this.jBtnPerfil4.setEnabled(false);
            this.jBtnPerfil5.setEnabled(false);
        }
          if(contPerfil==2){
            this.jBtnPerfil1.setEnabled(true);
            this.jBtnPerfil2.setEnabled(true);
            this.jBtnPerfil3.setEnabled(true);
            this.jBtnPerfil4.setEnabled(false);
            this.jBtnPerfil5.setEnabled(false);
        }
           if(contPerfil==3){
            this.jBtnPerfil1.setEnabled(true);
            this.jBtnPerfil2.setEnabled(true);
            this.jBtnPerfil3.setEnabled(true);
            this.jBtnPerfil4.setEnabled(true);
            this.jBtnPerfil5.setEnabled(false);
        }
         if(contPerfil==4){
            this.jBtnPerfil1.setEnabled(true);
            this.jBtnPerfil2.setEnabled(true);
            this.jBtnPerfil3.setEnabled(true);
            this.jBtnPerfil4.setEnabled(true);
            this.jBtnPerfil5.setEnabled(true);
        }
    }
    private void llenaArrayPerfil(){
        for (Usuario_Perfil nombre : usuarioAux.getArrayPerfiles() ){
            nomPerfil.add(nombre.getNombre());
        }
    }

    
    
    
    
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
            java.util.logging.Logger.getLogger(FrmVentana_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentana_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentana_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentana_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentana_Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBotonAtras;
    private javax.swing.JButton jBtnPerfil1;
    private javax.swing.JButton jBtnPerfil2;
    private javax.swing.JButton jBtnPerfil3;
    private javax.swing.JButton jBtnPerfil4;
    private javax.swing.JButton jBtnPerfil5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblFondoPantalla;
    private javax.swing.JPanel jPanelPerfiles;
    // End of variables declaration//GEN-END:variables
}
