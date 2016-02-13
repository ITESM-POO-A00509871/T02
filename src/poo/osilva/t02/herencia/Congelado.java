/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.osilva.t02.herencia;

/**
 *
 * @author A00509871
 */
public class Congelado extends Producto{

    // Atributos
    private final double TEMPERATURA_OPTIMA_C;
    
    /**
     * Constructor
     * @param fechaCaducidad Cadena de caracteres que representa la fecha de caducidad
     * @param noLote Entero que representa el numero de lote
     * @param temperaturaOptimaC double que representa la temperatura óptima de congelación
     *                           del producto
     */
    public Congelado(String fechaCaducidad, int noLote, double temperaturaOptimaC) {
        super(fechaCaducidad, noLote);
        this.TEMPERATURA_OPTIMA_C = temperaturaOptimaC;
    }
    
    /**
     * Método que regresa la temperatura optima de congelacion
     * @return double que representa la temperatura optima de congelación
     */
    public double getTemperaturaOptimaCongelacion(){
        return this.TEMPERATURA_OPTIMA_C;
    }
    
    /**
     * Método que, al ingresar la temperatura actual, te devuelve la diferencia entre
     * temperatura actual a la que esta el producto y la temperatura optima a la que 
     * debería estar
     * @param temperaturaActual double que representa la temperatura actual a la que esta
     *                          el congelado
     * @return La diferencia entre Temperatura Actual - Temperatura Optima
     */
    public double difTemperaturaActualOptima(double temperaturaActual){
        return temperaturaActual - this.TEMPERATURA_OPTIMA_C;
    }

}
