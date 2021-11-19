/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public abstract class Usuario implements Serializable{
    protected String correo;
    protected String nombre;
    protected Usuario_PaisOrigen paisOrigen;
    protected String contrasenna;
    protected Usuario_Tarjeta tarjeta;
    protected ArrayList<Usuario_Perfil> arrayPerfiles;
    
    // constructores
    public Usuario(String nombre,String correo, String contrasenna, Usuario_Tarjeta tarjeta){
        this.correo = correo;
        this.nombre=nombre;
        this.contrasenna = contrasenna;
        this.tarjeta=tarjeta;
        this.arrayPerfiles= new ArrayList();   
     }
    public Usuario(String correo, String contrasenna,String nombre) {
        this.correo = correo;
        this.nombre=nombre;
        this.contrasenna = contrasenna;
       this.arrayPerfiles= new ArrayList();   
    }  
    public Usuario(String correo, String contrasenna){
        this.correo= correo;
        this.contrasenna=contrasenna;
        this.arrayPerfiles= new ArrayList();   
    }
    public Usuario(){
         this.arrayPerfiles= new ArrayList();   
    }
    
    // metodos set and get
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasenna() {
        return contrasenna;
    }
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Usuario_PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(Usuario_PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public Usuario_Tarjeta getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(Usuario_Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    public ArrayList<Usuario_Perfil> getArrayPerfiles() {
        return arrayPerfiles;
    }
    public void setArrayPerfiles(ArrayList<Usuario_Perfil> arrayPerfiles) {
        this.arrayPerfiles = arrayPerfiles;
    }
    

    // metodos:
    public abstract double costoInscripcion();
    public abstract void agregarPerfil(String nombre); 
    public abstract String muestraPerfiles();
    @Override
    public String toString() {
        return "\nPropietario de cuenta: "+this.nombre+
                paisOrigen+
                "\nCorreo electronico: "+this.correo+
                "\nContraseña de usuario: "+this.contrasenna+
                "\nCosto de la inscripcion: "+costoInscripcion()+" dolares"+
                "\nInformacion de la tarjeta ingresada: "+ tarjeta.toString();
                
    }
    
    
    // Este toString es para la ventana de administracion, en el apartado de reportes de usuarios...
    // que solicitan todas las descargas, y cantidades de cada contenido, asi como cuanto... 
    // pago en total ese usuario.
    public String reporteDescargaAdmin(){
        DecimalFormat formatoDinero = new DecimalFormat("###,###,###,##0.0##");
        int contPeliculas=0;
        int contSeries=0;
        double totalPagadoDolares=0;  
        double totalPagadoColones=0;
        
        StringBuilder hilera = new StringBuilder("");
        hilera.append("\nNombre de la cuenta: ").append(this.nombre);
        hilera.append("\nDescargas realizadas por perfil de la cuenta: \n");
        
        for(Usuario_Perfil perfil : arrayPerfiles){
            hilera.append(perfil.toString());
            hilera.append("\n<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>\n");
            
            contPeliculas+=perfil.contPeliculas();
            contSeries+=perfil.contSeries();
        }
        if(!tarjeta.getArrayPagos().isEmpty()){
            for(Usuario_Pago pago : tarjeta.getArrayPagos()){
                    totalPagadoDolares+=pago.getMontoPagoDolares();
                    totalPagadoColones+=pago.conversionColones(); 
             }
        }else{
            totalPagadoColones+=0;
            totalPagadoDolares+=0;
         }
        hilera.append("\nCantidad de peliculas descargadas: ").append(contPeliculas);
        hilera.append("\nCantidad de series descargadas: ").append(contSeries);
          hilera.append("\n");
          
        int decDolares= Integer.parseInt(formatoDinero.format(totalPagadoDolares).substring(formatoDinero.format(totalPagadoDolares).indexOf('.') + 1));
        int decColones= Integer.parseInt(formatoDinero.format(totalPagadoColones).substring(formatoDinero.format(totalPagadoColones).indexOf('.') + 1));
        
        hilera.append("\nTotal pagado en dolares: ").append("$"+formatoDinero.format(totalPagadoDolares));
        hilera.append( "\n"+Validacion.precioEnLetras((int) totalPagadoDolares) +" DOLARES, CON "
                +Validacion.precioEnLetras(decDolares)+" CENTAVOS\n");
        
        hilera.append("\nTotal pagado en colones: ").append("₡"+formatoDinero.format(totalPagadoColones));
        hilera.append( "\n"+Validacion.precioEnLetras((int)totalPagadoColones) +" COLONES, CON "
                +Validacion.precioEnLetras(decColones)+" CENTAVOS\n");
        
        
        return hilera.toString();
    }
    //Reporte d ela compra echa actualmente, debe ser este o sino iria con datos inecesarios y redundantes
    public String reporteDescargaCompra(Usuario_Perfil perfilp, ArrayList <Descarga> arrayDescargaAux,ArrayList <Usuario_Pago> arrayPagosAux){
      
        DecimalFormat formatoDinero = new DecimalFormat("###,###,###,##0.0##");
        
        ArrayList <Descarga> arrayDescarga=arrayDescargaAux;
        int contPeliculas=perfilp.contPeliculas(arrayDescarga);
        int contSeries=perfilp.contSeries(arrayDescarga);
        double totalPagadoDolares=0;
        double totalPagadoColones=0;
        
        StringBuilder hilera = new StringBuilder("");
        hilera.append("\nNombre de la cuenta: ").append(this.nombre);
        hilera.append("\nDescargas realizadas por perfil de la cuenta: \n");  
        
        hilera.append(perfilp.toString2(arrayDescarga));
         
        if(!arrayPagosAux.isEmpty()){
            for(Usuario_Pago pago : arrayPagosAux){
                    totalPagadoDolares+=pago.getMontoPagoDolares();
                    totalPagadoColones+=pago.conversionColones(); 
             }
        }else{
            totalPagadoColones+=0;
            totalPagadoDolares+=0;
         }
        
        hilera.append("\nCantidad de peliculas descargadas: ").append(contPeliculas);
        hilera.append("\nCantidad de series descargadas: ").append(contSeries);
        hilera.append("\n");
        int decDolares= Integer.parseInt(formatoDinero.format(totalPagadoDolares).substring(formatoDinero.format(totalPagadoDolares).indexOf('.') + 1));
        int decColones= Integer.parseInt(formatoDinero.format(totalPagadoColones).substring(formatoDinero.format(totalPagadoColones).indexOf('.') + 1));
        
        hilera.append("\nTotal pagado en dolares: ").append("$"+formatoDinero.format(totalPagadoDolares));
        hilera.append( "\n"+Validacion.precioEnLetras((int) totalPagadoDolares) +" DOLARES, CON "
                +Validacion.precioEnLetras(decDolares)+" CENTAVOS\n");
        
        hilera.append("\nTotal pagado en colones: ").append("₡"+formatoDinero.format(totalPagadoColones));
        hilera.append( "\n"+Validacion.precioEnLetras((int)totalPagadoColones) +" COLONES, CON "
                +Validacion.precioEnLetras(decColones)+" CENTAVOS\n");
        
        
        return hilera.toString();
    }
   
    
    public String reporteDescargaCompra(Usuario_Perfil perfilp){
        int contPeliculas=0;
        int contSeries=0;
        double totalPagadoDolares=0;
        double totalPagadoColones=0;
        
        StringBuilder hilera = new StringBuilder("");
        hilera.append("\nNombre de la cuenta: ").append(this.nombre);
        hilera.append("\nDescargas realizadas por perfil de la cuenta: \n");  
         for(Usuario_Perfil perfil : arrayPerfiles){
             if(perfil.getNombre().equalsIgnoreCase(perfilp.getNombre())){
            hilera.append(perfil.toString());
            hilera.append("\n<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>\n");
            contPeliculas+=perfil.contPeliculas();
            contSeries+=perfil.contSeries();
         }
        }
        if(!tarjeta.getArrayPagos().isEmpty()){
            for(Usuario_Pago pago : tarjeta.getArrayPagos()){
                    totalPagadoDolares+=pago.getMontoPagoDolares();
                    totalPagadoColones+=pago.conversionColones(); 
             }
        }else{
            totalPagadoColones+=0;
            totalPagadoDolares+=0;
         }
        hilera.append("\nCantidad de peliculas descargadas: ").append(contPeliculas);
        hilera.append("\nCantidad de series descargadas: ").append(contSeries);
        hilera.append("\nTotal pagado en dolares: ").append("$"+totalPagadoDolares);
        hilera.append( "\n"+Validacion.precioEnLetras((int) totalPagadoDolares) +" DOLARES ");
        hilera.append("\nTotal pagado en colones: ").append("₡"+totalPagadoColones);
        hilera.append( "\n"+Validacion.precioEnLetras((int)totalPagadoColones) +" COLONES ");
        
        
        return hilera.toString();
    }
    
    
}// fin de la clase 
