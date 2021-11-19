
package Capa_Logica_Negocios;

import Capa_Acceso_Datos.Archivador_Usuarios;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Validacion implements Serializable{
    // todos los metodos en esta clase son estaticos 
    // ( la ventana unicamente valida nulos, parseos, tablas, radiosButton, y todos aquellos relacionados 
    // (objetos de ventana))
    
    //METODOS QUE DEBEN DE ESTAR EN ESTA CLASE!!!!
    // tarjeta validacion  >>>>>>>>>> LISTO / FALTA PROBARLO******************LISTO
    // cambio de numeros a letras <<EN DESCARGAS DEBE DE SER>>******************LISTO
    
    // inicio de session de usuario******************LISTO
    // clave de admin (validacion de adiministrador)******************LISTO
    // validar el correo electronico******************LISTO
    // validacion del que el contendio aun no exista dentro ******************LISTO
    
    // PENSAR COMO HACER PERSISITENTES LAS DESCARGAS ENTRE LAS VENTANAS
    
    
    
    public static boolean validacionTarjeta(String numTarjeta,String CVV,String mes,String anno,TIPO_TARJETA tipo) throws ParseException{
        String fecha=mes+"/"+anno;
        int longTarjeta=numTarjeta.length();
        int longCVV= CVV.length();
        char a,b,c; 
     switch(tipo){
            case VISA:
                 if(longTarjeta==16 && longCVV==3){      
                     a=numTarjeta.charAt(0);
                     if(a=='4' ){
                             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
                             simpleDateFormat.setLenient(false);
                             Date caducidad = simpleDateFormat.parse(fecha);
                        if(caducidad.after(new Date())){
                              int s1 = 0, s2 = 0;
                                String reversa = new StringBuffer(numTarjeta).reverse().toString();
                                 for(int i = 0 ;i < reversa.length();i++){
                                        int digito = Character.digit(reversa.charAt(i), 10);
                                                  if(i % 2 == 0){
                                                        s1 += digito;
                                                     }else{
                                                       s2 += 2 * digito;
                                               if(digito >= 5){
                                                  s2 -= 9;
                                                }
                                       }
                               }
                                 if((s1+s2)%10==0){
                                        return true;
                                 }
                            }
                       }
                    }else{
                          return false;
                    }
                break;
            case MASTER_CARD:
                 if(longTarjeta==16 && longCVV==3){
                     b=numTarjeta.charAt(0);
                     c= numTarjeta.charAt(1);
                  if(b=='5' && c=='1' || b=='5' && c=='2' || b=='5' && c=='3' || b=='5' && c=='4' || b=='5' && c=='5' ){
                             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
                             simpleDateFormat.setLenient(false);
                            Date caducidad = simpleDateFormat.parse(fecha);
                        if(caducidad.after(new Date())){
                            int s1 = 0, s2 = 0;
                                String reversa = new StringBuffer(numTarjeta).reverse().toString();
                                 for(int i = 0 ;i < reversa.length();i++){
                                        int digito = Character.digit(reversa.charAt(i), 10);
                                                  if(i % 2 == 0){
                                                        s1 += digito;
                                                     }else{
                                                       s2 += 2 * digito;
                                               if(digito >= 5){
                                                  s2 -= 9;
                                                }
                                      }
                             }
                                if((s1+s2)%10==0){
                                    return true;
                            }
                        }
                      }
                      }else{
                     return false;
                  }
                break;
        }
 
    return false;
    }
    
    public static boolean validarFechaTarjeta(String mesVencimiento, String annoVencimiento) throws ParseException{
        String fecha=mesVencimiento+"/"+annoVencimiento;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
        simpleDateFormat.setLenient(false);
        Date caducidad = simpleDateFormat.parse(fecha);
        
        if(caducidad.after(new Date())){
          return true;                  
        }
        return false;
    }
    
    public static boolean validarNumeroTarjeta(String numTarjeta){ 
         int s1 = 0, s2 = 0;
        String reversa = new StringBuffer(numTarjeta).reverse().toString();
             for(int i = 0 ;i < reversa.length();i++){
                    int digito = Character.digit(reversa.charAt(i), 10);
                     if(i % 2 == 0){
                            s1 += digito;
                     }else{
                            s2 += 2 * digito;
                    if(digito >= 5){
                            s2 -= 9;
                     }
                  }
               }
           if((s1+s2)%10==0){
                 return true;
            }
        return false;
    }
    
    public static boolean validarTipoTarjeta(String numTarjeta,String CVV,TIPO_TARJETA tipoTarjeta){
        int longTarjeta=numTarjeta.length();
        int longCVV= CVV.length();
        char a,b,c; 
       switch(tipoTarjeta){
            case VISA:
                 if(longTarjeta==16 && longCVV==3){      
                     a=numTarjeta.charAt(0);
                     if(a=='4' ){ 
                         return true;
                    }
                 }
                break;
            case MASTER_CARD:
                 if(longTarjeta==16 && longCVV==3){
                     b=numTarjeta.charAt(0);
                     c= numTarjeta.charAt(1);
                  if(b=='5' && c=='1' || b=='5' && c=='2' || b=='5' && c=='3' || b=='5' && c=='4' || b=='5' && c=='5' ){
                  return true;
                 }
                 }
                break;
        }
              return false;
    }
    
    public static boolean validacionUsuarioNuevo(String correo){
        for(Usuario usuarios: Archivador_Usuarios.getArrayUsuarios()){
            if(usuarios.getCorreo().equals(correo)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean validacionUsuarioRegularIncioSesion(String correo, String contrasenna){
       for(Usuario usuarioRegular: Archivador_Usuarios.getArrayUsuarios()){
            if(usuarioRegular instanceof UsuarioResidencial || usuarioRegular instanceof UsuarioCorporativo){
            if(usuarioRegular.getCorreo().equals(correo) && usuarioRegular.getContrasenna().equals(contrasenna)){
                return true;
            }
          }
        }
        return false;
    }
    
    public static boolean validacionUsuarioAdministrador(String correo, String contrasenna){
       for(Usuario usuarioRegular: Archivador_Usuarios.getArrayUsuarios()){
            if(usuarioRegular instanceof UsuarioAdministrativo){
            if(usuarioRegular.getCorreo().equals(correo) && usuarioRegular.getContrasenna().equals(contrasenna)){
                return true;
            }
          }
        }
        return false;
    }
    
    public static String precioEnLetras(int num){
        if(num >2000000)
            return "DOS MILLONES";
        
        switch(num){
            case 0: return "CERO";
            case 1: return "UN"; //UNO
            case 2: return "DOS";
            case 3: return "TRES";
            case 4: return "CUATRO";
            case 5: return "CINCO"; 
            case 6: return "SEIS";
            case 7: return "SIETE";
            case 8: return "OCHO";
            case 9: return "NUEVE";
            case 10: return "DIEZ";
            case 11: return "ONCE"; 
            case 12: return "DOCE"; 
            case 13: return "TRECE";
            case 14: return "CATORCE";
            case 15: return "QUINCE";
            case 20: return "VEINTE";
            case 30: return "TREINTA";
            case 40: return "CUARENTA";
            case 50: return "CINCUENTA";
            case 60: return "SESENTA";
            case 70: return "SETENTA";
            case 80: return "OCHENTA";
            case 90: return "NOVENTA";
            case 100: return "CIEN";
            
            case 200: return "DOSCIENTOS";
            case 300: return "TRESCIENTOS";
            case 400: return "CUATROCIENTOS";
            case 500: return "QUINIENTOS";
            case 600: return "SEISCIENTOS";
            case 700: return "SETECIENTOS";
            case 800: return "OCHOCIENTOS";
            case 900: return "NOVECIENTOS";
            
            case 1000: return "MIL";
            
            case 1000000: return "UN MILLON";
            case 2000000: return "DOS MILLONES";
        }
        if(num<20){
            //System.out.println(">15");
            return "DIECI"+ precioEnLetras(num-10);
        }
        if(num<30){
            //System.out.println(">20");
            return "VEINTI" + precioEnLetras(num-20);
        }
        if(num<100){
            //System.out.println("<100"); 
            return precioEnLetras((int)(num/10)*10 ) + " Y " + precioEnLetras(num%10);
        }        
        if(num<200){
            //System.out.println("<200"); 
            return "CIENTO " + precioEnLetras(num - 100 );
        }         
        if(num<1000){
            //System.out.println("<1000");
            return precioEnLetras((int)(num/100)*100 ) + " " + precioEnLetras(num%100);
        } 
        if(num<2000){
            //System.out.println("<2000");
            return "MIL " + precioEnLetras(num % 1000 );
        } 
        if(num<1000000){
            String var="";
            //System.out.println("<1000000");
            var = precioEnLetras((int)(num/1000)) + " MIL" ;
            if(num% 1000!=0){
                //System.out.println(var);
                var += " " + precioEnLetras(num % 1000);
            }
            return var;
        }
        if(num<2000000){
            return "UN MILLON " + precioEnLetras(num % 1000000 );
        } 
        return "";  
    }
    
    public static boolean validacionExistenciaContenido(String cod, String titulo) throws Exception{
        for (ContenidoAudioVisual contenidoAudioVisual : ContenidoAudioVisual.listadoContendio()){
            if(contenidoAudioVisual.getCodigo().equalsIgnoreCase(cod) && contenidoAudioVisual.getTitulo().equalsIgnoreCase(titulo)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean validacionExistenciaTemporada(int numTemporada, ArrayList<Temporada> temporadas) {
        for (Temporada temporada : temporadas) {
            if(temporada.getNumTemporada()==numTemporada){
                return true;
            }
        }
        return false;
    }
    
    public static Usuario retornaUsuario(String correo){
        for (Usuario usuario : Archivador_Usuarios.getArrayUsuarios()) {
            if(usuario.getCorreo().equalsIgnoreCase(correo)){
                return usuario;
            }
        }
        return null;
    }
     
    //==========================================================================================================
    // Metodos que se encargan de actualizar el archivo y el archivador, por cada compra realizada
    public static boolean actualizaCompraUsuario(Usuario usuarioAux, Usuario_Perfil perfilAux){
        int posicionActualUsuario=0;
        int posicionActualPerfil=0;
        
        for (Usuario usuarioActual : Archivador_Usuarios.getArrayUsuarios() ) {
            posicionActualUsuario++;
            
            if(usuarioActual.getCorreo().equalsIgnoreCase(usuarioAux.getCorreo()))
                for (Usuario_Perfil perfilActual : usuarioActual.getArrayPerfiles()) {
                    posicionActualPerfil++;
                    
                    if(perfilActual.getNombre().equalsIgnoreCase(perfilAux.getNombre())){
                        
                        usuarioActual=usuarioAux;
                        usuarioActual.getArrayPerfiles().set(posicionActualPerfil, perfilAux);
                        Archivador_Usuarios.getArrayUsuarios().set(posicionActualUsuario, usuarioActual);
                        return true;
                        
                    }
                }
        }
        return false;
    }   
    
    public static boolean actualizaContenidoAudiovisual(ContenidoAudioVisual contenidop){
        boolean estado=false;
        if(estado==false){
            try {
                  ContenidoAudioVisual.modificarContenidoAudiovisual(contenidop);
//                ContenidoAudioVisual.eliminarContenidoAudiovisual(contenidop.getCodigo());
//                ContenidoAudioVisual.agregarContenidoAudiovisual(contenidop);
            } catch (Exception exception) { }
            estado=true;
        }
        return estado;
    }  
    public static boolean actualizaContenidoAudiovisual2(ContenidoAudioVisual contenidop){
        boolean estado=false;
        if(estado==false){
            try {
                  ContenidoAudioVisual.modificarContenidoAudiovisual(contenidop);
//                ContenidoAudioVisual.eliminarContenidoAudiovisual(contenidop.getCodigo());
//                ContenidoAudioVisual.agregarContenidoAudiovisual(contenidop);
            } catch (Exception exception) { }
            estado=true;
        }
        return estado;
    }
     //==========================================================================================================
    
    
}// fin de la clase 
