/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Acceso_Datos;

import Capa_Logica_Negocios.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class ContenidoAudioVisualBD {
    private final String RUTA_ARCHIVO = System.getProperty("user.dir") + "/src/Archivo/ContenidoAudioVisualBD.txt";
 //   private File f= new File ("ContenidoAudioVisualBD.txt");
    private ObjectOutputStream oEscritor;
    private ObjectInputStream oLector;
    private FileInputStream archivoEntrada;
    private FileOutputStream archivoSalida;
    private ArrayList<ContenidoAudioVisual> contenidoAudioVisualTemp;
    
    //  CONSTRUCTORES // SINGLETON // INSTANCIA UNICA // PERSISTENCIA DE DATOS
    private static ContenidoAudioVisualBD instance=null;
    private ContenidoAudioVisualBD(){
        
    }
    public static ContenidoAudioVisualBD getInstance(){
       
        if(instance==null){
            instance= new  ContenidoAudioVisualBD();
        }
        return instance;
    }
    
    // **********************************************************************************************************************************
    // METODOS QUE SE ENCARGAN DE ABRIR, CERRAR, Y DEVOLVER ARREGLO CON TODO EL CONTENIDO
    // **********************************************************************************************************************************
    
    // Metodos que se encargan de abrir el archivo ya sea para ver el contendio o modificarlo
    /**
     * Abre y retorna el archivo de datos, para escritura (de tipo output) al
     * final del archivo Tipo de Archivo: Secuencial. Lanza la Exception al
     * nivel donde fue llamado
     *
     * @param rutaArchivo String ruta del archivo
     * @return no retorna
     */
    public void abrirArchivoOutput() throws Exception {
        //Abrir el archivo
        try {
            File oArchivo = new File(RUTA_ARCHIVO);
            if (!oArchivo.exists()) {
                //Abrir el archivo de Acceso Secuencial para  escritura
                //La primera vez incluye la cabecera del archivo
                //true indica que se agregarán registros al final            
                archivoSalida = new FileOutputStream(RUTA_ARCHIVO, true);
                oEscritor = new ObjectOutputStream(archivoSalida);
            } else {
                //Abrir el archivo de Acceso Secuencial para  escritura
                //La primera vez incluye la cabecera del archivo
                archivoSalida = new FileOutputStream(RUTA_ARCHIVO, true);
                oEscritor = new MiObjectOutputStream(archivoSalida);
            }
        } catch (Exception e) {
            throw e;
        }
    }
     /**
     * Abre y retorna el archivo de datos, para lectura (de tipo input) El
     * apuntador del archivo se coloca al inicio del archivo Tipo de Archivo:
     * Secuencial.
     *
     * @param rutaArchivo String ruta del archivo
     * @return ObjectInputStream
     */
    public void abrirArchivoInput() throws Exception {
        //Abrir el archivo
        try {
            archivoEntrada = new FileInputStream(RUTA_ARCHIVO);
            oLector = new ObjectInputStream(archivoEntrada);
        } catch (Exception e) {
            throw e;
        }
    }
    
    //metodo que permite cerrar el archivo ya sea el de vista o el de modificar
    /**
     * Permite cerrar el archivo de datos que se abrió de salida
     */
    public void cerrarArchivoOutput() throws Exception {
        try {
            if (oEscritor != null) {
                oEscritor.close();
                oEscritor = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }
    private void cerrarArchivoInput() throws Exception {
        try {
            if (oLector != null) {
                oLector.close();
                oLector = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Lista de todos los Departamentos que se encuentran en el archivo
     *
     * @return ArrayList
     */
    public ArrayList listaContendioAudiovisual() throws Exception {
        ArrayList listaContenidoAudivisual= new ArrayList();
        //Ya que habrá bloque finally se debe encerrar el bloque try
        //el throws del encabezado lanza la excepción del finally      
        try {
            abrirArchivoInput();
            //Si no hay más datos que leer el método available retorna cero
            while (true) {
                ContenidoAudioVisual contenido  = (ContenidoAudioVisual) oLector.readObject();
                listaContenidoAudivisual.add(contenido);
            }
        } //No se indica el catch ya que no se hará nada, solamente se lanzará por medio del throws  
        catch (Exception ex) {

        } finally {
            //Ocurra o no ocurra la excepción se cierra el archivo
            cerrarArchivoInput();
            return listaContenidoAudivisual;
        }

    }
    
    
  //===========================DIVISION DE METODOS========================================
    
    
    // ******************************************************************************************************
    // METODOS QUE SE ENCARGAN DE AGREGAR, MODIFICAR, ELIMINAR, CONSULTAR
    // ******************************************************************************************************
    
    // si no encuentra el objeto devuelve NULL
    public ContenidoAudioVisual consultarContenidoAudiovisual(String codigoDepto) throws Exception {
        ContenidoAudioVisual contenido, contBuscado = null;
        try {
            abrirArchivoInput();
            //Si no hay más datos que leer el método available retorna cero
            while (true) {
                contenido = (ContenidoAudioVisual) oLector.readObject();
                if (contenido.getCodigo().equalsIgnoreCase(codigoDepto)) {
                    contBuscado = contenido;
                }
            }
        } catch (Exception e) {

        } finally { //Suceda o no suceda la excepción se deben cerrar los archivos
            cerrarArchivoInput();
            return contBuscado;
        }

    }
    
    /**
     * Agregar un nuevo Departamento al final del archivo
     *
     * @param contenido
     * @param ContenidoAudioVisual Objeto ContenidoAudioVisual a agregar
     * @return boolean
     */
    public void agregarContenidoAudiovisual(ContenidoAudioVisual contenido) throws Exception {
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {
                //Ejecutar la escritura del objeto pDepartamento en el archivo
                oEscritor.writeObject(contenido);
                oEscritor.flush();  //Envía el contenido del buffer al archivo
                oEscritor.reset();//Se requiere para cuando se reciben subclases de Departamento
            }

        } catch (Exception e) {
            throw e;
        } finally {
            //Ocurra o no la excepción se debe cerrar el archivo
            this.cerrarArchivoOutput(); //Cierra el archivo
        }

    } 
    /**
     * Agregar un nuevo Departamento al archivo
     *
     * @param departamento Objeto Departamento a agregar
     * @return sin retorno
     */
    public void modificarContendioAudiovisual(ContenidoAudioVisual contenido) throws Exception {
        contenidoAudioVisualTemp = new ArrayList<ContenidoAudioVisual>();
        try {
            abrirArchivoInput();
            //Pasar todos los objetos del archivo al ArrayList temporal modificando el 
            //objeto que se recibe como parámetro de acuerdo al código
            ContenidoAudioVisual cont  = null;
            //Si no hay más datos que leer el método available retorna cero
            while (true) {//Si va a leer y no hay objeto Departamento se va por el catch
                cont = (ContenidoAudioVisual) oLector.readObject();
                if (cont.getCodigo().equalsIgnoreCase(contenido.getCodigo())) {
                    cont = contenido;
                }
                contenidoAudioVisualTemp.add(cont);
            }
        } catch (Exception ex) {

        } finally {
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo();
        }

    }
    public void eliminarContenidoAudioVisual(String codigoDepto) throws Exception {
        contenidoAudioVisualTemp = new ArrayList<ContenidoAudioVisual>();
        try {
            abrirArchivoInput();
            ContenidoAudioVisual cont = null;
            //Pasa al ArrayList temporal todos los departamentos cuyo código es 
            //diferente al del departamento que se recibe como parámetro
            while (true) {
                cont = (ContenidoAudioVisual) oLector.readObject();
                if (!cont.getCodigo().equalsIgnoreCase(codigoDepto)) {
                    contenidoAudioVisualTemp.add(cont);
                }
            }
        } catch (Exception e) {

        } finally {
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo();
        }
    }
   private void pasarArrayTemporal_Archivo() throws Exception {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        //Si hay departamentos en el ArrayList y el archivo existe
        //borra el archivo original para volverlo a llenar            

        if (archivoOriginal.exists()) {
            archivoOriginal.delete();
        }
        if (!contenidoAudioVisualTemp.isEmpty()) {
            abrirArchivoOutput();
            //Pasa todos los departamentos del ArrayList al archivo
            for (ContenidoAudioVisual contenido : contenidoAudioVisualTemp) {
                oEscritor.writeObject(contenido);
            }
        }
        cerrarArchivoOutput();
    }
     
   
}// fin de la clase 
