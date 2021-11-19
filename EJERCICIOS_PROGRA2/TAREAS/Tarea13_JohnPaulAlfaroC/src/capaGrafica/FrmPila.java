
package capaGrafica;

import estructuras.Cola;
import estructuras.Pila;
import javax.swing.JOptionPane;


public class FrmPila extends javax.swing.JFrame {

   private Pila pila;
    public FrmPila() {
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
        jLabel3 = new javax.swing.JLabel();
        jTxtDatoIngresar = new javax.swing.JTextField();
        jTxtDatoExtraido = new javax.swing.JTextField();
        jBtnPush = new javax.swing.JButton();
        jBtnPop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaPila = new javax.swing.JTextArea();
        jBtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Dato Ingresar");

        jLabel2.setText("Dato Extraido");

        jLabel3.setText("Cola");

        jTxtDatoIngresar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtDatoIngresarFocusGained(evt);
            }
        });
        jTxtDatoIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDatoIngresarActionPerformed(evt);
            }
        });

        jBtnPush.setText("Agregar (push)");
        jBtnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPushActionPerformed(evt);
            }
        });

        jBtnPop.setText("Eliminar (pop)");
        jBtnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPopActionPerformed(evt);
            }
        });

        jTxaPila.setColumns(20);
        jTxaPila.setRows(5);
        jScrollPane1.setViewportView(jTxaPila);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtDatoIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jTxtDatoExtraido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnPop)
                            .addComponent(jBtnPush))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtDatoIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPush))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtDatoExtraido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jBtnPop)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnSalir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPushActionPerformed
        int dato = Integer.parseInt(  this.jTxtDatoIngresar.getText());
        pila.push(dato);
        this.jTxaPila.setText(pila.toString());
        this.jTxtDatoIngresar.requestFocus();
        this.jTxtDatoExtraido.setText("");
    }//GEN-LAST:event_jBtnPushActionPerformed

    private void jBtnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPopActionPerformed
        Integer dato = (Integer)pila.pop() ;
        if(dato == null){
            JOptionPane.showMessageDialog(null,"La pila está vacía");
            jTxtDatoIngresar.setText("");
            jTxtDatoExtraido.setText("");
        }
         else{
            this.jTxtDatoExtraido.setText( Integer.toString(dato));
         }
        this.jTxaPila.setText(pila.toString());
        this.jTxtDatoIngresar.requestFocus();
    }//GEN-LAST:event_jBtnPopActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.pila = new Pila();
        this.jTxtDatoIngresar.requestFocus();       
    }//GEN-LAST:event_formWindowOpened

    private void jTxtDatoIngresarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtDatoIngresarFocusGained
         this.jTxtDatoIngresar.selectAll();
    }//GEN-LAST:event_jTxtDatoIngresarFocusGained

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jTxtDatoIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDatoIngresarActionPerformed
        jBtnPush.doClick();
        this.jTxtDatoIngresar.requestFocus();
        jTxtDatoIngresar.selectAll();
    }//GEN-LAST:event_jTxtDatoIngresarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnPop;
    private javax.swing.JButton jBtnPush;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxaPila;
    private javax.swing.JTextField jTxtDatoExtraido;
    private javax.swing.JTextField jTxtDatoIngresar;
    // End of variables declaration//GEN-END:variables
}
