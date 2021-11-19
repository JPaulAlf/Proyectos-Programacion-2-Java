/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Acceso_Datos;

import Capa_Logica_Negocios.*;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Archivador_Usuarios {
    private static ArrayList<Usuario> arrayUsuarios= new ArrayList();
    
    //Deben haber varios usuarios registrados, entre ellos el "admin", y almenos unos 5 mas, hacerlos con instancia directa
    // Utilizar este metodo, para guardar de una vez algunos de ellos dentro del array list
    public static void llenoArrayUsuarios(){
        arrayUsuarios.add(new UsuarioAdministrativo("Administrador", "admin", "123"));
        arrayUsuarios.add(new UsuarioResidencial("Juan Carlos", "juan11@hotmail.com", "contrasenna", "5390395583964086", TIPO_TARJETA.MASTER_CARD));
        arrayUsuarios.add(new UsuarioCorporativo("Maria Laura", "maria22@hotmail.com", "holamundo", "4485736190468137", TIPO_TARJETA.VISA));
    }
     
    //unicos metodos de este archivador, solo se encarga de engresar los usuarios,
    // siempre que este no exista dentro ya
    public static void agregarUsuario(Usuario usuario){
        // necesita validacion que no exista ya dentro de este array el usuario que se desea registrar
        // hacer la validacion con el nombre o el correo electronico. No pueden haber dos iguales
        // REVISAR QUE FUNCIONE BIEN
        arrayUsuarios.add(usuario);
    }
    public static ArrayList<Usuario> getArrayUsuarios() {
        return arrayUsuarios;
    }
   
    
    
    
}
