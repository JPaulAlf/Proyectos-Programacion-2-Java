/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;

import Capa_Acceso_Datos.Archivador_Usuarios;
import java.awt.Color;
import java.awt.Dimension;
import Capa_Logica_Negocios.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmVentana_DescargaContenido extends javax.swing.JFrame {
    
    private ArrayList <ContenidoAudioVisual> arrayCarrito = new ArrayList();
    
    // Se encarga de llanar un array auxiliar para la hora de mostrar la factura actual del usuario
    private ArrayList <Descarga> arrayDescargaAux = new ArrayList();
    // Se encarga de llanar un array auxiliar para la hora de mostrar la factura actual del usuario
    private ArrayList <Usuario_Pago> arrayPagosAux = new ArrayList();
    
     
    
        private ContenidoAudioVisual contenidoAux=null;
        DefaultTableModel modeloTablaContenidosPelicula = new DefaultTableModel();
        DefaultTableModel modeloTablaContenidoSerie = new DefaultTableModel();
        DefaultTableModel modeloTablaCarrito= new DefaultTableModel();
        DefaultListModel modeloListaIdiomasPelicula  = new DefaultListModel();
     
        private Usuario usuarioAux=null;
        private Usuario_Perfil perfilAux=null;
        
    public FrmVentana_DescargaContenido() {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        this.setSize(new Dimension(900,600));
        this.jPnlInicio.setBackground(new Color(222,222,222,190));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.modeloTablaContenidoSerie= (DefaultTableModel)this.jTblContenidoAudiovisual.getModel();
        this.modeloTablaContenidosPelicula=(DefaultTableModel)this.jTblContenidoAudiovisual.getModel();
        this.modeloTablaCarrito= (DefaultTableModel)this.jTblContenidoAudiovisualSeleccionado.getModel();
    }
    public FrmVentana_DescargaContenido(Usuario usuarioAuxp,Usuario_Perfil perfilAuxp) {
        initComponents();
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        this.setSize(new Dimension(900,600));
        this.jPnlInicio.setBackground(new Color(222,222,222,190));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.modeloTablaContenidoSerie= (DefaultTableModel)this.jTblContenidoAudiovisual.getModel();
        this.modeloTablaContenidosPelicula=(DefaultTableModel)this.jTblContenidoAudiovisual.getModel();
        this.modeloTablaCarrito= (DefaultTableModel)this.jTblContenidoAudiovisualSeleccionado.getModel();
        
        this.usuarioAux=usuarioAuxp;
        this.perfilAux=perfilAuxp;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBtGrupoContenidoTipo = new javax.swing.ButtonGroup();
        jBtGrupoTipoBusqueda = new javax.swing.ButtonGroup();
        jPnlInicio = new javax.swing.JPanel();
        jTbpOpciones = new javax.swing.JTabbedPane();
        jPnlOpcionContenidoAudioVisual = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jRdbTipoPelicula = new javax.swing.JRadioButton();
        jRdbTipoSerie = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblContenidoAudiovisual = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jRdbBusquedaGenero = new javax.swing.JRadioButton();
        jRdbBusquedaTitulo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jCbxBusquedaGenero = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTxtBusquedaTitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstIdiomasDisponibles = new javax.swing.JList<>();
        jBtnAgregarCarrito = new javax.swing.JButton();
        jBtnCancelarSeleccionCompra = new javax.swing.JButton();
        jBtnVolverMenu = new javax.swing.JButton();
        jLblUsuarioLinea = new javax.swing.JLabel();
        jLblFondoContenidoAudiovisual = new javax.swing.JLabel();
        jPnlOpcionCarrito = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblContenidoAudiovisualSeleccionado = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jBtnRemoverCarrito = new javax.swing.JButton();
        jBtnConfirmaCompra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTxtMuestraSubtotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnCancelarSeleccionCarrito = new javax.swing.JButton();
        jBtnAgregarExtra = new javax.swing.JButton();
        jLblFondoCarrito = new javax.swing.JLabel();
        jPnlOpcionReporte = new javax.swing.JPanel();
        jBtnIrMenu = new javax.swing.JButton();
        jBtnCerrarSesion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTxaMuestraFacturaCompra = new javax.swing.JTextArea();
        jLbFondoReporte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPnlInicio.setBackground(new java.awt.Color(153, 153, 153));

        jTbpOpciones.setOpaque(true);

        jPnlOpcionContenidoAudioVisual.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("¿Que deseas descargar?"));
        jPanel4.setOpaque(false);

        JBtGrupoContenidoTipo.add(jRdbTipoPelicula);
        jRdbTipoPelicula.setText("Pelicula");
        jRdbTipoPelicula.setContentAreaFilled(false);
        jRdbTipoPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbTipoPeliculaActionPerformed(evt);
            }
        });

        JBtGrupoContenidoTipo.add(jRdbTipoSerie);
        jRdbTipoSerie.setText("Serie");
        jRdbTipoSerie.setOpaque(false);
        jRdbTipoSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbTipoSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbTipoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbTipoPelicula))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jRdbTipoPelicula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRdbTipoSerie)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPnlOpcionContenidoAudioVisual.add(jPanel4);
        jPanel4.setBounds(12, 21, 160, 90);

        jTblContenidoAudiovisual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTblContenidoAudiovisual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Genero", "Año de filmacion", "Calificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblContenidoAudiovisual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblContenidoAudiovisualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblContenidoAudiovisual);

        jPnlOpcionContenidoAudioVisual.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 600, 390);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodo de busqueda"));
        jPanel5.setOpaque(false);

        jBtGrupoTipoBusqueda.add(jRdbBusquedaGenero);
        jRdbBusquedaGenero.setText("Genero");
        jRdbBusquedaGenero.setOpaque(false);
        jRdbBusquedaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbBusquedaGeneroActionPerformed(evt);
            }
        });

        jBtGrupoTipoBusqueda.add(jRdbBusquedaTitulo);
        jRdbBusquedaTitulo.setText("Titulo");
        jRdbBusquedaTitulo.setOpaque(false);
        jRdbBusquedaTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbBusquedaTituloActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione un genero");

        jCbxBusquedaGenero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbxBusquedaGeneroItemStateChanged(evt);
            }
        });

        jLabel2.setText("Digite el titulo");

        jTxtBusquedaTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtBusquedaTituloKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbBusquedaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbBusquedaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbxBusquedaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jTxtBusquedaTitulo))
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRdbBusquedaGenero)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtBusquedaTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRdbBusquedaTitulo)
                        .addComponent(jCbxBusquedaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPnlOpcionContenidoAudioVisual.add(jPanel5);
        jPanel5.setBounds(180, 20, 420, 90);

        jLstIdiomasDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Idiomas disponibles"));
        jLstIdiomasDisponibles.setModel(modeloListaIdiomasPelicula);
        jLstIdiomasDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstIdiomasDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jLstIdiomasDisponibles);

        jPnlOpcionContenidoAudioVisual.add(jScrollPane2);
        jScrollPane2.setBounds(630, 170, 210, 220);

        jBtnAgregarCarrito.setText("Agregar al carrito");
        jBtnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarCarritoActionPerformed(evt);
            }
        });
        jPnlOpcionContenidoAudioVisual.add(jBtnAgregarCarrito);
        jBtnAgregarCarrito.setBounds(630, 390, 210, 30);

        jBtnCancelarSeleccionCompra.setText("Cancelar seleccion");
        jBtnCancelarSeleccionCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarSeleccionCompraActionPerformed(evt);
            }
        });
        jPnlOpcionContenidoAudioVisual.add(jBtnCancelarSeleccionCompra);
        jBtnCancelarSeleccionCompra.setBounds(630, 110, 210, 30);

        jBtnVolverMenu.setText("Menu");
        jBtnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverMenuActionPerformed(evt);
            }
        });
        jPnlOpcionContenidoAudioVisual.add(jBtnVolverMenu);
        jBtnVolverMenu.setBounds(730, 460, 110, 30);

        jLblUsuarioLinea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPnlOpcionContenidoAudioVisual.add(jLblUsuarioLinea);
        jLblUsuarioLinea.setBounds(580, 0, 310, 30);

        jLblFondoContenidoAudiovisual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Pantalla_Ventanas/FondoPantallaAdminReporte1.jpg"))); // NOI18N
        jPnlOpcionContenidoAudioVisual.add(jLblFondoContenidoAudiovisual);
        jLblFondoContenidoAudiovisual.setBounds(0, 0, 890, 550);

        jTbpOpciones.addTab("Contenido Audiovisual", jPnlOpcionContenidoAudioVisual);

        jPnlOpcionCarrito.setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenidos seleccionados"));
        jPanel6.setOpaque(false);

        jTblContenidoAudiovisualSeleccionado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTblContenidoAudiovisualSeleccionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Genero", "Año de filmacion", "Calificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblContenidoAudiovisualSeleccionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblContenidoAudiovisualSeleccionadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTblContenidoAudiovisualSeleccionado);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPnlOpcionCarrito.add(jPanel6);
        jPanel6.setBounds(20, 30, 590, 450);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones disponibles"));
        jPanel7.setOpaque(false);

        jBtnRemoverCarrito.setText("Remover articulo");
        jBtnRemoverCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverCarritoActionPerformed(evt);
            }
        });

        jBtnConfirmaCompra.setText("Confirmar compra");
        jBtnConfirmaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmaCompraActionPerformed(evt);
            }
        });

        jLabel3.setText("Subtotal:");

        jTxtMuestraSubtotal.setEditable(false);

        jLabel4.setText("Para remover un articulo, favor");

        jLabel5.setText("seleccionarlo en la tabla");

        jBtnCancelarSeleccionCarrito.setText("Cancelar seleccion");
        jBtnCancelarSeleccionCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarSeleccionCarritoActionPerformed(evt);
            }
        });

        jBtnAgregarExtra.setText("Agregar extra");
        jBtnAgregarExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBtnRemoverCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBtnCancelarSeleccionCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTxtMuestraSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnAgregarExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnConfirmaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jBtnRemoverCarrito)
                .addGap(5, 5, 5)
                .addComponent(jBtnCancelarSeleccionCarrito)
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTxtMuestraSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnConfirmaCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAgregarExtra)
                .addContainerGap())
        );

        jPnlOpcionCarrito.add(jPanel7);
        jPanel7.setBounds(620, 60, 240, 390);

        jLblFondoCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Pantalla_Ventanas/FondoPantallaAdminReporte1.jpg"))); // NOI18N
        jPnlOpcionCarrito.add(jLblFondoCarrito);
        jLblFondoCarrito.setBounds(0, 0, 890, 520);

        jTbpOpciones.addTab("Carrito", jPnlOpcionCarrito);

        jPnlOpcionReporte.setLayout(null);

        jBtnIrMenu.setText("Menu");
        jBtnIrMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIrMenuActionPerformed(evt);
            }
        });
        jPnlOpcionReporte.add(jBtnIrMenu);
        jBtnIrMenu.setBounds(660, 80, 200, 40);

        jBtnCerrarSesion.setText("Cerrar Sesion");
        jBtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarSesionActionPerformed(evt);
            }
        });
        jPnlOpcionReporte.add(jBtnCerrarSesion);
        jBtnCerrarSesion.setBounds(660, 140, 200, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);

        jTxaMuestraFacturaCompra.setEditable(false);
        jTxaMuestraFacturaCompra.setColumns(20);
        jTxaMuestraFacturaCompra.setRows(5);
        jTxaMuestraFacturaCompra.setToolTipText("");
        jTxaMuestraFacturaCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Gracias por su compra, que la disfrutes...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jScrollPane4.setViewportView(jTxaMuestraFacturaCompra);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPnlOpcionReporte.add(jPanel1);
        jPanel1.setBounds(30, 30, 610, 470);

        jLbFondoReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Pantalla_Ventanas/FondoPantallaAdminReporte1.jpg"))); // NOI18N
        jPnlOpcionReporte.add(jLbFondoReporte);
        jLbFondoReporte.setBounds(0, 0, 890, 520);

        jTbpOpciones.addTab("Reporte", jPnlOpcionReporte);

        javax.swing.GroupLayout jPnlInicioLayout = new javax.swing.GroupLayout(jPnlInicio);
        jPnlInicio.setLayout(jPnlInicioLayout);
        jPnlInicioLayout.setHorizontalGroup(
            jPnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlInicioLayout.createSequentialGroup()
                .addComponent(jTbpOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPnlInicioLayout.setVerticalGroup(
            jPnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTbpOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        getContentPane().add(jPnlInicio);
        jPnlInicio.setBounds(0, 0, 894, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // acciones que se dan al abrir la ventana por primera vez
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.objetosDesactivados();
        this.llenaCombo_Genero();
        
    this.jLblUsuarioLinea.setText("Online: [ Cuenta: "+usuarioAux.getNombre()+
                 " / Perfil: "+perfilAux.getNombre()+" ]");
                 
    }//GEN-LAST:event_formWindowOpened

    
//===========================================================================================
// OBJETOS PRIMER VENTANA, CONTENIDO AUDIOVISUAL **SELECCION Y AGREGUE**
    private void jRdbTipoPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbTipoPeliculaActionPerformed
        if(this.jRdbTipoPelicula.isSelected()){
          if(this.cantidadPelicula()!= 0){
            this.llenaTabla_ContenidosPelicula();
            this.jRdbBusquedaGenero.setEnabled(true);
            this.jRdbBusquedaTitulo.setEnabled(true);
        }else{
                 this.jRdbBusquedaGenero.setEnabled(false);
                 this.jRdbBusquedaTitulo.setEnabled(false);
                 this.jCbxBusquedaGenero.setEnabled(false);
                 this.jTxtBusquedaTitulo.setEnabled(false);
              this.llenaTabla_ContenidosPelicula();
            JOptionPane.showMessageDialog(this, "Lo sentimos por el momento no tenemos peliculas disponibles" 
                    , "ALERTA:",JOptionPane.WARNING_MESSAGE);
        }
        }
    }//GEN-LAST:event_jRdbTipoPeliculaActionPerformed
// listo
    private void jRdbTipoSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbTipoSerieActionPerformed
        if(this.jRdbTipoSerie.isSelected()){
             if(this.cantidadSerie()!= 0){
                this.llenaTabla_ContenidoSerie();
                this.jRdbBusquedaGenero.setEnabled(true);
                this.jRdbBusquedaTitulo.setEnabled(true);
        }else{
                 this.jRdbBusquedaGenero.setEnabled(false);
                 this.jRdbBusquedaTitulo.setEnabled(false);
                 this.jCbxBusquedaGenero.setEnabled(false);
                 this.jTxtBusquedaTitulo.setEnabled(false);
            this.llenaTabla_ContenidoSerie();
            JOptionPane.showMessageDialog(this, "Lo sentimos por el momento no tenemos series disponibles" 
                    , "ALERTA:",JOptionPane.WARNING_MESSAGE);
        }
        }
    }//GEN-LAST:event_jRdbTipoSerieActionPerformed
// listo
    private void jRdbBusquedaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbBusquedaGeneroActionPerformed
        if(this.jRdbBusquedaGenero.isSelected()){
            this.jCbxBusquedaGenero.setEnabled(true);
              this.jTxtBusquedaTitulo.setEnabled(false);
               this.jTblContenidoAudiovisual.setEnabled(true);
               
            if(this.jRdbTipoPelicula.isSelected()){
                this.llenaTabla_ContenidosPelicula();
             }
            if(this.jRdbTipoSerie.isSelected()){
               this.llenaTabla_ContenidoSerie();
            }
            
        }
    }//GEN-LAST:event_jRdbBusquedaGeneroActionPerformed
