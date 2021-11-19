
package capaInterfaz;

import capaEntidad.Factura;
import capaEntidad.Producto;
import capaEntidad.Sucursal;
import capaEntidad.TipoFactura;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.PersistenciaProducto;
import persistencia.PersistenciaSucursal;

public class FrmFactura extends javax.swing.JFrame {

    Factura factura1;
    DefaultTableModel modelo;
    
    public FrmFactura() {
        initComponents();
        modelo = (DefaultTableModel)jTblLineaDetalle.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblLineaDetalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTxtNumFactura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtSubTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtDescuento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtImpuesto = new javax.swing.JTextField();
        jTxtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jBtnCrearFactura = new javax.swing.JButton();
        pnlProducto = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnAgregar = new javax.swing.JButton();
        jSpnCantidadArticulos = new javax.swing.JSpinner();
        jCboProductos = new javax.swing.JComboBox<>();
        jBtnTerminarFactura = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCboSucursal = new javax.swing.JComboBox<>();
        jBtnSalir = new javax.swing.JButton();
        jRdbCredito = new javax.swing.JRadioButton();
        jRdbContado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturación");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTblLineaDetalle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTblLineaDetalle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTblLineaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTblLineaDetalle);

        jLabel1.setText("No. Factura");

        jTxtNumFactura.setEditable(false);

        jLabel2.setText("Sucursal");

        jLabel5.setText("SubTotal");

        jTxtSubTotal.setEditable(false);

        jLabel6.setText("Descuento");

        jTxtDescuento.setEditable(false);

        jLabel7.setText("Impuesto");

        jTxtImpuesto.setEditable(false);

        jTxtTotal.setEditable(false);

        jLabel8.setText("Total");

        jBtnCrearFactura.setText("Crear Factura");
        jBtnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCrearFacturaActionPerformed(evt);
            }
        });

        pnlProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Cantidad");

        jLabel4.setText("Producto");

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jSpnCantidadArticulos.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout pnlProductoLayout = new javax.swing.GroupLayout(pnlProducto);
        pnlProducto.setLayout(pnlProductoLayout);
        pnlProductoLayout.setHorizontalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpnCantidadArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCboProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBtnAgregar)
                .addGap(91, 91, 91))
        );
        pnlProductoLayout.setVerticalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jBtnAgregar)
                    .addComponent(jSpnCantidadArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jBtnTerminarFactura.setText("Terminar Factura");
        jBtnTerminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTerminarFacturaActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de Factura");

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        grupoBotones.add(jRdbCredito);
        jRdbCredito.setText("Credito");

        grupoBotones.add(jRdbContado);
        jRdbContado.setText("Contado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jRdbContado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRdbCredito)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                                .addComponent(jBtnCrearFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pnlProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnTerminarFactura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jTxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTxtDescuento, jTxtImpuesto, jTxtSubTotal, jTxtTotal});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnCrearFactura, jBtnTerminarFactura});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(jTxtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCrearFactura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jRdbCredito)
                            .addComponent(jRdbContado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(jCboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pnlProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(jTxtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnTerminarFactura)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jTxtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSalir))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jBtnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearFacturaActionPerformed
    //La factura no se crea si no se ha escogido la sucursal y el tipo de factura
        TipoFactura tipo= null;
        if(jCboSucursal.getSelectedIndex()==-1){
           JOptionPane.showMessageDialog(this, "Debe seleccionar la sucursal");
           jCboSucursal.requestFocus();
           return;
        }
        if(grupoBotones.getSelection()== null){
        JOptionPane.showMessageDialog(this, "Debe seleccionar un mtipo de factura");
        return;
        }   
        
        
        
       if(jRdbContado.isSelected()){
           tipo=TipoFactura.CONTADO;
       }else{
           tipo=TipoFactura.CREDITO;
       }
       
        factura1= new Factura(tipo);
        this.jTxtNumFactura.setText(Integer.toString(factura1.getNumeroFactura()));
        activar();
    }//GEN-LAST:event_jBtnCrearFacturaActionPerformed
// listo
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        desactivar();        
        grupoBotones.clearSelection();//Limpia el grupo de botones
        llenarCombos();
    }//GEN-LAST:event_formWindowOpened
