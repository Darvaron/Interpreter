/*
 * Descripción: Nodo terminal número
 * Fecha: 6/03/2020
 * Versión: 1.0
 */

package interpreter;

/**
 *
 * @author David Armando Rodríguez Varón, Juan Sebastián Sánchez Tabares
 */
public class Number implements Expression{

    private float num;

    public Number(float num) {
        this.num = num;
    }
        
    @Override
    public float interpreter() {
        return this.num;
    }

}
