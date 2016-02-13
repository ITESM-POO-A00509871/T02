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
public class Refrigerado extends Producto{

    /**
     * Atributos
     */
    private final double HUMEDAD_OPTIMA;
    
    //Métodos
    /**
     * Constructor
     * @param fechaCaducidad Cadena de Caracteres con fecha de caducidad
     * @param noLote entero con el numero de lote 
     * @param humedadOptima numero que representa el %de humedad óptima para
     *                      refrigerar el producto
     */
    public Refrigerado(String fechaCaducidad, int noLote, double humedadOptima) {
        super(fechaCaducidad, noLote);
        this.HUMEDAD_OPTIMA = humedadOptima;
    }
    
    /**
     * Método que regresa el un double que representa el %de humedad optima
     * @return double que representa el % optimo de humedad al que debe conservarse
     *          el producto
     */
    public double getHumedadOptima(){
        return this.HUMEDAD_OPTIMA;
    }
    
    /**
     * Método que regresa la diferencia entre el % de humedad actual y el % de humedad
     * óptimo al que debe estar el producto
     * @param humedadActual double que representa el % al que esta sometido el producto
     *                      en la actualidad
     * @return 
     */
    public double difHumedadActualOptima(double humedadActual){
        return humedadActual - this.HUMEDAD_OPTIMA;
    }
}