// Listo
    private void jBtnTerminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTerminarFacturaActionPerformed
  /* CAUNDO TERMINA LA FACTURA CIERRA LA VENTANA Y ABRE LA DE LA FACTURA
        DE ESTA FROMA VA VER EN DETALLE LO QUE COMPRO Y POR LO QUE SE COBRO */
        
        //sucursal.agregarFactura(factura1);
        desactivar();
        jTxtSubTotal.setText("");
        jTxtDescuento.setText("");
        jTxtImpuesto.setText("");
        jTxtTotal.setText("");
        modelo.setRowCount(0);
        grupoBotones.clearSelection();
        jCboSucursal.setSelectedIndex(-1);
        JOptionPane.showMessageDialog(this,factura1.toString());
    }//GEN-LAST:event_jBtnTerminarFacturaActionPerformed
// listo
    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
         //Agrega la línea de detalle de la factura, tanto visualmente como en 
         //la capa lógica
         //Muestra los campos: subtotal, descuento, impuesto, total
        int cantidad=(int) jSpnCantidadArticulos.getValue();
        Producto producto =(Producto) this.jCboProductos.getSelectedItem();
        factura1.agregarLineaDetalle(producto, cantidad);

        
            System.out.println(factura1.toString());
                 Object [] objeto = new Object[4];
                 objeto[0]= producto.getNombre();
                         objeto[1]=producto. getPrecioBasico();
                             objeto[2]=cantidad;
                                 objeto[3]= producto.calculaPrecioTotalProducto();
                                 modelo.addRow(objeto);
         
         this.jTxtSubTotal.setText(Double.toString(factura1.calcularSubTotal()));
                 this.jTxtDescuento.setText(Double.toString(factura1.calcularDescuento()));
                 DecimalFormat formatoNumerico = new DecimalFormat("#,##0.00");
                           this.jTxtImpuesto.setText(formatoNumerico.format(factura1.calcularDescuento()));
                                   this.jTxtTotal.setText(Double.toString(factura1.calcularTotalFactura()));
                                   
         Sucursal sucursal=(Sucursal )jCboSucursal.getSelectedItem();
         sucursal.agregarFactura(factura1);
         
    }//GEN-LAST:event_jBtnAgregarActionPerformed
// listo
    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed
// listo
    
    
    public void llenarCombos(){
       //Llenar el combo de productos desde el Archivador de Productos
       jCboProductos.removeAllItems();
        for (Producto producto:PersistenciaProducto.getArrayProductos() ) {
            jCboProductos.addItem(producto);
        }
        jCboProductos.setSelectedIndex(-1);
        
        
        
        //Llena el combo de sucursal
        jCboSucursal.removeAllItems();
        for (Sucursal item : PersistenciaSucursal.getSucursal()){
            jCboSucursal.addItem(item);
        }
        jCboSucursal.setSelectedIndex(-1);
    }
    // listo  
    public void llenarTabla(){
        
    }
    // listo
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.ButtonGroup grupoBotones;
    javax.swing.JButton jBtnAgregar;
    javax.swing.JButton jBtnCrearFactura;
    javax.swing.JButton jBtnSalir;
    javax.swing.JButton jBtnTerminarFactura;
    javax.swing.JComboBox<Producto> jCboProductos;
    javax.swing.JComboBox<Sucursal> jCboSucursal;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JRadioButton jRdbContado;
    javax.swing.JRadioButton jRdbCredito;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JSpinner jSpnCantidadArticulos;
    javax.swing.JTable jTblLineaDetalle;
    javax.swing.JTextField jTxtDescuento;
    javax.swing.JTextField jTxtImpuesto;
    javax.swing.JTextField jTxtNumFactura;
    javax.swing.JTextField jTxtSubTotal;
    javax.swing.JTextField jTxtTotal;
    javax.swing.JPanel pnlProducto;
    // End of variables declaration//GEN-END:variables

    private void desactivar() {
//        jSpnCantidad.setEnabled(false);
//        jCboProducto.setEnabled(false);
        jBtnAgregar.setEnabled(false);
        jBtnCrearFactura.setEnabled(true);
        jBtnTerminarFactura.setEnabled(false);
    }

    private void activar() {
//        jSpnCantidad.setEnabled(true);
//        jCboProducto.setEnabled(true);
        jBtnAgregar.setEnabled(true);
        jBtnCrearFactura.setEnabled(false);
        jBtnTerminarFactura.setEnabled(true);
    }
}
