
package capaLogica;
//Debe llevar atributo
public enum Extra {
Hongos(100),
Cebolla(50),
Aceitunas(75),
Jamon(25) ,
Queso(100);

private int precio;
private Extra(int preciop){
    this.precio=preciop;
}

    public int getPrecio() {
        return precio;
    }




}
