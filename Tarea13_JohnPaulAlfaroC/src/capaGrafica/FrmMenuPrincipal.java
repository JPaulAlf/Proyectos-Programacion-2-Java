/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaGrafica;

/**
 *
 * @author Ana
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuSalir = new javax.swing.JMenuItem();
        jMnuEstructuras = new javax.swing.JMenu();
        jMnuListaSimple = new javax.swing.JMenuItem();
        jMnuPilas = new javax.swing.JMenuItem();
        jMnuColas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        jMnuSalir.setText("Salir");
        jMnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuSalir);

        jMenuBar1.add(jMenu1);

        jMnuEstructuras.setText("Estructuras");

        jMnuListaSimple.setText("Listas Simples");
        jMnuListaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuListaSimpleActionPerformed(evt);
            }
        });
        jMnuEstructuras.add(jMnuListaSimple);

        jMnuPilas.setText("Pilas");
        jMnuPilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuPilasActionPerformed(evt);
            }
        });
        jMnuEstructuras.add(jMnuPilas);

        jMnuColas.setText("Colas");
        jMnuColas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuColasActionPerformed(evt);
            }
        });
        jMnuEstructuras.add(jMnuColas);

        jMenuBar1.add(jMnuEstructuras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuColasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuColasActionPerformed
       FrmCola frame = new FrmCola();
       frame.setVisible(true);
       frame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMnuColasActionPerformed

    private void jMnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMnuSalirActionPerformed

    private void jMnuListaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuListaSimpleActionPerformed
       FrmListaSimple frame = new FrmListaSimple();
       frame.setVisible(true);
       frame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMnuListaSimpleActionPerformed

    private void jMnuPilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuPilasActionPerformed
       FrmPila frame = new FrmPila();
       frame.setVisible(true);
       frame.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMnuPilasActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuColas;
    private javax.swing.JMenu jMnuEstructuras;
    private javax.swing.JMenuItem jMnuListaSimple;
    private javax.swing.JMenuItem jMnuPilas;
    private javax.swing.JMenuItem jMnuSalir;
    // End of variables declaration//GEN-END:variables
}