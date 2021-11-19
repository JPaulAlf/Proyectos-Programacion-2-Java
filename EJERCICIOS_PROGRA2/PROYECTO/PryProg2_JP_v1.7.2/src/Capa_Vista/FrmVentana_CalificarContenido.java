/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;

import Capa_Logica_Negocios.*;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmVentana_CalificarContenido extends javax.swing.JFrame {
    
        private ArrayList <ContenidoAudioVisual> arrayCarrito = new ArrayList();
        private ContenidoAudioVisual contenidoAux=null;
        DefaultTableModel modeloTablaContenidos = new DefaultTableModel();
            
        private Usuario usuarioAux=null;
        private Usuario_Perfil perfil=null;
     
    /**
     * Creates new form FrmVentana_CalificarContenido
     */
    public FrmVentana_CalificarContenido() {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        this.setSize(new Dimension(900,600));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
          try {
            setIconImage(new ImageIcon(getClass().getResource("../Fondo_Pantalla_Ventanas/imagen.png")).getImage());
        } catch (Exception e) { }
        
        this.modeloTablaContenidos=(DefaultTableModel)this.jTblContenidosDescargados.getModel();
        
    }
    public FrmVentana_CalificarContenido(Usuario usuarioAuxp,Usuario_Perfil perfilAuxp) {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        this.setSize(new Dimension(900,600));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
          try {
            setIconImage(new ImageIcon(getClass().getResource("../Fondo_Pantalla_Ventanas/imagen.png")).getImage());
        } catch (Exception e) { }
        
        this.modeloTablaContenidos=(DefaultTableModel)this.jTblContenidosDescargados.getModel();
        
        this.usuarioAux=usuarioAuxp;
        this.perfil=perfilAuxp;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGrpTipoContenido = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jCbxCalificaciones = new javax.swing.JComboBox<>();
        jTxtContenidoSeleccionado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnAsignarCalificacion = new javax.swing.JButton();
        jBtnCancelarSeleccion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRbdPelicula = new javax.swing.JRadioButton();
        jRbdSerie = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblContenidosDescargados = new javax.swing.JTable();
        jBtnMenu = new javax.swing.JButton();
        jBtnCerrarSesion = new javax.swing.JButton();
        jLblUsuarioLinea = new javax.swing.JLabel();
        jLblFondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Area de calificacion"));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jCbxCalificaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Muy mala", "2 - Mala", "3 - Buena", "4 - Muy buena", "5 - Excelente " }));
        jPanel1.add(jCbxCalificaciones);
        jCbxCalificaciones.setBounds(660, 60, 170, 30);
        jPanel1.add(jTxtContenidoSeleccionado);
        jTxtContenidoSeleccionado.setBounds(340, 60, 262, 30);

        jLabel2.setText("Contenido seleccionado:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 30, 165, 20);

        jLabel3.setText("Calificaciones:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(660, 30, 135, 20);

        jBtnAsignarCalificacion.setText("Asignar calificacion");
        jBtnAsignarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAsignarCalificacionActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAsignarCalificacion);
        jBtnAsignarCalificacion.setBounds(660, 100, 170, 40);

        jBtnCancelarSeleccion.setText("Cancelar seleccion");
        jBtnCancelarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelarSeleccion);
        jBtnCancelarSeleccion.setBounds(340, 100, 136, 25);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("¿Que deseas buscar?"));
        jPanel3.setOpaque(false);

        jGrpTipoContenido.add(jRbdPelicula);
        jRbdPelicula.setText("Pelicula ");
        jRbdPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbdPeliculaActionPerformed(evt);
            }
        });

        jGrpTipoContenido.add(jRbdSerie);
        jRbdSerie.setText("Serie");
        jRbdSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbdSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRbdSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRbdPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRbdPelicula)
                .addGap(18, 18, 18)
                .addComponent(jRbdSerie)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 40, 210, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 880, 180);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenidos descargados:"));
        jPanel2.setOpaque(false);

        jTblContenidosDescargados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Genero", "Año de filmacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblContenidosDescargados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblContenidosDescargadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblContenidosDescargados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 230, 710, 340);

        jBtnMenu.setText("Menu");
        jBtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnMenu);
        jBtnMenu.setBounds(30, 330, 110, 30);

        jBtnCerrarSesion.setText("Cerrar sesion");
        jBtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCerrarSesion);
        jBtnCerrarSesion.setBounds(30, 390, 110, 30);

        jLblUsuarioLinea.setBackground(new java.awt.Color(0, 255, 255));
        jLblUsuarioLinea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLblUsuarioLinea);
        jLblUsuarioLinea.setBounds(540, 10, 350, 30);

        jLblFondoPantalla.setBackground(new java.awt.Color(153, 153, 153));
        jLblFondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Pantalla_Ventanas/FondoPantallaAdminReporte1.jpg"))); // NOI18N
        getContentPane().add(jLblFondoPantalla);
        jLblFondoPantalla.setBounds(0, 0, 910, 595);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    // acciones que suceden al abrirse la ventana
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jBtnCancelarSeleccion.setEnabled(false);
        this.jBtnAsignarCalificacion.setEnabled(false);
        this.jCbxCalificaciones.setEnabled(false);
        
    this.jLblUsuarioLinea.setText("Online: [ Cuenta: "+usuarioAux.getNombre()+
         " / Perfil: "+perfil.getNombre()+" ]");
        
        this.llenaArray_CarritoAux();
    }//GEN-LAST:event_formWindowOpened

     
    
  //===========================================================================  
    private void jRbdPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbdPeliculaActionPerformed
        if(this.jRbdPelicula.isSelected()){
            if(this.cantPelicula()!= 0){
                this.llenaTabla_Pelicula();

            }else{
                 this.jBtnCancelarSeleccion.setEnabled(false);
                 this.jBtnAsignarCalificacion.setEnabled(false);
                 this.jCbxCalificaciones.setEnabled(false);
                 this.llenaTabla_Pelicula();
                 JOptionPane.showMessageDialog(this,"Este perfil aun no ha descargado ninguna pelicula" 
                         , "ALERTA:",JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_jRbdPeliculaActionPerformed

    private void jRbdSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbdSerieActionPerformed
        if(this.jRbdSerie.isSelected()){
          if(this.cantSerie()!= 0){
                    this.llenaTabla_Serie();
            
            
            }else{
                 this.jBtnCancelarSeleccion.setEnabled(false);
                 this.jBtnAsignarCalificacion.setEnabled(false);
                 this.jCbxCalificaciones.setEnabled(false);
                 this.llenaTabla_Serie();
                 JOptionPane.showMessageDialog(this,"Este perfil aun no ha descargado ninguna serie" , 
                         "ALERTA:",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jRbdSerieActionPerformed
  //=========================================================================== 
    
 
    
    
  //**************************************************************************
    private void jBtnCancelarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarSeleccionActionPerformed
        this.jBtnCancelarSeleccion.setEnabled(false);
        this.jBtnAsignarCalificacion.setEnabled(false);
        this.jCbxCalificaciones.setEnabled(false);
        this.jTblContenidosDescargados.clearSelection();
        this.jTxtContenidoSeleccionado.setText("");
        
        contenidoAux=null;
    }//GEN-LAST:event_jBtnCancelarSeleccionActionPerformed

    private void jBtnAsignarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAsignarCalificacionActionPerformed
        if(this.jCbxCalificaciones.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this,"Favor seleccionar una calificacion primero" 
                    , "ERROR ENCONTRADO:",JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        int calificacion= this.calificacionSeleccionada();
        
        int opcion=JOptionPane.showConfirmDialog(this,
                "¿Desea hacer esa calificacion?",
                "Atencion", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        
        if(opcion==0){ // Opcion de confirmacion
            contenidoAux.agregarPuntaje(calificacion);
            try { 
                ContenidoAudioVisual.modificarContenidoAudiovisual(contenidoAux);
            } catch (Exception ex) { System.out.println("error calificacion"); }
            JOptionPane.showMessageDialog(this,"El puntaje ha sido guardado exitosamentre" );
            
        }else if(opcion==1){ // Opcion de negacion
            calificacion=0;
            
        }  
        
        this.jBtnCancelarSeleccion.setEnabled(false);
        this.jBtnAsignarCalificacion.setEnabled(false);
        this.jCbxCalificaciones.setEnabled(false);
        this.jTblContenidosDescargados.clearSelection();
        this.jTxtContenidoSeleccionado.setText("");
        
        contenidoAux=null;
        
    }//GEN-LAST:event_jBtnAsignarCalificacionActionPerformed
  //**************************************************************************
    
    
    
    
  //################################################################################## 
    private void jBtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMenuActionPerformed
         FrmVentana_MenuOpcion frm = new FrmVentana_MenuOpcion(usuarioAux, perfil);
         frm.setLocationRelativeTo(null);
         frm.setVisible(true);        
         this.dispose(); 
    }//GEN-LAST:event_jBtnMenuActionPerformed

    private void jBtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarSesionActionPerformed
        this.dispose();
        FrmVentana_InicioSesion frm = new FrmVentana_InicioSesion();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnCerrarSesionActionPerformed

    private void jTblContenidosDescargadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblContenidosDescargadosMouseClicked
         try {
            
      String codigo = jTblContenidosDescargados.getValueAt(jTblContenidosDescargados.getSelectedRow(), 0).toString();        
            
            try {
                
                this.contenidoAux = ContenidoAudioVisual.consultarContenidoAudiovisual(codigo); 
                
            } catch (Exception ex) {}
            
                this.jBtnCancelarSeleccion.setEnabled(true);
                this.jBtnAsignarCalificacion.setEnabled(true);
                this.jCbxCalificaciones.setEnabled(true);
                this.jTxtContenidoSeleccionado.setText(this.contenidoAux.getTitulo());
                
        } catch (Exception e) { }
    }//GEN-LAST:event_jTblContenidosDescargadosMouseClicked
  //################################################################################## 
     
    
    
    private void llenaArray_Carrito(){
         
            if(perfil.getArrayDescargas().isEmpty()){
                
                for (Descarga descarga : perfil.getArrayDescargas()) {
                      
                   this.arrayCarrito.add( descarga.getContenido() );  
   
                }// fin del forEach
                
            }else{
                JOptionPane.showMessageDialog(this,"Favor hacer primero una descarga con este perfil" 
                        , "ERROR ENCONTRADO:",JOptionPane.ERROR_MESSAGE);
                return;
            }// fin del if isEmpty   
    }
    private void llenaArray_CarritoAux(){
        this.arrayCarrito.clear();
      //  for(Usuario_Perfil perfil: usuarioAux.getArrayPerfiles()){
            
            if(!perfil.getArrayDescargas().isEmpty()){
                
                for(int i=0; i < perfil.getArrayDescargas().size();i++){
                    
                        if(this.esRepetido(perfil.getArrayDescargas().get(i))==false){

                          this.arrayCarrito.add(perfil.getArrayDescargas().get(i).getContenido());
         
                        }// if del esReptido
                    }// fin del for i
                }// fin del if isEmpty  
           //}// fin del forEach        
    }
    
    public boolean esRepetido(Descarga descarga){
        boolean repetido = false;
            for (int i = 0; i < arrayCarrito.size() && !repetido; i++) {
                  if (arrayCarrito.get(i).getCodigo().equalsIgnoreCase(descarga.getContenido().getCodigo())) {
                            // si el valor generado  esta 
                            // dentro del array le marcamos como true y
                            // por lo tanto no lo metera en el array
                            // al poner en la condicion del bucle que 
                            // repetido sea false, cuando lo ponemos a true
                            // salimos y evitamos iteraciones inecesarias
                            repetido = true;
                    }
            }                
      return repetido;
        }
    
    public int cantPelicula(){
       int cont=0;
     //  for(Usuario_Perfil perfil: usuarioAux.getArrayPerfiles()){
            
            if(!perfil.getArrayDescargas().isEmpty()){
                
                for(int i=0; i < perfil.getArrayDescargas().size();i++){
                          
                          if(perfil.getArrayDescargas().get(i).getContenido() instanceof ContenidoPelicula){
                              cont++;
     
                    }// if del esReptido
                }// fin del for i
            }// fin del if isEmpty  
       // }// fin del forEach  
       return cont;
    }
    public int cantSerie(){
       int cont=0;
      // for(Usuario_Perfil perfil: usuarioAux.getArrayPerfiles()){
            
            if(!perfil.getArrayDescargas().isEmpty()){
                
                for(int i=0; i < perfil.getArrayDescargas().size();i++){
                    
  
                          if(perfil.getArrayDescargas().get(i).getContenido() instanceof ContenidoSerie){
                              cont++;
    
                    }// if del esReptido
                }// fin del for i
            }// fin del if isEmpty  
       // }// fin del forEach  
       return cont;
    }
    
    private void llenaTabla_Pelicula(){
        modeloTablaContenidos.setRowCount(0);//Limpia la tabla
        Object[] datos = new Object[4];        
        ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
            this.llenaArray_CarritoAux();
            lista = arrayCarrito;
        
         for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof ContenidoPelicula){
                    datos[0]=lista.get(i).getCodigo();
                    datos[1] = lista.get(i).getTitulo();
                    datos[2] = lista.get(i).getGenero();
                    datos[3] = lista.get(i).devuelveAnnoCreacion();             
                    modeloTablaContenidos.addRow(datos);
                    //Agrega el arreglo como una nueva fila de la tabla
             }
            }  
    }
    private void llenaTabla_Serie(){
        modeloTablaContenidos.setRowCount(0);//Limpia la tabla
        Object[] datos = new Object[4];        
        ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
            this.llenaArray_CarritoAux();
            lista = arrayCarrito;
        
         for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof ContenidoSerie){
                    datos[0]=lista.get(i).getCodigo();
                    datos[1] = lista.get(i).getTitulo();
                    datos[2] = lista.get(i).getGenero();
                    datos[3] = lista.get(i).devuelveAnnoCreacion();          
                    modeloTablaContenidos.addRow(datos);
                    //Agrega el arreglo como una nueva fila de la tabla
             }
            }      
    }
    
    private int calificacionSeleccionada(){
        switch(this.jCbxCalificaciones.getSelectedIndex()){
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 6;
            case 3:
                return 8;  
            case 4:
                return 10;
        }
        return 0;
    }
    
    
    
      
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmVentana_CalificarContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmVentana_CalificarContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmVentana_CalificarContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmVentana_CalificarContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmVentana_CalificarContenido().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAsignarCalificacion;
    private javax.swing.JButton jBtnCancelarSeleccion;
    private javax.swing.JButton jBtnCerrarSesion;
    private javax.swing.JButton jBtnMenu;
    private javax.swing.JComboBox<String> jCbxCalificaciones;
    private javax.swing.ButtonGroup jGrpTipoContenido;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblFondoPantalla;
    private javax.swing.JLabel jLblUsuarioLinea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRbdPelicula;
    private javax.swing.JRadioButton jRbdSerie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblContenidosDescargados;
    private javax.swing.JTextField jTxtContenidoSeleccionado;
    // End of variables declaration//GEN-END:variables
}




