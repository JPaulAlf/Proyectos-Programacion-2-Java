/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;

import Capa_Logica_Negocios.* ;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author johnpaul
 */
public class FrmVentana_MenuOpcion extends javax.swing.JFrame {
    
    public  Usuario usuarioAux=null;
    public  Usuario_Perfil perfilUsuario=null;
     
    
    /**
     * Creates new form FrmVentana_MenuOpcion
     */
    public FrmVentana_MenuOpcion() {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        this.setSize(new Dimension(900,600));
        this.jPnlIncio.setBackground(new Color(222,222,222,190));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.jBtnAdministracion.setEnabled(false);
        this.jBtnAdministracion.setVisible(false); 
    }
    public FrmVentana_MenuOpcion(Usuario usuario, Usuario_Perfil perfil) {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        this.setSize(new Dimension(900,600));
        this.jPnlIncio.setBackground(new Color(222,222,222,190));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.usuarioAux=usuario;
        this.perfilUsuario=perfil;
        
        this.jBtnAdministracion.setEnabled(false);
        this.jBtnAdministracion.setVisible(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlIncio = new javax.swing.JPanel();
        jRbdUsuarioConectado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnCalificarContenido = new javax.swing.JButton();
        jBtnDescargar = new javax.swing.JButton();
        jBtnCerrarSesion = new javax.swing.JButton();
        jBtnAdministracion = new javax.swing.JButton();
        jBtnBuscarContenido = new javax.swing.JButton();
        jLblFondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jRbdUsuarioConectado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRbdUsuarioConectado.setForeground(new java.awt.Color(0, 0, 0));
        jRbdUsuarioConectado.setSelected(true);
        jRbdUsuarioConectado.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Usuario conectado:");

        jBtnCalificarContenido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnCalificarContenido.setText("Calificar contenido");
        jBtnCalificarContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalificarContenidoActionPerformed(evt);
            }
        });

        jBtnDescargar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnDescargar.setText("Descargar");
        jBtnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDescargarActionPerformed(evt);
            }
        });

        jBtnCerrarSesion.setText("Cerrar sesion");
        jBtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarSesionActionPerformed(evt);
            }
        });

        jBtnAdministracion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnAdministracion.setText("ADMINISTRACION");
        jBtnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdministracionActionPerformed(evt);
            }
        });

        jBtnBuscarContenido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnBuscarContenido.setText("Buscar Contenido");
        jBtnBuscarContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarContenidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlIncioLayout = new javax.swing.GroupLayout(jPnlIncio);
        jPnlIncio.setLayout(jPnlIncioLayout);
        jPnlIncioLayout.setHorizontalGroup(
            jPnlIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlIncioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPnlIncioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPnlIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlIncioLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                        .addContainerGap(265, Short.MAX_VALUE))
                    .addGroup(jPnlIncioLayout.createSequentialGroup()
                        .addComponent(jRbdUsuarioConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPnlIncioLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(jPnlIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnBuscarContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addGroup(jPnlIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBtnCalificarContenido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                        .addComponent(jBtnDescargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                        .addComponent(jBtnAdministracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlIncioLayout.setVerticalGroup(
            jPnlIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlIncioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRbdUsuarioConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBtnBuscarContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnCalificarContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jBtnCerrarSesion)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPnlIncio);
        jPnlIncio.setBounds(30, 40, 840, 500);

        jLblFondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Pantalla_Ventanas/FondoMenuIncio.jpg"))); // NOI18N
        getContentPane().add(jLblFondoPantalla);
        jLblFondoPantalla.setBounds(-10, -30, 940, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Acciones que se ejecutan al abrir la ventan       
        // Da nombre del usuario conectado en el momento en la pantalla
 this.jRbdUsuarioConectado.setText("Online: [ Cuenta: "+usuarioAux.getNombre()+" / Perfil: "+perfilUsuario.getNombre()+" ]");
        
 
        if(usuarioAux instanceof UsuarioAdministrativo){
            this.jBtnAdministracion.setEnabled(true);
            this.jBtnAdministracion.setVisible(true);
        }
     
    }//GEN-LAST:event_formWindowOpened

    private void jBtnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDescargarActionPerformed
        this.dispose();
        FrmVentana_DescargaContenido frm= new FrmVentana_DescargaContenido(usuarioAux, perfilUsuario);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_jBtnDescargarActionPerformed

    private void jBtnCalificarContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalificarContenidoActionPerformed
        this.dispose();
        FrmVentana_CalificarContenido frm = new FrmVentana_CalificarContenido(usuarioAux, perfilUsuario);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_jBtnCalificarContenidoActionPerformed

    private void jBtnAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdministracionActionPerformed
        this.dispose();
        FrmVentana_Admin frm = new FrmVentana_Admin(usuarioAux, perfilUsuario);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_jBtnAdministracionActionPerformed

    private void jBtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarSesionActionPerformed
        this.dispose();
        FrmVentana_InicioSesion frm = new FrmVentana_InicioSesion();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnCerrarSesionActionPerformed

    private void jBtnBuscarContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarContenidoActionPerformed
        this.dispose();
        FrmVentana_BuscarContenido frm = new FrmVentana_BuscarContenido(usuarioAux, perfilUsuario);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_jBtnBuscarContenidoActionPerformed

    
 
    
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
            java.util.logging.Logger.getLogger(FrmVentana_MenuOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentana_MenuOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentana_MenuOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentana_MenuOpcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentana_MenuOpcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdministracion;
    private javax.swing.JButton jBtnBuscarContenido;
    private javax.swing.JButton jBtnCalificarContenido;
    private javax.swing.JButton jBtnCerrarSesion;
    private javax.swing.JButton jBtnDescargar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblFondoPantalla;
    private javax.swing.JPanel jPnlIncio;
    private javax.swing.JRadioButton jRbdUsuarioConectado;
    // End of variables declaration//GEN-END:variables
}