// listo
    private void jRdbBusquedaTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbBusquedaTituloActionPerformed
      if(this.jRdbBusquedaTitulo.isSelected()){
          this.jTxtBusquedaTitulo.setEnabled(true);
             this.jCbxBusquedaGenero.setEnabled(false);
               this.jTblContenidoAudiovisual.setEnabled(true);
               
            if(this.jRdbTipoPelicula.isSelected()){
                this.llenaTabla_ContenidosPelicula();
             }
            if(this.jRdbTipoSerie.isSelected()){
               this.llenaTabla_ContenidoSerie();
            }
            
      }
    }//GEN-LAST:event_jRdbBusquedaTituloActionPerformed
// listo
    private void jBtnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarCarritoActionPerformed
        this.arrayCarrito.add(contenidoAux);
        this.llenaTabla_Carrito(); 
        this.jTxtBusquedaTitulo.setText("");
        this.jCbxBusquedaGenero.setSelectedIndex(0);
        this.jTbpOpciones.setEnabledAt(0, false);
        this.jTbpOpciones.setEnabledAt(1, true);
        this.jTbpOpciones.setEnabledAt(2, false);
        this.jTbpOpciones.setSelectedIndex(1);
        
        DecimalFormat formatoDinero = new DecimalFormat("###,###,###,##0.##");
        this.jTxtMuestraSubtotal.setText(formatoDinero.format(this.dineroCarrito())+" $");
        
    }//GEN-LAST:event_jBtnAgregarCarritoActionPerformed