//        for(Usuario_Perfil perfil: usuarioAux.getArrayPerfiles()){
//            
//            if(perfil.getArrayDescargas().isEmpty()){
//                
//                for(int i=0; i< perfil.getArrayDescargas().size();i++){
//                    
//                    for(ContenidoAudioVisual contenido: arrayCarrito){
//                        
//                        if(contenido.getCodigo() != perfilAux.getArrayDescargas().get(i).getContenido().getCodigo() ){
//                            
//                           this.arrayCarrito.add( perfilAux.getArrayDescargas().get(i).getContenido() );  
//                           
//                        }
//                    }
//                }// fin del for i
//            }// fin del if isEmpty 
//        }// fin del forEach


// Arrays.stream(arrayCarrito).distinct().forEach(System.out::println);




    
//    
//    private void llenaArray_Carrito(){
//         
//            if(perfilAux.getArrayDescargas().isEmpty()){
//                
//                for (Descarga descarga : perfilAux.getArrayDescargas()) {
//                      
//                   this.arrayCarrito.add( descarga.getContenido() );  
//   
//                }// fin del forEach
//                
//            }else{
//                JOptionPane.showMessageDialog(this,"Favor hacer primero una descarga con este perfil");
//                return;
//            }// fin del if isEmpty   
//    }


