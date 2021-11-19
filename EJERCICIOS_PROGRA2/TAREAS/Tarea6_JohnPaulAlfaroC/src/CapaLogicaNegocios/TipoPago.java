
package CapaLogicaNegocios;

/**
 *
 * @author johnpaul
 */
public enum TipoPago {
    EFECTIVO{
        @Override
        public String toString() {
            return "Efectivo";
        }
        
    }, TARJETA{
        @Override
        public String toString() {
            return "Tarjeta";
        }
        
    };
}