// listo
//===========================================================================================
  
    
    
//*****************************************************************************************
//OBJETOS SEGUNDA VENTANA, ** CARRITO**
    private void jBtnRemoverCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverCarritoActionPerformed
        this.arrayCarrito.remove(this.jTblContenidoAudiovisualSeleccionado.getSelectedRow());
        this.modeloTablaCarrito.removeRow(this.jTblContenidoAudiovisualSeleccionado.getSelectedRow()); 
        
        this.jTxtMuestraSubtotal.setText(Integer.toString(this.dineroCarrito())+" $");
    }//GEN-LAST:event_jBtnRemoverCarritoActionPerformed
// listo
    
    private void jBtnConfirmaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmaCompraActionPerformed
        if((arrayCarrito.size()-1) >= 0){ // el arraylist empieza a contar en 1, por eso se le hace la resta
          int contadorDescarga=1;
          
//=========================================================================================================================
          
            for (ContenidoAudioVisual contenidoAudioVisual : arrayCarrito) {
                
               this.perfilAux.cargaArrayDescargas(new Descarga( LocalDateTime.now(), contenidoAudioVisual ));
               this.arrayDescargaAux.add(new Descarga( LocalDateTime.now(), contenidoAudioVisual ));
               
               if(contenidoAudioVisual instanceof ContenidoPelicula){
      usuarioAux.getTarjeta().agregarPago(new Usuario_Pago(LocalDateTime.now(),contenidoAudioVisual.cargoXDescarga()));
                    
                   // Se encarga de llanar un array auxiliar para la hora de mostrar la factura actual del usuario
                   arrayPagosAux.add(new Usuario_Pago(LocalDateTime.now(),contenidoAudioVisual.cargoXDescarga()));
                   
               }else if(contenidoAudioVisual instanceof ContenidoSerie){
      usuarioAux.getTarjeta().agregarPago(new Usuario_Pago(LocalDateTime.now(),((ContenidoSerie) contenidoAudioVisual).totalDescuento()));
                   
                   // Se encarga de llanar un array auxiliar para la hora de mostrar la factura actual del usuario
                   arrayPagosAux.add(new Usuario_Pago(LocalDateTime.now(),((ContenidoSerie) contenidoAudioVisual).totalDescuento()));
               }
               
                contenidoAudioVisual.contDescargaActualizacion();
                Validacion.actualizaContenidoAudiovisual(contenidoAudioVisual);
                
                System.out.println("Compra efectuada: "+contadorDescarga);
                contadorDescarga++;
                
            }// fin del for
            
//=========================================================================================================================
           for (int i = 0; i < perfilAux.getArrayDescargas().size(); i++) {
                perfilAux.getArrayDescargas().get(i).setNumDescarga(i+1);
            }
             
           for (int i = 0; i < arrayDescargaAux.size(); i++) {
                arrayDescargaAux.get(i).setNumDescarga(i+1);
            }
            

             
            // Abre la ventana de reporte de la factura:
            this.jTbpOpciones.setEnabledAt(0, false);
            this.jTbpOpciones.setEnabledAt(1, false);
            this.jTbpOpciones.setEnabledAt(2, true);
            this.jTbpOpciones.setSelectedIndex(2);
            this.arrayCarrito.clear();   
            
            // Muestra un ToString auxiliar, ya que uno actual contendria todos los contenidos descargados
            // con anterioridad y actuales
            this.jTxaMuestraFacturaCompra.setText(usuarioAux.reporteDescargaCompra(perfilAux, arrayDescargaAux, arrayPagosAux));
            
            this.jBtnCerrarSesion.setEnabled(true);
            this.jBtnIrMenu.setEnabled(true);
            
        }else{
            JOptionPane.showMessageDialog(this, "Favor comprar un articulo primero..." 
                    , "ERROR ENCONTRADO:",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnConfirmaCompraActionPerformed
// !!! es el que se encarga de toda la accion en la ventana !!!!
//*****************************************************************************************
    
    
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//OBJETOS DE LA TERCER VENTANA, ** REPORTES **    
    private void jBtnIrMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIrMenuActionPerformed
        // abre de nuevo el menu de opciones
        // verificar sobreescribimiento
        FrmVentana_MenuOpcion frm = new FrmVentana_MenuOpcion(usuarioAux, perfilAux);
         frm.setLocationRelativeTo(null);
         frm.setVisible(true);        
         this.dispose(); 
    }//GEN-LAST:event_jBtnIrMenuActionPerformed

    private void jBtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarSesionActionPerformed
        this.dispose();
        FrmVentana_InicioSesion frm = new FrmVentana_InicioSesion();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnCerrarSesionActionPerformed
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   
   
    
//-----------------------------------------------------------------------------------------    
 // EVENTOS DE TABLAS Y LISTAS ** EVENTOS ESPECIALES   
    private void jTblContenidoAudiovisualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblContenidoAudiovisualMouseClicked
        try {
            
            String codigo = jTblContenidoAudiovisual.getValueAt(jTblContenidoAudiovisual.getSelectedRow(), 0).toString();            
            try {
                this.contenidoAux = ContenidoAudioVisual.consultarContenidoAudiovisual(codigo);                
            } catch (Exception ex) {
            }
            this.llenaLista_Idiomas();
            this.jBtnCancelarSeleccionCompra.setEnabled(true);
        } catch (Exception e) { }
    }//GEN-LAST:event_jTblContenidoAudiovisualMouseClicked