//    private void llenaArray_CarritoAux(){
//         
//        for(Usuario_Perfil perfil: usuarioAux.getArrayPerfiles()){
//            
//            if(!perfil.getArrayDescargas().isEmpty()){
//                
//                for(int i=0; i < perfil.getArrayDescargas().size();i++){
//                    
//                        if(this.esRepetido(perfil.getArrayDescargas().get(i))==false){
//                            
//                            try {
//                                for (ContenidoAudioVisual contenidoAudioVisual : ContenidoAudioVisual.listadoContendio()) {  
//                                    
//             if(contenidoAudioVisual.getCodigo().equalsIgnoreCase(perfil.getArrayDescargas().get(i).getContenido().getCodigo())){  
//                                        
//                                        this.arrayCarrito.add(contenidoAudioVisual);
//                                        
//                                   } // fin del if final
//                                }// fin del Archivo
//                            } catch (Exception ex) {  } // fin tryCatch
//                        }// if del esReptido
//                    }// fin del for i
//                }// fin del if isEmpty  
//           }// fin del forEach        
//    }
//    



//    public boolean esRepetido(Descarga descarga){
//        boolean repetido = false;
//            for (int i = 0; i < arrayCarrito.size() && !repetido; i++) {
//                  if (arrayCarrito.get(i).getCodigo().equalsIgnoreCase(descarga.getContenido().getCodigo())) {
//                            // si el valor generado  esta 
//                            // dentro del array le marcamos como true y
//                            // por lo tanto no lo metera en el array
//                            // al poner en la condicion del bucle que 
//                            // repetido sea false, cuando lo ponemos a true
//                            // salimos y evitamos iteraciones inecesarias
//                            repetido = true;
//                    }
//            }
//      return repetido;
//        }
//    



