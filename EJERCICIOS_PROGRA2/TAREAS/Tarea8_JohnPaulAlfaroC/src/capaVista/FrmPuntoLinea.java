package capaVista;
import CapaLogica.*;
import javax.swing.JOptionPane;

public class FrmPuntoLinea extends javax.swing.JFrame {
    Punto punto1;
    Punto punto2;
    public FrmPuntoLinea() {
        initComponents();
        this.setTitle("TAREA 8 / JOHN PAUL ALFARO CARBALLO");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtX1 = new javax.swing.JTextField();
        jTxtY1 = new javax.swing.JTextField();
        jTxtX2 = new javax.swing.JTextField();
        jTxtY2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtRadio = new javax.swing.JTextField();
        jTxtAltura = new javax.swing.JTextField();
        jBtnPunto1 = new javax.swing.JButton();
        jBtnPunto2 = new javax.swing.JButton();
        jBtnCírculo = new javax.swing.JButton();
        jBtnCilindro = new javax.swing.JButton();
        jBtnLinea = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaInformación = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Punto 1- Coordenada x ");

        jLabel2.setText("Punto 1- Coordenada y");

        jLabel3.setText("Punto 2- Coordenada x ");

        jLabel4.setText("Punto 2- Coordenada y ");

        jLabel5.setText("Radio del círculo");

        jLabel6.setText("Altura del cilindro");

        jBtnPunto1.setText("Punto 1");
        jBtnPunto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPunto1ActionPerformed(evt);
            }
        });

        jBtnPunto2.setText("Punto 2");
        jBtnPunto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPunto2ActionPerformed(evt);
            }
        });

        jBtnCírculo.setText("Círculo");
        jBtnCírculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCírculoActionPerformed(evt);
            }
        });

        jBtnCilindro.setText("Cilindro");
        jBtnCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCilindroActionPerformed(evt);
            }
        });

        jBtnLinea.setText("Línea");
        jBtnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLineaActionPerformed(evt);
            }
        });

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jTxaInformación.setColumns(20);
        jTxaInformación.setRows(5);
        jScrollPane1.setViewportView(jTxaInformación);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtX1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(jTxtY1)
                            .addComponent(jTxtX2)
                            .addComponent(jTxtY2)
                            .addComponent(jTxtRadio)
                            .addComponent(jTxtAltura))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnCírculo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnPunto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnPunto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnCilindro, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtnLinea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jBtnPunto1))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jBtnPunto2))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jBtnCírculo))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jBtnCilindro))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTxtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnLinea))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addComponent(jBtnSalir)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // falta metodo de distancia entre dos puntos en LINEA
    
    private void jBtnPunto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPunto1ActionPerformed
  if(jTxtX1.getText().isEmpty()){
            jTxtX1.requestFocus();
            return;
        }
         if(jTxtY1.getText().isEmpty()){
            jTxtY1.requestFocus();
            return;
        }
       double x1= Double.parseDouble(this.jTxtX1.getText());
       double y1= Double.parseDouble(this.jTxtY1.getText());
       punto1= new  Punto(x1, y1);
       this.jTxaInformación.setText(punto1.toString());
    }//GEN-LAST:event_jBtnPunto1ActionPerformed
//listo
    private void jBtnPunto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPunto2ActionPerformed
  if(jTxtX2.getText().isEmpty()){
            jTxtX2.requestFocus();
            return;
        }
         if(jTxtY2.getText().isEmpty()){
            jTxtY2.requestFocus();
            return;
        }
         double x2= Double.parseDouble(this.jTxtX2.getText());
         double y2= Double.parseDouble(this.jTxtY2.getText());
           punto2=new Punto(x2, y2);
              this.jTxaInformación.setText(punto2.toString());
    }//GEN-LAST:event_jBtnPunto2ActionPerformed
//listo
    private void jBtnCírculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCírculoActionPerformed
    if(jTxtX1.getText().isEmpty()){
            jTxtX1.requestFocus();
            return;
        }
         if(jTxtY1.getText().isEmpty()){
            jTxtY1.requestFocus();
            return;
        }
       if(jTxtRadio.getText().isEmpty()){
            jTxtRadio.requestFocus();
            return;
        }
             double radio = Double.parseDouble(this.jTxtRadio.getText());
        double x1= Double.parseDouble(this.jTxtX1.getText());
       double y1= Double.parseDouble(this.jTxtY1.getText());
        Circulo circulo = new Circulo(x1, y1, radio);
        this.jTxaInformación.setText(circulo.toString());
       
    }//GEN-LAST:event_jBtnCírculoActionPerformed
//listo
    private void jBtnCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCilindroActionPerformed
    if(jTxtX1.getText().isEmpty()){
            jTxtX1.requestFocus();
            return;
        }
         if(jTxtY1.getText().isEmpty()){
            jTxtY1.requestFocus();
            return;
        }
       if(jTxtRadio.getText().isEmpty()){
            jTxtRadio.requestFocus();
            return;
        }
        if(jTxtAltura.getText().isEmpty()){
            jTxtAltura.requestFocus();
            return;
        }
        
        double radio = Double.parseDouble(this.jTxtRadio.getText());
      double altura = Double.parseDouble(this.jTxtAltura.getText());
        double x1= Double.parseDouble(this.jTxtX1.getText());
       double y1= Double.parseDouble(this.jTxtY1.getText());
       
        Cilindro cilindro = new Cilindro(x1, y1, radio, altura);
        this.jTxaInformación.setText(cilindro.toString());
    }//GEN-LAST:event_jBtnCilindroActionPerformed
//listo
    private void jBtnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLineaActionPerformed
      Linea linea = new Linea(punto1, punto2);
      this.jTxaInformación.setText(linea.toString());
       
    }//GEN-LAST:event_jBtnLineaActionPerformed
// listo
    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jBtnSalirActionPerformed
//listo
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCilindro;
    private javax.swing.JButton jBtnCírculo;
    private javax.swing.JButton jBtnLinea;
    private javax.swing.JButton jBtnPunto1;
    private javax.swing.JButton jBtnPunto2;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxaInformación;
    private javax.swing.JTextField jTxtAltura;
    private javax.swing.JTextField jTxtRadio;
    private javax.swing.JTextField jTxtX1;
    private javax.swing.JTextField jTxtX2;
    private javax.swing.JTextField jTxtY1;
    private javax.swing.JTextField jTxtY2;
    // End of variables declaration//GEN-END:variables
}