// listo
    private void jTblContenidoAudiovisualSeleccionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblContenidoAudiovisualSeleccionadoMouseClicked
        try {
            this.jBtnRemoverCarrito.setEnabled(true);            
            this.jBtnCancelarSeleccionCarrito.setEnabled(true);
            this.jBtnConfirmaCompra.setEnabled(false);
            this.jBtnAgregarExtra.setEnabled(false);
        } catch (Exception e) { }
    }//GEN-LAST:event_jTblContenidoAudiovisualSeleccionadoMouseClicked
// listo
    private void jCbxBusquedaGeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbxBusquedaGeneroItemStateChanged
     this.llenaTabla_BusquedaGenero((TIPO_GENERO)this.jCbxBusquedaGenero.getSelectedItem());
    }//GEN-LAST:event_jCbxBusquedaGeneroItemStateChanged
// listo
    private void jTxtBusquedaTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBusquedaTituloKeyTyped
       this.llenaTabla_BusquedaTitulo(this.jTxtBusquedaTitulo.getText());
    }//GEN-LAST:event_jTxtBusquedaTituloKeyTyped
// listo
    private void jBtnCancelarSeleccionCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarSeleccionCompraActionPerformed
        this.contenidoAux=null;
        this.jBtnCancelarSeleccionCompra.setEnabled(false);   
        this.jBtnAgregarCarrito.setEnabled(false);
        this.jTblContenidoAudiovisual.clearSelection();

        
        this.modeloListaIdiomasPelicula.clear();
    }//GEN-LAST:event_jBtnCancelarSeleccionCompraActionPerformed
