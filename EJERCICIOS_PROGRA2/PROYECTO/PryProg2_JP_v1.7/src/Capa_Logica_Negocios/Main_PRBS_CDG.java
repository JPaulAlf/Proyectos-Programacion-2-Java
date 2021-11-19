/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import Capa_Acceso_Datos.*;
import java.text.ParseException;
import java.time.LocalDateTime;


/**
 *
 * @author johnpaul
 */
public class Main_PRBS_CDG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
  
        
        

        
          ContenidoAudioVisual contenido = 
                  new ContenidoPelicula(true,"jjj",true,"dsdds","ddsds",LocalDateTime.of(89,04, 1, 1, 1));
        
        System.out.println(contenido.toString());
        System.out.println(contenido.getAnnoCreacion().getYear());
        
        
                System.out.println("******************************************************************");
                System.out.println("Validacion de numeros a letras");
        System.out.println(Validacion.precioEnLetras(1519679));
                System.out.println("******************************************************************");
          String hilera= "02/89";
          String [] array= hilera.split("/");
          System.out.println(array[0]);
          System.out.println(array[1]);
          String mesAux=array[0].replace("0", "");
          System.out.println(mesAux
          );
          System.out.println(LocalDateTime.of(04,8, 1, 1, 1));
          // creacion de instancias para hacer pruebas con  usuarios: 
              Usuario_Tarjeta tarjeta=null;  
        Usuario usuario1= new UsuarioAdministrativo("Administrador", "admin", "123",tarjeta);
        Usuario usuario2=new UsuarioResidencial("Juan Carlos", "juan11@hotmail.com", "contrasenna", tarjeta);
        Usuario usuario3=new UsuarioCorporativo("Maria Laura", "maria22@hotmail.com", "holamundo", tarjeta);
        Usuario_Perfil perfil1=new Usuario_Perfil("JuanVainas1");
        Usuario_Perfil perfil2=new Usuario_Perfil("JuanVainas2");
        Usuario_Perfil perfil3=new Usuario_Perfil("JuanVainas3");
        Usuario_Perfil perfil4=new Usuario_Perfil("JuanVainas4");
        Usuario_Perfil perfil5=new Usuario_Perfil("JuanVainas5");
        
        Archivador_Usuarios.agregarUsuario(usuario3);
        Archivador_Usuarios.agregarUsuario(usuario2);
        Archivador_Usuarios.agregarUsuario(usuario1);
        
        
        System.out.println("");
        System.out.println("******************************************************************");
        System.out.println("Usuario administrador");
        //PRUEBA DE METODOS DE ADMINISTRADOR 06/03/2020
        String contrasenna1= usuario1.getContrasenna();
        String correo1=usuario1.getCorreo();
        System.out.println(usuario1.toString());
        System.out.println("");
        System.out.println("******************************************************************");
        System.out.println("");
        System.out.println("Usuario residenciaal");
        //PRUEBA DE METODOS DE RESIDENCIAL 06/03/2020
         String contrasenna2=usuario2.getContrasenna();
        String correo2=usuario2.getCorreo();
//        ((UsuarioResidencial)usuario2).agregarPerfil(perfil1);
//        ((UsuarioResidencial)usuario2).agregarPerfil(perfil2);
//        ((UsuarioResidencial)usuario2).agregarPerfil(perfil3);
//        ((UsuarioResidencial)usuario2).agregarPerfil(perfil4);
//        ((UsuarioResidencial)usuario2).agregarPerfil(perfil5);
        System.out.println(usuario2.toString());
        
        if(Validacion.validacionTarjeta("5390395583964086", "456", "02", "22", TIPO_TARJETA.MASTER_CARD)){
            System.out.println("Si sirvio el metodo de la tarjeta");
        }else{
            System.out.println("No sirvio el metodo de la tarjeta");
        }
        
        
        System.out.println("******************************************************************");
        System.out.println("");
        System.out.println("Usuario corporativo");
        //PRUEBA DE METODOS DE CORPORATIVO 06/03/2020
         String contrasenna3= usuario3.getContrasenna();
        String correo3=usuario3.getCorreo();
//        ((UsuarioCorporativo)usuario3).agregarPerfil(perfil1);
//         ((UsuarioCorporativo)usuario3).agregarPerfil(perfil2); 
//         ((UsuarioCorporativo)usuario3).agregarPerfil(perfil3);
//          ((UsuarioCorporativo)usuario3).agregarPerfil(perfil4);
//           ((UsuarioCorporativo)usuario3).agregarPerfil(perfil5);
        System.out.println(usuario3.toString());
        if(Validacion.validacionTarjeta("4485736190468137", "456", "02", "22", TIPO_TARJETA.VISA)){
            System.out.println("Si sirvio el metodo de la tarjeta");
        }else{
            System.out.println("No sirvio el metodo de la tarjeta");
        }
        System.out.println("");
        System.out.println("******************************************************************");
        
        System.out.println("Validacion de nuevo usuario y usuario administrativo");
        System.out.println("");
        
        if(Validacion.validacionUsuarioNuevo("admin")){
            System.out.println("Ya existe este usuario");
        }
        System.out.println("");
        if(!Validacion.validacionUsuarioNuevo("ad")){
            System.out.println("AUN NO existe este usuario");
        }
        System.out.println("");
           if(Validacion.validacionUsuarioAdministrador("admin", "123")){
            System.out.println("si es usuario administrador");
        }
           System.out.println("");
          if(!Validacion.validacionUsuarioAdministrador("admin2", "123")){
            System.out.println("NO es usuario administrador");
        }
          System.out.println("");
        System.out.println("******************************************************************");
        System.out.println("Contenido audiovisual");
    //   ContenidoAudioVisual cont1 = new ContenidoPelicula(true,"Silvester Stallone", true, "12-34", "ROCKY 4", LocalDateTime.of(2019,3, 1, 1, 1), true);
//        ContenidoAudioVisual cont2 = new ContenidoSerie(correo3, correo3, LocalDateTime.MIN, 0)
//        ContenidoAudioVisual cont3 = new 
//        ContenidoAudioVisual cont4 = new 
       // System.out.println(cont1.toString());
        
        
           System.out.println("******************************************************************");

    }   

}
           

