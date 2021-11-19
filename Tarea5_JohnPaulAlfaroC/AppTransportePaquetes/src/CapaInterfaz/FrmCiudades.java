
package CapaInterfaz;

import CapaPersistencia.*;
import CapaLogicaNegocios.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana
 */
public class FrmCiudades extends javax.swing.JFrame {
    DefaultTableModel modelo ;
   // Object[] array;
    int posicion;
  
    public FrmCiudades() {
        initComponents();
       modelo =(DefaultTableModel)jTblCiudades.getModel();
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
        jTxtNombreCiudad = new javax.swing.JTextField();
        jCboZona = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblCiudades = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        JbtnGuardar = new javax.swing.JButton();
        JbtnModificar = new javax.swing.JButton();
        JbtnCancelar = new javax.swing.JButton();
        JbtnEliminar = new javax.swing.JButton();
        JbtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Ciudades");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nombre Ciudad");

        jLabel2.setText("Zona");

        jTblCiudades.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTblCiudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Ciudad", "Zona"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblCiudades.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTblCiudadesFocusGained(evt);
            }
        });
        jTblCiudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblCiudadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblCiudades);

        jToolBar1.setRollover(true);

        JbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salvar_Disco2.png"))); // NOI18N
        JbtnGuardar.setText("Guardar");
        JbtnGuardar.setFocusable(false);
        JbtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(JbtnGuardar);

        JbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Modificar.png"))); // NOI18N
        JbtnModificar.setText("Modificar");
        JbtnModificar.setFocusable(false);
        JbtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(JbtnModificar);

        JbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar.jpg"))); // NOI18N
        JbtnCancelar.setText("Cancelar");
        JbtnCancelar.setFocusable(false);
        JbtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(JbtnCancelar);

        JbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar.jpg"))); // NOI18N
        JbtnEliminar.setText("Eliminar");
        JbtnEliminar.setFocusable(false);
        JbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(JbtnEliminar);

        JbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        JbtnSalir.setText("Salir");
        JbtnSalir.setFocusable(false);
        JbtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(JbtnSalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jTxtNombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(26, 26, 26))
                                .addComponent(jCboZona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTxtNombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCboZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTxtNombreCiudad.setEnabled(true);
        JbtnModificar.setEnabled(false);
        JbtnCancelar.setEnabled(false);
        JbtnGuardar.setEnabled(true);

        for (Zona   zona : Zona.values()) {
            jCboZona.addItem(zona);
        }
        jCboZona.setSelectedIndex(-1);
        llenarTabla();
        activarBotones();
    }//GEN-LAST:event_formWindowOpened

    private void jTblCiudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblCiudadesMouseClicked
    this.posicion= jTblCiudades.getSelectedRow();
       
    }//GEN-LAST:event_jTblCiudadesMouseClicked
// listo 
    private void JbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnGuardarActionPerformed
        // TODO add your handling code here:
        
        if(this.jTxtNombreCiudad.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Favor escribir un nombre de ciudad");
            return;
        }
        if(this.jCboZona.getSelectedIndex()==-1){
          JOptionPane.showMessageDialog(this,"Favor seleccionar una zona de las opciones");
            return;
        }
        String nombre=this.jTxtNombreCiudad.getText();
        Zona zona=(Zona)this.jCboZona.getSelectedItem();
        
                
        Ciudad ciudad = new Ciudad(nombre, zona);
        ArchivadorCiudad.getArrayCiudades().add(ciudad);
        this.llenarTabla();
       this.Limpiar();
    }//GEN-LAST:event_JbtnGuardarActionPerformed
// listo
    private void JbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnModificarActionPerformed
        // TODO add your handling code here:
        if(this.jTblCiudades.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this,"Favor seleccionar una fila a modificar");
            return;
        }
         if(jCboZona.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una zona");
            return;
        }
        String nombre= (String)modelo.getValueAt(jTblCiudades.getSelectedRow(), 0);
        Zona zona=(Zona)this.jCboZona.getSelectedItem();
     
        Ciudad ciudad = new Ciudad(nombre, zona);
         ArchivadorCiudad.modificarCiudad(posicion, ciudad);
         this.llenarTabla();
         this.Limpiar();
    }//GEN-LAST:event_JbtnModificarActionPerformed

    private void JbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnCancelarActionPerformed
        // TODO add your handling code here:
      Limpiar();
        jTxtNombreCiudad.setEnabled(true);
        JbtnModificar.setEnabled(false);
        JbtnCancelar.setEnabled(false);
        JbtnGuardar.setEnabled(true);
        jTblCiudades.requestFocus(false);
  
    }//GEN-LAST:event_JbtnCancelarActionPerformed
// listo
    private void JbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = (String) jTblCiudades.getValueAt(posicion, 0);
            ArchivadorCiudad.eliminarCiudad(nombre);
            llenarTabla();
        } catch (Exception ConcurrentModificationException) {
        }
    }//GEN-LAST:event_JbtnEliminarActionPerformed
// listo
    private void JbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JbtnSalirActionPerformed
// listo
    private void jTblCiudadesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTblCiudadesFocusGained
        // TODO add your handling code here:
        jTxtNombreCiudad.setEnabled(false);  
        JbtnModificar.setEnabled(true);
        JbtnCancelar.setEnabled(true);
         JbtnGuardar.setEnabled(false);


    }//GEN-LAST:event_jTblCiudadesFocusGained
// listo
    
    
     private void desactivarBotones() {
      
    }
     
    private void llenarTabla() {
        modelo.setRowCount(0);
        for (Ciudad ciudad : ArchivadorCiudad.getArrayCiudades()) {
            Object[] array= new Object[2];
            array[0]=ciudad.getNombre();
            array[1]= ciudad.getZona();
            modelo.addRow(array);
        }
    }
    private void activarBotones() {
//        jBtnGuardar.setEnabled(true);
//        jBtnEliminar.setEnabled(false);
//        jBtnModificar.setEnabled(false);
//        jBtnCancelar.setEnabled(false);
    }
    
    private void Limpiar(){
        jTxtNombreCiudad.setText("");
        jCboZona.setSelectedIndex(-1);
        activarBotones();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnCancelar;
    private javax.swing.JButton JbtnEliminar;
    private javax.swing.JButton JbtnGuardar;
    private javax.swing.JButton JbtnModificar;
    private javax.swing.JButton JbtnSalir;
    private javax.swing.JComboBox<Zona> jCboZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblCiudades;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField jTxtNombreCiudad;
    // End of variables declaration//GEN-END:variables
}