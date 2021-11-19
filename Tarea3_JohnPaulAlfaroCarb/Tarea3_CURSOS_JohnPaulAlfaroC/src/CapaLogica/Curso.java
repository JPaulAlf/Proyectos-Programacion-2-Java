
package CapaLogica;

public class Curso {
    private String codigo;
    private String nombre;
    private int costo;
    private TipoCurso tipoCurso;
    
    public Curso(String codigo,String nombre,int costo,TipoCurso tipo){
        this.codigo=codigo;
        this.costo=costo;
        this.nombre=nombre;
        this.tipoCurso=tipo;
    }
    
    public int recargoLaboratorio(){
        int costo=0;
        if(tipoCurso.equals(TipoCurso.Practico)){
            return costo=500;
        }else{
            return costo;
        }
        
    }
    public int costoTotal(){
        return this.recargoLaboratorio()+costo;
    }
    @Override
    public String toString(){
        return this.codigo+" "+this.nombre+" "+this.costo+"\n";
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }
    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
    
}// fin de la clase