// listo
    private void jBtnCancelarSeleccionCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarSeleccionCarritoActionPerformed
       this.jBtnCancelarSeleccionCarrito.setEnabled(false);
       this.jBtnRemoverCarrito.setEnabled(false);  
       this.jTblContenidoAudiovisualSeleccionado.clearSelection();
       this.jBtnConfirmaCompra.setEnabled(true);
       this.jBtnAgregarExtra.setEnabled(true);
    }//GEN-LAST:event_jBtnCancelarSeleccionCarritoActionPerformed
// listo
    private void jBtnAgregarExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarExtraActionPerformed
        this.jTbpOpciones.setEnabledAt(0, true);
        this.jTbpOpciones.setEnabledAt(1, false);
        this.jTbpOpciones.setEnabledAt(2, false);
        this.jTbpOpciones.setSelectedIndex(0);
        
        modeloTablaContenidosPelicula.setRowCount(0);
        modeloTablaContenidoSerie.setRowCount(0);
        
        this.JBtGrupoContenidoTipo.clearSelection();
        this.jBtGrupoTipoBusqueda.clearSelection();
        
         this.contenidoAux=null;
         this.jBtnCancelarSeleccionCompra.setEnabled(false); 
         this.modeloListaIdiomasPelicula.clear();
         this.jTblContenidoAudiovisual.clearSelection();
         this.objetosDesactivados();
    }//GEN-LAST:event_jBtnAgregarExtraActionPerformed
