package CapaVisual;
import CapaLogica.*;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class FrmVentana extends javax.swing.JFrame {
    DefaultListModel modeloDestino = new DefaultListModel();
        Curso curso;
        Estudiante est;
        int cantidad=1;
   
    public FrmVentana() {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo  /  Grupo: #1 (Lunes/Miercoles)");
        this.setLocationRelativeTo(null);
        this.jBtoLimpiar.setEnabled(false);
        this.JPanel_Matricula.setEnabled(false);
        this.jBtoMatricular.setEnabled(false);
        this.jBtoTotalPagar.setEnabled(false);
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanelInfoEstudiante = new javax.swing.JPanel();
        jPanelTipoEstudiante = new javax.swing.JPanel();
        jRdbRegular = new javax.swing.JRadioButton();
        jRdbNuevoIngreso = new javax.swing.JRadioButton();
        jChxTieneBeca = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtCedulaEstudiante = new javax.swing.JTextField();
        jBtoCrearEstudiante = new javax.swing.JButton();
        JPanel_Matricula = new javax.swing.JPanel();
        jCbxCursos = new javax.swing.JComboBox<>();
        jBtoMatricular = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCursos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jtxtTotalPagar = new javax.swing.JTextField();
        jBtoSalir = new javax.swing.JButton();
        jBtoLimpiar = new javax.swing.JButton();
        jBtoTotalPagar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtSalidaDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelInfoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del estudiante"));

        jPanelTipoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de estudiante"));

        buttonGroup1.add(jRdbRegular);
        jRdbRegular.setText("Regular");

        buttonGroup1.add(jRdbNuevoIngreso);
        jRdbNuevoIngreso.setText("Nuevo ingreso");

        javax.swing.GroupLayout jPanelTipoEstudianteLayout = new javax.swing.GroupLayout(jPanelTipoEstudiante);
        jPanelTipoEstudiante.setLayout(jPanelTipoEstudianteLayout);
        jPanelTipoEstudianteLayout.setHorizontalGroup(
            jPanelTipoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoEstudianteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelTipoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTipoEstudianteLayout.createSequentialGroup()
                        .addComponent(jRdbRegular)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jRdbNuevoIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTipoEstudianteLayout.setVerticalGroup(
            jPanelTipoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoEstudianteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jRdbRegular)
                .addGap(33, 33, 33)
                .addComponent(jRdbNuevoIngreso)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jChxTieneBeca.setText("Tiene beca");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cedula:");

        jBtoCrearEstudiante.setText("Crear Estudiante");
        jBtoCrearEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtoCrearEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInfoEstudianteLayout = new javax.swing.GroupLayout(jPanelInfoEstudiante);
        jPanelInfoEstudiante.setLayout(jPanelInfoEstudianteLayout);
        jPanelInfoEstudianteLayout.setHorizontalGroup(
            jPanelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(jPanelTipoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChxTieneBeca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtoCrearEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelInfoEstudianteLayout.setVerticalGroup(
            jPanelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoEstudianteLayout.createSequentialGroup()
                .addGroup(jPanelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelInfoEstudianteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelTipoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelInfoEstudianteLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelInfoEstudianteLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jChxTieneBeca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtoCrearEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        JPanel_Matricula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Matricula")));

        jBtoMatricular.setText("Matricular");
        jBtoMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtoMatricularActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListCursos);

        jLabel3.setText("Total a pagar:");

        jtxtTotalPagar.setEditable(false);

        jBtoSalir.setText("Salir");
        jBtoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtoSalirActionPerformed(evt);
            }
        });

        jBtoLimpiar.setText("Limpiar");
        jBtoLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtoLimpiarActionPerformed(evt);
            }
        });

        jBtoTotalPagar.setText("Total a pagar");
        jBtoTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtoTotalPagarActionPerformed(evt);
            }
        });

        jtxtSalidaDatos.setEditable(false);
        jtxtSalidaDatos.setColumns(20);
        jtxtSalidaDatos.setRows(5);
        jScrollPane2.setViewportView(jtxtSalidaDatos);

        javax.swing.GroupLayout JPanel_MatriculaLayout = new javax.swing.GroupLayout(JPanel_Matricula);
        JPanel_Matricula.setLayout(JPanel_MatriculaLayout);
        JPanel_MatriculaLayout.setHorizontalGroup(
            JPanel_MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanel_MatriculaLayout.createSequentialGroup()
                        .addComponent(jCbxCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtoMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtoTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addGap(79, 79, 79)
                .addGroup(JPanel_MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_MatriculaLayout.createSequentialGroup()
                        .addGroup(JPanel_MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(JPanel_MatriculaLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(JPanel_MatriculaLayout.createSequentialGroup()
                        .addComponent(jBtoLimpiar)
                        .addGap(33, 33, 33)
                        .addComponent(jBtoSalir)
                        .addGap(66, 66, 66))))
        );
        JPanel_MatriculaLayout.setVerticalGroup(
            JPanel_MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_MatriculaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtoSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtoLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                    .addGroup(JPanel_MatriculaLayout.createSequentialGroup()
                        .addGroup(JPanel_MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtoMatricular, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(jCbxCursos))
                        .addGap(42, 42, 42)
                        .addComponent(jBtoTotalPagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JPanel_Matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInfoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInfoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPanel_Matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Matricula", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jBtoCrearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtoCrearEstudianteActionPerformed
        // TODO add your handling code here:
        String nombre= this.txtNombreEstudiante.getText();
        String cedula= this.txtCedulaEstudiante.getText();
        
        est= new Estudiante(cedula, nombre); //Creo objeto estudiante
        
        if(jRdbRegular.isSelected()){ // se selecciona que tipo de estudiante es: N.Ingreso o Regular
            est.setTipoEst(TipoEstudiante.Regular); 
        }else if(jRdbNuevoIngreso.isSelected()){
            est.setTipoEst(TipoEstudiante.NuevoIngreso);
        }
        
        if(this.jChxTieneBeca.isSelected()){ // Se selecciona si tiene beca el estudiante
            est.setBeca(true);
        }else{
            est.setBeca(false);
        }
        
        
        
        
        //inferior
        this.JPanel_Matricula.setEnabled(true);
        this.jBtoMatricular.setEnabled(true);
        this.jBtoTotalPagar.setEnabled(true);
        // superior
        this.jPanelInfoEstudiante.setEnabled(false);
        this.txtCedulaEstudiante.setEditable(false);
        this.txtNombreEstudiante.setEditable(false);
        this.jBtoCrearEstudiante.setEnabled(false);
        this.jChxTieneBeca.setEnabled(false);
        this.jPanelTipoEstudiante.setEnabled(false);
            this.jRdbRegular.setEnabled(false);
        this.jRdbNuevoIngreso.setEnabled(false);
    }//GEN-LAST:event_jBtoCrearEstudianteActionPerformed
// LISTO
    private void jBtoMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtoMatricularActionPerformed
        // TODO add your handling code here:
         this.jBtoLimpiar.setEnabled(true);
         int indice = this.jCbxCursos.getSelectedIndex();
          JOptionPane.showMessageDialog(null, est.matricular((Curso)this.jCbxCursos.getSelectedItem()));
         
          if(cantidad<=4){
              modeloDestino.addElement(jCbxCursos.getSelectedItem().toString());
              jCbxCursos.removeItemAt(indice);
          }
        
    }//GEN-LAST:event_jBtoMatricularActionPerformed
// LISTO
    private void jBtoTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtoTotalPagarActionPerformed
        // TODO add your handling code here:
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        this.jtxtTotalPagar.setText( formato.format(est.totalPagar()) );
      this.jtxtSalidaDatos.setText(est.toString());
      this.jtxtTotalPagar.setText(Double.toString(est.totalPagar()));
    }//GEN-LAST:event_jBtoTotalPagarActionPerformed
// LISTO
    private void jBtoLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtoLimpiarActionPerformed
        // TODO add your handling code here:
        this.jtxtSalidaDatos.setText("");
        this.jtxtTotalPagar.setText("");
        this.modeloDestino.clear();
    }//GEN-LAST:event_jBtoLimpiarActionPerformed
// LISTO
    private void jBtoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtoSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtoSalirActionPerformed
// LiSTO
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        Curso curso1= new Curso("Ma100", "Matematicas",10000, TipoCurso.Teorico);
//        Curso curso2= new Curso("Bio200", "Biologia",5000, TipoCurso.Teorico);
//        Curso curso3= new Curso("Fis300", "Fisica",8000, TipoCurso.Practico);
//        Curso curso4= new Curso("Q400", "Quimica",15000, TipoCurso.Practico);
//        Curso curso5= new Curso("Ing500", "Ingles",3000, TipoCurso.Practico);
        
        this.jCbxCursos.addItem(new Curso("Ma100", "Matematicas",10000, TipoCurso.Teorico));
         this.jCbxCursos.addItem(new Curso("Bio200", "Biologia",5000, TipoCurso.Teorico));
         this.jCbxCursos.addItem(new Curso("Fis300", "Fisica",8000, TipoCurso.Practico));
         this.jCbxCursos.addItem(new Curso("Q400", "Quimica",15000, TipoCurso.Practico));
         this.jCbxCursos.addItem(new Curso("Ing500", "Ingles",3000, TipoCurso.Practico));
        
           this.jListCursos.setModel(modeloDestino);
    }//GEN-LAST:event_formWindowOpened
// LISTO
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Matricula;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtoCrearEstudiante;
    private javax.swing.JButton jBtoLimpiar;
    private javax.swing.JToggleButton jBtoMatricular;
    private javax.swing.JButton jBtoSalir;
    private javax.swing.JButton jBtoTotalPagar;
    private javax.swing.JComboBox<Curso> jCbxCursos;
    private javax.swing.JCheckBox jChxTieneBeca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListCursos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInfoEstudiante;
    private javax.swing.JPanel jPanelTipoEstudiante;
    private javax.swing.JRadioButton jRdbNuevoIngreso;
    private javax.swing.JRadioButton jRdbRegular;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jtxtSalidaDatos;
    private javax.swing.JTextField jtxtTotalPagar;
    private javax.swing.JTextField txtCedulaEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    // End of variables declaration//GEN-END:variables
}
