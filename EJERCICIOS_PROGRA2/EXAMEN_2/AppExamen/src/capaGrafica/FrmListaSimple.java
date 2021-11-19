
package capaGrafica;

import estructuras.ListaSimple;
import estructuras.Recursividad;
import java.awt.event.KeyEvent;

public class FrmListaSimple extends javax.swing.JFrame {
  
    ListaSimple lista;
 
    public FrmListaSimple() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaResultado = new javax.swing.JTextArea();
        jBtnMayorDiferencia = new javax.swing.JButton();
        jBtnBuscarNumero = new javax.swing.JButton();
        jBtnLlenarLista = new javax.swing.JButton();
        jBtnDuplicarNodos = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jBtnSumaNumeros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("N");

        jLabel4.setText("Lista");

        jTxtN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtNKeyPressed(evt);
            }
        });

        jTxaResultado.setColumns(20);
        jTxaResultado.setRows(5);
        jScrollPane1.setViewportView(jTxaResultado);

        jBtnMayorDiferencia.setText("Mayor diferencia");
        jBtnMayorDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMayorDiferenciaActionPerformed(evt);
            }
        });

        jBtnBuscarNumero.setText("Buscar Número");
        jBtnBuscarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarNumeroActionPerformed(evt);
            }
        });

        jBtnLlenarLista.setText("Llenar Lista");
        jBtnLlenarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLlenarListaActionPerformed(evt);
            }
        });

        jBtnDuplicarNodos.setText("Duplicar Nodos");
        jBtnDuplicarNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDuplicarNodosActionPerformed(evt);
            }
        });

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnSumaNumeros.setText("Suma Números (Recursivo)");
        jBtnSumaNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSumaNumerosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtN, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnLlenarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnMayorDiferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnDuplicarNodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnBuscarNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSumaNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLlenarLista))
                .addGap(18, 18, 18)
                .addComponent(jBtnMayorDiferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnBuscarNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnDuplicarNodos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jBtnSumaNumeros))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnSalir))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jBtnLlenarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLlenarListaActionPerformed
       int n= Integer.parseInt(this.jTxtN.getText());
       this.lista= new ListaSimple();
       lista.llenarLista(n);
       this.jTxaResultado.setText(this.lista.toString());
       
       this.jTxtN.requestFocus();
       this.jTxtN.selectAll();
    }//GEN-LAST:event_jBtnLlenarListaActionPerformed
// listo
    private void jBtnMayorDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMayorDiferenciaActionPerformed
     this.jTxaResultado.setText(this.lista.toString());
     this.jTxaResultado.append("\nMayor diferencia: "+
             Integer.toString(this.lista.mayorDiferencia() ) );
     
       this.jTxtN.requestFocus();
       this.jTxtN.selectAll();       
        
    }//GEN-LAST:event_jBtnMayorDiferenciaActionPerformed
// listo 
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       jTxtN.requestFocus();
    }//GEN-LAST:event_formWindowOpened
// listo 
    private void jBtnBuscarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarNumeroActionPerformed
       int n= Integer.parseInt(this.jTxtN.getText());
       this.jTxaResultado.setText(this.lista.toString());
       
        int posicion = (int)lista.buscarNumero(n);
        this.jTxaResultado.append((posicion>=0?
                "\nEl dato se encuentra en la posición "+ posicion :
                 "\nEl dato no se encuentra en la lista" ) );
        
       this.jTxtN.requestFocus();
       this.jTxtN.selectAll();  
    }//GEN-LAST:event_jBtnBuscarNumeroActionPerformed
// listo 
    private void jBtnDuplicarNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDuplicarNodosActionPerformed
     this.jTxaResultado.setText(this.lista.toString());
     this.lista.duplicarNodos();
     this.jTxaResultado.append("\n"+this.lista.toString());  
     
       this.jTxtN.requestFocus();
       this.jTxtN.selectAll();    
    }//GEN-LAST:event_jBtnDuplicarNodosActionPerformed
// listo 
    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed
// listo 
    private void jBtnSumaNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSumaNumerosActionPerformed
       int n= Integer.parseInt(this.jTxtN.getText());
 this.jTxaResultado.setText(Integer.toString(Recursividad.sumaNumeros(n)));
       
       this.jTxtN.requestFocus();
       this.jTxtN.selectAll();
    }//GEN-LAST:event_jBtnSumaNumerosActionPerformed
// listo 
    private void jTxtNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNKeyPressed
        // TODO add your handling code here:
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           
           jBtnLlenarLista.doClick();
           
//            int n= Integer.parseInt(this.jTxtN.getText());
//            this.lista= new ListaSimple();
//            lista.llenarLista(n);
//            this.jTxaResultado.setText(this.lista.toString());
//       
//            this.jTxtN.requestFocus();
//            this.jTxtN.selectAll(); 
         } 
    }//GEN-LAST:event_jTxtNKeyPressed
// listo 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscarNumero;
    private javax.swing.JButton jBtnDuplicarNodos;
    private javax.swing.JButton jBtnLlenarLista;
    private javax.swing.JButton jBtnMayorDiferencia;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtnSumaNumeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxaResultado;
    private javax.swing.JTextField jTxtN;
    // End of variables declaration//GEN-END:variables
}
