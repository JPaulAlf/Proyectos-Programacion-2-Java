
package CapaInterfaz;

import capaPersistencia.ArchivadorArticulo;
import CapaLogicaNegocios.Articulo;


public class PrincipalApartado {

   
    public static void main(String[] args) {
       FrmMenuPrincipal frmPrincipal = new FrmMenuPrincipal();
       frmPrincipal.setVisible(true);
       frmPrincipal.setLocationRelativeTo(null);
       //El frame del menú principal tiene la propiedad ExtendedState en 6 para que se vea del tamaño de la pantalla
       //Agregar artículos al ArrayList de artículos
       ArchivadorArticulo.agregarArticulo(new Articulo("abc-120","Blusa Escolar",1200));
       ArchivadorArticulo.agregarArticulo(new Articulo("abc-130","Pantalón Escolar",3500));
       ArchivadorArticulo.agregarArticulo(new Articulo("abc-150","Cuaderno de Resorte",800));
       ArchivadorArticulo.agregarArticulo(new Articulo("abc-140","Zapato Escolar",5000));
    }    
    
}
