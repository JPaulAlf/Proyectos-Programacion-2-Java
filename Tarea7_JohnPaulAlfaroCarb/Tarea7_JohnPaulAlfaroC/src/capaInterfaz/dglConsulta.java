package capaInterfaz;

import capaEntidad.Sucursal;
import persistencia.PersistenciaSucursal;


public class dglConsulta extends javax.swing.JDialog {

    
    public dglConsulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //El siguiente for se ejecuta luego del método initComponents
        //Es equivalente a llenar el combo de sucursales en el WindowOpened
        for (Sucursal item : PersistenciaSucursal.getSucursal()) {
            cboSucursales.addItem(item);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboSucursales = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Sucursales");

        cboSucursales.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSucursalesItemStateChanged(evt);
            }
        });

        txtConsulta.setColumns(20);
        txtConsulta.setRows(5);
        jScrollPane1.setViewportView(txtConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboSucursales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método que se ejecuta cada vez que cambia el item del comboBox
    private void cboSucursalesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSucursalesItemStateChanged
       txtConsulta.setText(((Sucursal)cboSucursales.getSelectedItem()).display());
       
    }//GEN-LAST:event_cboSucursalesItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JComboBox<Sucursal> cboSucursales;
    javax.swing.JLabel jLabel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextArea txtConsulta;
    // End of variables declaration//GEN-END:variables
}
