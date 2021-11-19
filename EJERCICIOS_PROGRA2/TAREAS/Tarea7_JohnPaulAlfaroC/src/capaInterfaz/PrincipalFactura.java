
package capaInterfaz;


import persistencia.PersistenciaProducto;
import persistencia.PersistenciaSucursal;


public class PrincipalFactura {

    public static void main(String[] args) {
        FrmMenuPrincipal frmPrincipal = new FrmMenuPrincipal();
        frmPrincipal.setVisible(true);
        frmPrincipal.setLocationRelativeTo(null);
        PersistenciaSucursal.iniciarSucursales();
        PersistenciaProducto.iniciarProductos();
    }
    
}