// listo
    private void jLstIdiomasDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstIdiomasDisponiblesMouseClicked
       int indice = jLstIdiomasDisponibles.getSelectedIndex();
       if(indice >= 0){
           this.jBtnAgregarCarrito.setEnabled(true);
       }
       else{
           JOptionPane.showMessageDialog(null, "Debe seleccionar un idioma de la lista" 
                   , "ERROR ENCONTRADO:",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jLstIdiomasDisponiblesMouseClicked
// listo
    private void jBtnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverMenuActionPerformed
        // abre de nuevo el menu de opciones
        // verificar sobreescribimiento
        FrmVentana_MenuOpcion frm = new FrmVentana_MenuOpcion(usuarioAux, perfilAux);
         frm.setLocationRelativeTo(null);
         frm.setVisible(true);        
         this.dispose(); 
    }//GEN-LAST:event_jBtnVolverMenuActionPerformed
//-----------------------------------------------------------------------------------------    
    
    
    
    
    
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%    
    // METODOS EXTRAS, DAN FORMA A LA VENTANA **no tocar**
    private void objetosDesactivados(){
        this.jBtnCerrarSesion.setEnabled(false);
        this.jBtnIrMenu.setEnabled(false);
        this.jBtnRemoverCarrito.setEnabled(false);
        this.jBtnAgregarCarrito.setEnabled(false);
        this.jCbxBusquedaGenero.setEnabled(false);
        this.jTxtBusquedaTitulo.setEnabled(false);
        this.jRdbBusquedaGenero.setEnabled(false);
        this.jRdbBusquedaTitulo.setEnabled(false);
        this.jBtnCancelarSeleccionCompra.setEnabled(false);
        this.jTblContenidoAudiovisual.setEnabled(false);
        this.jBtnCancelarSeleccionCarrito.setEnabled(false);
        this.jBtnAgregarCarrito.setEnabled(false);
        
        this.jTbpOpciones.setEnabledAt(0, true);
        this.jTbpOpciones.setEnabledAt(1, false);
        this.jTbpOpciones.setEnabledAt(2, false);
        this.jTbpOpciones.setSelectedIndex(0);
        
    }
    
    private void llenaTabla_ContenidosPelicula(){
        
        modeloTablaContenidosPelicula.setRowCount(0);//Limpia la tabla
        Object[] datos = new Object[5];        
        ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
        
        try {
            // trae contenido del archivo
           lista = ContenidoAudioVisual.listadoContendio(); 
        } catch (Exception e) { }
        
         for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof ContenidoPelicula){
                    datos[0]=lista.get(i).getCodigo();
                    datos[1] = lista.get(i).getTitulo();
                    datos[2] = lista.get(i).getGenero();
                    datos[3] = lista.get(i).devuelveAnnoCreacion();
                    datos[4] = lista.get(i).puntajeObtenido()+"%";
                    modeloTablaContenidosPelicula.addRow(datos);
                    //Agrega el arreglo como una nueva fila de la tabla
       }
     }
    }
    private void llenaTabla_ContenidoSerie(){
         
        modeloTablaContenidoSerie.setRowCount(0);//Limpia la tabla
        Object[] datos = new Object[5];        
        ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
        
        try {
            // trae contenido del archivo
           lista = ContenidoAudioVisual.listadoContendio(); 
        } catch (Exception e) { }
        
         for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof ContenidoSerie){
                    datos[0]=lista.get(i).getCodigo();
                    datos[1] = lista.get(i).getTitulo();
                    datos[2] = lista.get(i).getGenero();
                    datos[3] = lista.get(i).devuelveAnnoCreacion();
                    datos[4] = lista.get(i).puntajeObtenido()+"%";
                    modeloTablaContenidoSerie.addRow(datos);
                    //Agrega el arreglo como una nueva fila de la tabla
       }
     }
    }
    private void llenaTabla_Carrito(){
        modeloTablaCarrito.setRowCount(0);//Limpia la tabla
        Object[] datos = new Object[5];  
           for (int i = 0; i < arrayCarrito.size(); i++) {
                    datos[0] = arrayCarrito.get(i).getCodigo();
                    datos[1] = arrayCarrito.get(i).getTitulo();
                    datos[2] = arrayCarrito.get(i).getGenero();
                    datos[3] = arrayCarrito.get(i).devuelveAnnoCreacion();
                    datos[4] = arrayCarrito.get(i).puntajeObtenido()+"%";
                    modeloTablaCarrito.addRow(datos);
                    //Agrega el arreglo como una nueva fila de la tabla
     }
        
    }
    private void llenaLista_Idiomas(){
       modeloListaIdiomasPelicula.clear();
        for (TIPOS_IDIOMAS idioma : this.contenidoAux.getIdiomasDisponibles() ) {
            this.modeloListaIdiomasPelicula.addElement(idioma);
        } 
    }
    private void llenaCombo_Genero(){
        for (TIPO_GENERO genero : TIPO_GENERO.values()) {
            this.jCbxBusquedaGenero.addItem(genero);
        }
    }
    
    
    private void llenaTabla_BusquedaGenero(TIPO_GENERO genero){
       Object[] datos = new Object[5];        
       ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
        try {
            // trae contenido del archivo
           lista = ContenidoAudioVisual.listadoContendio(); 
        } catch (Exception e) { }
        
        if(this.jRdbTipoPelicula.isSelected()){
            modeloTablaContenidosPelicula.setRowCount(0);
                for (int i = 0; i < lista.size(); i++) {
                     if(lista.get(i) instanceof ContenidoPelicula){
                          if(lista.get(i).getGenero().equals(genero)){
                              datos[0]=lista.get(i).getCodigo();
                              datos[1] = lista.get(i).getTitulo();
                              datos[2] = lista.get(i).getGenero();
                              datos[3] = lista.get(i).devuelveAnnoCreacion();
                              datos[4] = lista.get(i).puntajeObtenido()+"%";
                             modeloTablaContenidosPelicula.addRow(datos);
                            //Agrega el arreglo como una nueva fila de la tabla
                          }
                    }   
             }
       } 
       if(this.jRdbTipoSerie.isSelected()){
           modeloTablaContenidoSerie.setRowCount(0);
             for (int i = 0; i < lista.size(); i++) {
                     if(lista.get(i) instanceof ContenidoSerie){
                          if(lista.get(i).getGenero().equals(genero)){
                              datos[0]=lista.get(i).getCodigo();
                              datos[1] = lista.get(i).getTitulo();
                              datos[2] = lista.get(i).getGenero();
                              datos[3] = lista.get(i).devuelveAnnoCreacion();
                              datos[4] = lista.get(i).puntajeObtenido()+"%";
                             modeloTablaContenidoSerie.addRow(datos);
                            //Agrega el arreglo como una nueva fila de la tabla
                          }
                    }   
             }
       } 
    }
    private void llenaTabla_BusquedaTitulo(String titulo){
       Object[] datos = new Object[5];        
       ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
        try {
            // trae contenido del archivo
           lista = ContenidoAudioVisual.listadoContendio(); 
        } catch (Exception e) { }
        
        if(this.jRdbTipoPelicula.isSelected()){
            modeloTablaContenidosPelicula.setRowCount(0);
                for (int i = 0; i < lista.size(); i++) {
                     if(lista.get(i) instanceof ContenidoPelicula){
                          if(lista.get(i).getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                              datos[0]=lista.get(i).getCodigo();
                              datos[1] = lista.get(i).getTitulo();
                              datos[2] = lista.get(i).getGenero();
                              datos[3] = lista.get(i).devuelveAnnoCreacion();
                              datos[4] = lista.get(i).puntajeObtenido()+"%";
                             modeloTablaContenidosPelicula.addRow(datos);
                            //Agrega el arreglo como una nueva fila de la tabla
                          }
                    }   
             }
       } 
       if(this.jRdbTipoSerie.isSelected()){
           modeloTablaContenidoSerie.setRowCount(0);
             for (int i = 0; i < lista.size(); i++) {
                     if(lista.get(i) instanceof ContenidoSerie){
                          if(lista.get(i).getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                              datos[0]=lista.get(i).getCodigo();
                              datos[1] = lista.get(i).getTitulo();
                              datos[2] = lista.get(i).getGenero();
                              datos[3] = lista.get(i).devuelveAnnoCreacion();
                              datos[4] = lista.get(i).puntajeObtenido()+"%";
                             modeloTablaContenidoSerie.addRow(datos);
                            //Agrega el arreglo como una nueva fila de la tabla
                          }
                    }   
             }
       }
    }
    private void llenaTabla_BusquedaTitulo2(String titulo){
       Object[] datos = new Object[5];        
       ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
        try {
            // trae contenido del archivo
           lista = ContenidoAudioVisual.listadoContendio(); 
        } catch (Exception e) { }
        
        if(this.jRdbTipoPelicula.isSelected()){
            modeloTablaContenidosPelicula.setRowCount(0);
                for (int i = 0; i < lista.size(); i++) {
                     if(lista.get(i) instanceof ContenidoPelicula){
                           if(lista.get(i).getTitulo().toLowerCase().indexOf(titulo.toLowerCase()) != -1){
                              datos[0]=lista.get(i).getCodigo();
                              datos[1] = lista.get(i).getTitulo();
                              datos[2] = lista.get(i).getGenero();
                              datos[3] = lista.get(i).devuelveAnnoCreacion();
                              datos[4] = lista.get(i).puntajeObtenido()+"%";
                             modeloTablaContenidosPelicula.addRow(datos);
                            //Agrega el arreglo como una nueva fila de la tabla
                          }
                    }   
             }
       } 
       if(this.jRdbTipoSerie.isSelected()){
           modeloTablaContenidoSerie.setRowCount(0);
             for (int i = 0; i < lista.size(); i++) {
                     if(lista.get(i) instanceof ContenidoSerie){
                          if(lista.get(i).getTitulo().toLowerCase().indexOf(titulo.toLowerCase()) != -1){
                              datos[0]=lista.get(i).getCodigo();
                              datos[1] = lista.get(i).getTitulo();
                              datos[2] = lista.get(i).getGenero();
                              datos[3] = lista.get(i).devuelveAnnoCreacion();
                              datos[4] = lista.get(i).puntajeObtenido()+"%";
                             modeloTablaContenidoSerie.addRow(datos);
                            //Agrega el arreglo como una nueva fila de la tabla
                          }
                    }   
             }
       }
    }
    
    
    private int cantidadPelicula(){
        int contador=0;
      ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
       try {
            // trae contenido del archivo
           lista = ContenidoAudioVisual.listadoContendio(); 
        } catch (Exception e) { }
        
       for(ContenidoAudioVisual contenido : lista){
            if(contenido instanceof ContenidoPelicula){
                contador++;
            }
         }
       return contador;
    }
    private int cantidadSerie(){
            int contador=0;
      ArrayList<ContenidoAudioVisual> lista= new ArrayList<ContenidoAudioVisual>();
       try {
            // trae contenido del archivo
           lista = ContenidoAudioVisual.listadoContendio(); 
        } catch (Exception e) { }
        
       for(ContenidoAudioVisual contenido : lista){
            if(contenido instanceof ContenidoSerie){
                contador++;
            }
         }
       return contador;
    }   
    
    public int dineroCarrito(){
      int dineroCarrito=0;
        for (ContenidoAudioVisual contenidoAudioVisual : arrayCarrito) {
            if(contenidoAudioVisual instanceof ContenidoPelicula){
                dineroCarrito+=contenidoAudioVisual.cargoXDescarga();
            }else if(contenidoAudioVisual instanceof ContenidoSerie){
                dineroCarrito+=((ContenidoSerie) contenidoAudioVisual).totalDescuento();
            }
        } 
        return dineroCarrito;
    }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%       
  
    