//    public int cantPelicula(){
//       int cont=0;
//       for(Usuario_Perfil perfil: usuarioAux.getArrayPerfiles()){
//            
//            if(!perfil.getArrayDescargas().isEmpty()){
//                
//                for(int i=0; i < perfil.getArrayDescargas().size();i++){
//                    
//                    if(this.esRepetido(perfil.getArrayDescargas().get(i))==false){
//                            
//                          if(perfil.getArrayDescargas().get(i).getContenido() instanceof ContenidoPelicula){
//                              cont++;
//                          }
//                         
//                    }// if del esReptido
//                }// fin del for i
//            }// fin del if isEmpty  
//        }// fin del forEach  
//       return cont;
//    }




//    public int cantSerie(){
//       int cont=0;
//       for(Usuario_Perfil perfil: usuarioAux.getArrayPerfiles()){
//            
//            if(!perfil.getArrayDescargas().isEmpty()){
//                
//                for(int i=0; i < perfil.getArrayDescargas().size();i++){
//                    
//                    if(this.esRepetido(perfil.getArrayDescargas().get(i))==false){
//                            
//                          if(perfil.getArrayDescargas().get(i).getContenido() instanceof ContenidoSerie){
//                              cont++;
//                          }
//                         
//                    }// if del esReptido
//                }// fin del for i
//            }// fin del if isEmpty  
//        }// fin del forEach  
//       return cont;
//    }
//    



