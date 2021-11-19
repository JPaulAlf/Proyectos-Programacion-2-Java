
package Capa_Logica_Negocios;

import Capa_Acceso_Datos.Archivador_Usuarios;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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
    
    //Bandera
    private static boolean bandera=false;
    
    
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
            case 1: return "UN"; 
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
            return "DIECI"+ precioEnLetras(num-10);
        }
        if(num<30){
            return "VEINTI" + precioEnLetras(num-20);
        }
        if(num<100){
            return precioEnLetras((int)(num/10)*10 ) + " Y " + precioEnLetras(num%10);
        }        
        if(num<200){
            return "CIENTO " + precioEnLetras(num - 100 );
        }         
        if(num<1000){
            return precioEnLetras((int)(num/100)*100 ) + " " + precioEnLetras(num%100);
        } 
        if(num<2000){
            return "MIL " + precioEnLetras(num % 1000 );
        } 
        if(num<1000000){
            String var="";
            var = precioEnLetras((int)(num/1000)) + " MIL" ;
            if(num% 1000!=0){
                var += " " + precioEnLetras(num % 1000);
            }
            return var;
        }
        if(num<2000000){
            return "UN MILLON " + precioEnLetras(num % 1000000 );
        } 
        return "";  
    }
    
    public static boolean validacionExistenciaContenido(String cod) throws Exception{
        for (ContenidoAudioVisual contenidoAudioVisual : ContenidoAudioVisual.listadoContendio()){
            if(contenidoAudioVisual.getCodigo().equalsIgnoreCase(cod)){
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
    
    
    // METODO QUE SE ENCARGA DE LLENAR SI ALGUNO DE ESTOS FALTA AL INICIAR EL PROGRAMA NUEVAMENTE
     public static void precargarContendios(){
       if(bandera==false){
           
         bandera=true;
         
         //series
     ContenidoAudioVisual cont1 = new ContenidoSerie("TWD-001","The Walking Dead",LocalDateTime.of(2009,06, 1, 1, 1), false, false);
     cont1.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont1.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont1.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont1.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont1.setGenero(TIPO_GENERO.TERROR);
     ((ContenidoSerie)cont1).agregarTemporada(new Temporada(1, 10));
     ((ContenidoSerie)cont1).agregarTemporada(new Temporada(2, 15));
     ((ContenidoSerie)cont1).agregarTemporada(new Temporada(3, 20));
     ((ContenidoSerie)cont1).agregarTemporada(new Temporada(4, 25));
     
     ContenidoAudioVisual cont2 = new ContenidoSerie("BKB-002","Breaking Bad",LocalDateTime.of(2015,07, 1, 1, 1), true, false);
     cont2.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont2.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont2.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont2.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont2.setGenero(TIPO_GENERO.ACCION);
     ((ContenidoSerie)cont2).agregarTemporada(new Temporada(1, 10));
     ((ContenidoSerie)cont2).agregarTemporada(new Temporada(2, 10));
     ((ContenidoSerie)cont2).agregarTemporada(new Temporada(3, 10));
     ((ContenidoSerie)cont2).agregarTemporada(new Temporada(4, 25));
     
     ContenidoAudioVisual cont3 = new ContenidoSerie("CDP-003","La casa de papel",LocalDateTime.of(2020,04, 1, 1, 1), true, true);
     cont3.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont3.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont3.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont3.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont3.setGenero(TIPO_GENERO.DRAMA);
     ((ContenidoSerie)cont3).agregarTemporada(new Temporada(1, 10));
     ((ContenidoSerie)cont3).agregarTemporada(new Temporada(2, 10));
     ((ContenidoSerie)cont3).agregarTemporada(new Temporada(3, 10));
     ((ContenidoSerie)cont3).agregarTemporada(new Temporada(4, 10));  
     
     ContenidoAudioVisual cont7 = new ContenidoSerie("GRA-007","Greys Anatomy",LocalDateTime.of(2011,06, 1, 1, 1), false, false);
     cont7.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont7.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont7.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont7.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont7.setGenero(TIPO_GENERO.DRAMA);
     ((ContenidoSerie)cont7).agregarTemporada(new Temporada(1, 10));
     ((ContenidoSerie)cont7).agregarTemporada(new Temporada(2, 15));
     ((ContenidoSerie)cont7).agregarTemporada(new Temporada(3, 20));
     ((ContenidoSerie)cont7).agregarTemporada(new Temporada(4, 25));
     
     ContenidoAudioVisual cont8 = new ContenidoSerie("DRK-008","Dark",LocalDateTime.of(2017,07, 1, 1, 1), true, false);
     cont8.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont8.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont8.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont8.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont8.setGenero(TIPO_GENERO.SUSPENSO);
     ((ContenidoSerie)cont8).agregarTemporada(new Temporada(1, 10));
     ((ContenidoSerie)cont8).agregarTemporada(new Temporada(2, 10));
     ((ContenidoSerie)cont8).agregarTemporada(new Temporada(3, 10));
     ((ContenidoSerie)cont8).agregarTemporada(new Temporada(4, 25));
     
     ContenidoAudioVisual cont9 = new ContenidoSerie("PRB-009","Prision Break",LocalDateTime.of(2005,02, 1, 1, 1), true, true);
     cont9.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont9.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont9.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont9.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont9.setGenero(TIPO_GENERO.ACCION);
     ((ContenidoSerie)cont9).agregarTemporada(new Temporada(1, 10));
     ((ContenidoSerie)cont9).agregarTemporada(new Temporada(2, 10));
     ((ContenidoSerie)cont9).agregarTemporada(new Temporada(3, 10));
     ((ContenidoSerie)cont9).agregarTemporada(new Temporada(4, 10));  
     
        //peliculas
     ContenidoAudioVisual cont4 = new ContenidoPelicula(true,"Martin Scorsese", false,"JMJ-004","Jumanji",LocalDateTime.of(2020,04, 1, 1, 1));
     cont4.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont4.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont4.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont4.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont4.setGenero(TIPO_GENERO.ACCION);
     
     ContenidoAudioVisual cont5 = new ContenidoPelicula(true,"Steven Spielberg", true,"KNK-005","King Kong",LocalDateTime.of(2020,02, 1, 1, 1));
     cont5.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont5.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont5.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont5.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont5.setGenero(TIPO_GENERO.TERROR);
     
     ContenidoAudioVisual cont6 = new ContenidoPelicula(true,"John Lasseter", false,"IRM-006","Iron Man 1",LocalDateTime.of(2009,03, 1, 1, 1));
     cont6.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont6.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont6.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont6.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont6.setGenero(TIPO_GENERO.ACCION);
     
     ContenidoAudioVisual cont10 = new ContenidoPelicula(true,"Martin Scorsese", false,"RLO-010","Rey Leon 1",LocalDateTime.of(2020,04, 1, 1, 1));
     cont10.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont10.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont10.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont10.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont10.setGenero(TIPO_GENERO.ACCION);
     
     ContenidoAudioVisual cont11 = new ContenidoPelicula(true,"Steven Spielberg", true,"MTX-011","Matrix",LocalDateTime.of(2020,02, 1, 1, 1));
     cont11.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont11.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont11.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont11.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont11.setGenero(TIPO_GENERO.TERROR);
     
     ContenidoAudioVisual cont12 = new ContenidoPelicula(true,"John Lasseter", false,"LVD-012","Los Vengadores 1",LocalDateTime.of(2009,03, 1, 1, 1));
     cont12.agregarIdioma(TIPOS_IDIOMAS.INGLES);
     cont12.agregarIdioma(TIPOS_IDIOMAS.ESPANNOL_LATINOAMERICA);
     cont12.agregarIdioma(TIPOS_IDIOMAS.SUBTITULADA_ESPANNOL);
     cont12.agregarIdioma(TIPOS_IDIOMAS.CHINO);
     cont12.setGenero(TIPO_GENERO.ACCION);
     
        ArrayList<ContenidoAudioVisual> contenidos= new ArrayList();
        contenidos.add(cont1);
        contenidos.add(cont2);
        contenidos.add(cont3);
        contenidos.add(cont4);
        contenidos.add(cont5);
        contenidos.add(cont6);
        contenidos.add(cont7);
        contenidos.add(cont8);
        contenidos.add(cont9);
        contenidos.add(cont10);
        contenidos.add(cont11);
        contenidos.add(cont12);
        
         for (ContenidoAudioVisual contenido : contenidos) {
             try {
                 if (validacionExistenciaContenido(contenido.getCodigo()) == false) {
                     ContenidoAudioVisual.agregarContenidoAudiovisual(contenido);
                 }
             } catch (Exception exception) { }
         }
           System.out.println("*");
       }
        }
  
     
    
     
     
}// fin de la clase 
