
package Repaso;
import java.awt.*;
import javax.swing.JOptionPane;

public class VentanaRepaso extends javax.swing.JFrame {
        Repaso repaso; 
    public VentanaRepaso() {
        initComponents();
        
        this.setTitle("Elaborado por John Paul Alfaro Carballo  /  Grupo: #1 (L/M)");
        this.setLocationRelativeTo(null);
        this.setSize(854,580);
        this.setMinimumSize(new Dimension(852,570));
        this.setMaximumSize(new Dimension(854,582));
        
        this.btoLlenaArreglo.setEnabled(false);
        this.btoLlenaMatriz.setEnabled(false);
        this.btoMatematicas.setEnabled(false);
        this.btoSumatoria.setEnabled(false);
        this.btoModHilera.setEnabled(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTamannoMatriz = new javax.swing.JTextField();
        txtHilera = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalidaDatos = new javax.swing.JTextArea();
        btoSalir = new javax.swing.JButton();
        btoIniciar = new javax.swing.JButton();
        btoLlenaArreglo = new javax.swing.JButton();
        btoLlenaMatriz = new javax.swing.JButton();
        btoMatematicas = new javax.swing.JButton();
        btoSumatoria = new javax.swing.JButton();
        btoModHilera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Tamaño de Matriz y Arreglo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 120, 190, 40);

        jLabel2.setText("Hilera");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 30, 110, 40);

        jLabel4.setText("Valor de \"N\"");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 80, 110, 40);
        getContentPane().add(txtTamannoMatriz);
        txtTamannoMatriz.setBounds(290, 110, 430, 40);
        getContentPane().add(txtHilera);
        txtHilera.setBounds(290, 30, 430, 40);
        getContentPane().add(txtNumero);
        txtNumero.setBounds(290, 70, 430, 40);

        txtSalidaDatos.setEditable(false);
        txtSalidaDatos.setColumns(20);
        txtSalidaDatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSalidaDatos.setRows(5);
        jScrollPane1.setViewportView(txtSalidaDatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 620, 380);

        btoSalir.setBackground(new java.awt.Color(255, 51, 51));
        btoSalir.setText("Salir");
        btoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btoSalir);
        btoSalir.setBounds(690, 470, 130, 40);

        btoIniciar.setBackground(new java.awt.Color(0, 204, 102));
        btoIniciar.setText("Iniciar Repaso");
        btoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btoIniciar);
        btoIniciar.setBounds(690, 170, 130, 40);

        btoLlenaArreglo.setText("LLenar Arreglo");
        btoLlenaArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoLlenaArregloActionPerformed(evt);
            }
        });
        getContentPane().add(btoLlenaArreglo);
        btoLlenaArreglo.setBounds(690, 240, 130, 40);

        btoLlenaMatriz.setText("Llenar Matriz");
        btoLlenaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoLlenaMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(btoLlenaMatriz);
        btoLlenaMatriz.setBounds(690, 280, 130, 40);

        btoMatematicas.setText("Matematicas");
        btoMatematicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoMatematicasActionPerformed(evt);
            }
        });
        getContentPane().add(btoMatematicas);
        btoMatematicas.setBounds(690, 320, 130, 40);

        btoSumatoria.setText("Sumatoria");
        btoSumatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoSumatoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btoSumatoria);
        btoSumatoria.setBounds(690, 360, 130, 40);

        btoModHilera.setText("Mod. Hilera");
        btoModHilera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoModHileraActionPerformed(evt);
            }
        });
        getContentPane().add(btoModHilera);
        btoModHilera.setBounds(690, 400, 130, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoIniciarActionPerformed
        this.btoLlenaArreglo.setEnabled(true);
        this.btoLlenaMatriz.setEnabled(true);
        this.btoMatematicas.setEnabled(true);
        this.btoSumatoria.setEnabled(true);
        this.btoModHilera.setEnabled(true);
        
       try{
             String numero= this.txtNumero.getText(); // 
             String hilera=this.txtHilera.getText();  // hilera que se valida.....
             String tamanno=this.txtTamannoMatriz.getText();
             
                     double num= Double.parseDouble(numero);
                     int tam=Integer.parseInt(tamanno);
                    
                   if(hilera.matches("([a-z]+[ ]?)+") && tamanno.matches("[3-9]") && num >= -100 && num <=100){
                          repaso = new Repaso(tam,tam,num,hilera);
                          JOptionPane.showMessageDialog(null, "Los datos ingresados son correctos");
                          this.txtSalidaDatos.setText("");
                     }else{
                         this.btoLlenaArreglo.setEnabled(false);
                         this.btoLlenaMatriz.setEnabled(false);
                         this.btoMatematicas.setEnabled(false);
                         this.btoSumatoria.setEnabled(false);
                         this.btoModHilera.setEnabled(false);
                         this.txtSalidaDatos.setText("Revisar los datos ingresados:\n"   +
                                "-> La hilera solo debe de contener minusculas y espacios en blanco \n" + 
                                "-> El tamanno de la matriz y el arreglo debe estar entre [ 3 - 9 ]"  );
                     }
        } catch(Exception e){
                             System.out.println("Ah habido un error, porfavor revisa las acciones que has echo...");
                             }
    }//GEN-LAST:event_btoIniciarActionPerformed
//  LISTO
    private void btoLlenaArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoLlenaArregloActionPerformed
        String array=repaso.llenaArreglo();
        this.txtSalidaDatos.setText(array);
    }//GEN-LAST:event_btoLlenaArregloActionPerformed
// listo
    private void btoLlenaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoLlenaMatrizActionPerformed
       String pascal= repaso.trianguloPascal();
       this.txtSalidaDatos.setText(pascal);
    }//GEN-LAST:event_btoLlenaMatrizActionPerformed
// listo
    private void btoMatematicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoMatematicasActionPerformed
        String mat=this.repaso.matematica();
        this.txtSalidaDatos.setText(mat);
    }//GEN-LAST:event_btoMatematicasActionPerformed
// LSITO
    private void btoSumatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoSumatoriaActionPerformed
       double suma= repaso.calculaSuma();
       String hilera= Double.toString(suma);
       this.txtSalidaDatos.setText(hilera);
    }//GEN-LAST:event_btoSumatoriaActionPerformed
// lsito
    private void btoModHileraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoModHileraActionPerformed
       String hilera= this.repaso.convierteHilera();
       this.txtSalidaDatos.setText(hilera);
    }//GEN-LAST:event_btoModHileraActionPerformed
// lsito
    private void btoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btoSalirActionPerformed
// listo 

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRepaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRepaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRepaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRepaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRepaso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoIniciar;
    private javax.swing.JButton btoLlenaArreglo;
    private javax.swing.JButton btoLlenaMatriz;
    private javax.swing.JButton btoMatematicas;
    private javax.swing.JButton btoModHilera;
    private javax.swing.JButton btoSalir;
    private javax.swing.JButton btoSumatoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHilera;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtSalidaDatos;
    private javax.swing.JTextField txtTamannoMatriz;
    // End of variables declaration//GEN-END:variables
}