//    private void llenaTabla_Pelicula(){
//        modeloTablaContenidos.setRowCount(0);//Limpia la tabla
//        Object[] datos = new Object[5];        
//        ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
//        
//            lista = arrayCarrito;
//        
//         for (int i = 0; i < lista.size(); i++) {
//            if(lista.get(i) instanceof ContenidoPelicula){
//                    datos[0]=lista.get(i).getCodigo();
//                    datos[1] = lista.get(i).getTitulo();
//                    datos[2] = lista.get(i).getGenero();
//                    datos[3] = lista.get(i).devuelveAnnoCreacion();
//                    datos[4] = lista.get(i).puntajeObtenido()+"%";              
//                    modeloTablaContenidos.addRow(datos);
//                    //Agrega el arreglo como una nueva fila de la tabla
//             }
//            }  
//    }




//    private void llenaTabla_Serie(){
//        modeloTablaContenidos.setRowCount(0);//Limpia la tabla
//        Object[] datos = new Object[5];        
//        ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
//        
//            lista = arrayCarrito;
//        
//         for (int i = 0; i < lista.size(); i++) {
//            if(lista.get(i) instanceof ContenidoSerie){
//                    datos[0]=lista.get(i).getCodigo();
//                    datos[1] = lista.get(i).getTitulo();
//                    datos[2] = lista.get(i).getGenero();
//                    datos[3] = lista.get(i).devuelveAnnoCreacion();
//                    datos[4] = lista.get(i).puntajeObtenido()+"%";              
//                    modeloTablaContenidos.addRow(datos);
//                    //Agrega el arreglo como una nueva fila de la tabla
//             }
//            }      
//    }
//    



//    private int calificacionSeleccionada(){
//        switch(this.jCbxCalificaciones.getSelectedIndex()){
//            case 0:
//                return 2;
//            case 1:
//                return 4;
//            case 2:
//                return 6;
//            case 3:
//                return 8;  
//            case 4:
//                return 10;
//        }
//        return 0;
//    }
//    
//