//    
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
//            java.util.logging.Logger.getLogger(FrmVentana_DescargaContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmVentana_DescargaContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmVentana_DescargaContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmVentana_DescargaContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmVentana_DescargaContenido().setVisible(true);
//            }
//        });
//    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup JBtGrupoContenidoTipo;
    private javax.swing.ButtonGroup jBtGrupoTipoBusqueda;
    private javax.swing.JButton jBtnAgregarCarrito;
    private javax.swing.JButton jBtnAgregarExtra;
    private javax.swing.JButton jBtnCancelarSeleccionCarrito;
    private javax.swing.JButton jBtnCancelarSeleccionCompra;
    private javax.swing.JButton jBtnCerrarSesion;
    private javax.swing.JButton jBtnConfirmaCompra;
    private javax.swing.JButton jBtnIrMenu;
    private javax.swing.JButton jBtnRemoverCarrito;
    private javax.swing.JButton jBtnVolverMenu;
    private javax.swing.JComboBox<TIPO_GENERO> jCbxBusquedaGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLbFondoReporte;
    private javax.swing.JLabel jLblFondoCarrito;
    private javax.swing.JLabel jLblFondoContenidoAudiovisual;
    private javax.swing.JLabel jLblUsuarioLinea;
    private javax.swing.JList<TIPOS_IDIOMAS> jLstIdiomasDisponibles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPnlInicio;
    private javax.swing.JPanel jPnlOpcionCarrito;
    private javax.swing.JPanel jPnlOpcionContenidoAudioVisual;
    private javax.swing.JPanel jPnlOpcionReporte;
    private javax.swing.JRadioButton jRdbBusquedaGenero;
    private javax.swing.JRadioButton jRdbBusquedaTitulo;
    private javax.swing.JRadioButton jRdbTipoPelicula;
    private javax.swing.JRadioButton jRdbTipoSerie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTblContenidoAudiovisual;
    private javax.swing.JTable jTblContenidoAudiovisualSeleccionado;
    private javax.swing.JTabbedPane jTbpOpciones;
    private javax.swing.JTextArea jTxaMuestraFacturaCompra;
    private javax.swing.JTextField jTxtBusquedaTitulo;
    private javax.swing.JTextField jTxtMuestraSubtotal;
    // End of variables declaration//GEN-END:variables
}
