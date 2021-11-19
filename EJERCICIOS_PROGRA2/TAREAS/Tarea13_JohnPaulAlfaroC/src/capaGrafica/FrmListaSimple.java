
package capaGrafica;

import estructuras.ListaSimple;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class FrmListaSimple extends javax.swing.JFrame {

   private ListaSimple lista;
    public FrmListaSimple() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtDato = new javax.swing.JTextField();
        jTxtPosicion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaLista = new javax.swing.JTextArea();
        jBtnInsertarFinal = new javax.swing.JButton();
        jBtnInsertarMedio = new javax.swing.JButton();
        jBtnInsertarInicio = new javax.swing.JButton();
        jBtnEliminarInicio = new javax.swing.JButton();
        jBtnEliminarFinal = new javax.swing.JButton();
        jBtnEliminarMedio = new javax.swing.JButton();
        jBtnLongitudLista = new javax.swing.JButton();
        jBtnOrdenarLista = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Dato");

        jLabel2.setText("Posición");

        jLabel4.setText("Lista");

        jTxtDato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtDatoFocusGained(evt);
            }
        });

        jTxtPosicion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtPosicionFocusGained(evt);
            }
        });

        jTxaLista.setColumns(20);
        jTxaLista.setRows(5);
        jScrollPane1.setViewportView(jTxaLista);

        jBtnInsertarFinal.setText("Insertar al final");
        jBtnInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInsertarFinalActionPerformed(evt);
            }
        });

        jBtnInsertarMedio.setText("Insertar en el medio");
        jBtnInsertarMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInsertarMedioActionPerformed(evt);
            }
        });

        jBtnInsertarInicio.setText("Insertar al inicio");
        jBtnInsertarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInsertarInicioActionPerformed(evt);
            }
        });

        jBtnEliminarInicio.setText("Eliminar al inicio");
        jBtnEliminarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarInicioActionPerformed(evt);
            }
        });

        jBtnEliminarFinal.setText("Eliminar al final");
        jBtnEliminarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarFinalActionPerformed(evt);
            }
        });

        jBtnEliminarMedio.setText("Eliminar en el medio");
        jBtnEliminarMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarMedioActionPerformed(evt);
            }
        });

        jBtnLongitudLista.setText("Longitud Lista");
        jBtnLongitudLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLongitudListaActionPerformed(evt);
            }
        });

        jBtnOrdenarLista.setText("Ordenar Lista");
        jBtnOrdenarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOrdenarListaActionPerformed(evt);
            }
        });

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnOrdenarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtDato, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(jTxtPosicion))
                                .addGap(156, 156, 156)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnEliminarMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnEliminarFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnEliminarInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnInsertarInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnInsertarFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnInsertarMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnLongitudLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jTxtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jBtnInsertarFinal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnInsertarInicio)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jTxtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnInsertarMedio)))
                                .addGap(9, 9, 9)
                                .addComponent(jBtnEliminarInicio)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEliminarFinal)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEliminarMedio))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jBtnLongitudLista)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnOrdenarLista)
                        .addGap(69, 69, 69)
                        .addComponent(jBtnSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarInicioActionPerformed
        int dato = Integer.parseInt(  this.jTxtDato.getText());
        lista.insertarInicio(dato);
        this.jTxaLista.setText(lista.toString());
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_jBtnInsertarInicioActionPerformed
// listo
    private void jBtnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarFinalActionPerformed
        int dato = Integer.parseInt(  this.jTxtDato.getText());
        lista.insertarFinal(dato);
        this.jTxaLista.setText(lista.toString());
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_jBtnInsertarFinalActionPerformed
// listo
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.lista = new ListaSimple();
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_formWindowOpened
// listo
    private void jBtnInsertarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarMedioActionPerformed
        int posicion;
        int dato = Integer.parseInt(  this.jTxtDato.getText());
        try{
          posicion = Integer.parseInt(  this.jTxtPosicion.getText());
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null,"Debe digitar la posición donde insertará el dato");
            this.jTxtPosicion.requestFocus();
            return;
        }
        lista.insertarMedio(dato, posicion);
       
        this.jTxaLista.setText(lista.toString());
        this.jTxtPosicion.selectAll();
        this.jTxtPosicion.requestFocus();
        
    }//GEN-LAST:event_jBtnInsertarMedioActionPerformed
// listo
    private void jBtnEliminarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarInicioActionPerformed
       lista.eliminarInicio();
        this.jTxaLista.setText(lista.toString());
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_jBtnEliminarInicioActionPerformed
// listo
    private void jBtnEliminarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarFinalActionPerformed
       lista.eliminarFinal();
        this.jTxaLista.setText(lista.toString());
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_jBtnEliminarFinalActionPerformed
// FALTA HACERLO TRABAJAR CORRECTAMENTE
    private void jBtnEliminarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarMedioActionPerformed
        int valor;
        
        try{
         valor = Integer.parseInt(  this.jTxtPosicion.getText());
        
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null,"Debe digitar la posición en la que va a eliminar");
            this.jTxtPosicion.requestFocus();
            return;
        }

       lista.eliminarMedio(valor-1);
        
        
        
        this.jTxaLista.setText(lista.toString());
        this.jTxtPosicion.selectAll();
        this.jTxtPosicion.requestFocus();
        
    }//GEN-LAST:event_jBtnEliminarMedioActionPerformed

    private void jBtnLongitudListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLongitudListaActionPerformed
             JOptionPane.showMessageDialog(null,"Longitud de la lista:: "+lista.longitudLista());
    }//GEN-LAST:event_jBtnLongitudListaActionPerformed

    private void jBtnOrdenarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOrdenarListaActionPerformed
       //Invoca el método ordenar lista y muestra el toString() de la misma
       lista.ordenarLista();
        this.jTxaLista.setText(lista.toString());    
    }//GEN-LAST:event_jBtnOrdenarListaActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jTxtDatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtDatoFocusGained
         this.jTxtDato.selectAll();
    }//GEN-LAST:event_jTxtDatoFocusGained

    private void jTxtPosicionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtPosicionFocusGained
         this.jTxtPosicion.selectAll();
    }//GEN-LAST:event_jTxtPosicionFocusGained

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminarFinal;
    private javax.swing.JButton jBtnEliminarInicio;
    private javax.swing.JButton jBtnEliminarMedio;
    private javax.swing.JButton jBtnInsertarFinal;
    private javax.swing.JButton jBtnInsertarInicio;
    private javax.swing.JButton jBtnInsertarMedio;
    private javax.swing.JButton jBtnLongitudLista;
    private javax.swing.JButton jBtnOrdenarLista;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxaLista;
    private javax.swing.JTextField jTxtDato;
    private javax.swing.JTextField jTxtPosicion;
    // End of variables declaration//GEN-END:variables
}
